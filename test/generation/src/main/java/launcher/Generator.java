package launcher;
/*******************************************************************************************************
This is a ADtree generator
Developed by Loukmen REGAINIA

Usage : Generator CAPEC-ID
The adtree is generated in home directory of the project
********************************************************************************************************/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


import java.util.Scanner;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


import data.cat;
public class Generator {

	public static void main(String[] args) throws IOException {
		// open file input stream
		long startTime = System.currentTimeMillis();


		String catID = args[0];
		BufferedReader reader = new BufferedReader(new FileReader("hierarchical.csv"));


		// read file line by line
		String line = null;
		Scanner scanner = null;
		int index = 0;
		String cat = null;
		String lev1 = null;
		String lev2 = null;
		String pat1 = null;
		String op1 = null;
		String rel1 = null;
		String lev3 = null;
		String pat2 = null;
		String op2 = null;
		String rel2 = null;
		String lev4 = null;
		String pat3 = null;
		String op3 = null;
		String rel3 = null;


		Element level1 = null;
		Element level2 = null;
		Element level3 = null;
		try {
			DocumentBuilderFactory dbFactory =
					DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = 
					dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();
			// root element
			Element rootElement = doc.createElement("adtree");
			doc.appendChild(rootElement);
			Element category = doc.createElement("node");

			cat ca = new cat(catID);

			Attr attrType = doc.createAttribute("refinement");
			category.setAttributeNode(attrType);
			attrType.setValue("disjunctive");
			Element label = doc.createElement("label");
			label.appendChild(doc.createTextNode(catID));
			category.appendChild(label);



			while ((line = reader.readLine()) != null) {

				scanner = new Scanner(line);
				scanner.useDelimiter(";");
				while (scanner.hasNext()) {
					String data = scanner.next();






					if (index == 0)
						cat = data;
					else if (index == 1)
						lev1 = data;
					else if (index == 2)
						lev2 = data;
					else if (index == 3)
						pat1 = data;
					else if (index == 4)
						op1 = data;
					else if (index == 5)
						rel1 = data;
					else if (index == 6)
						lev3 = data;
					else if (index == 7)
						pat2 = data;
					else if (index == 8)
						op2 = data;
					else if (index == 9)
						rel2 = data;
					else if (index == 10)
						lev4 = data;
					else if (index == 11)
						pat3 = data;
					else if (index == 12)
						op3 = data;
					else if (index == 13)
						rel3 = data;

					index++;

				}
				index = 0;
				//											System.out.println(cat+"|"+lev1+"|"+lev2+"|"+pat1+"|"+op1+"|"+rel1+"|"+lev3+"|"+pat2+"|"+op2+"|"+rel2+"|"+lev4+"|"+pat3+"|"+op3+"|"+rel3);
				//				System.out.println("_______________________________________");
				cat l1 = new cat(lev1);
				cat l2 = new cat(lev2);
				cat p1 = new cat(pat1);

				cat l3 = new cat(lev3);
				cat p2 = new cat(pat2);

				cat l4 = new cat(lev4);
				cat p3 = new cat(pat3);	


				if ((cat.equals(catID))||(lev1.equals(catID))||(lev2.equals(catID))||(lev3.equals(catID))||(lev4.equals(catID))){
					p3.addRel(rel3, op3);
					l4.addEltP(p3);
					l3.addElt1(l4);
					p2.addRel(rel2, op2);
					l3.addEltP(p2);
					l2.addElt1(l3);
					p1.addRel(rel1, op1);
					l2.addEltP(p1);
					l1.addElt1(l2);
					ca.addElt1(l1);
				}

			}

			//first level
			for (int i = 0; i<ca.getLev1().size();i++){
				System.out.println(ca.getName());
				System.out.println("l1  "+ca.getLev1().get(i).getName());

				level1 = doc.createElement("node");
				attrType = doc.createAttribute("refinement");
				attrType.setValue("disjunctive");
				level1.setAttributeNode(attrType);
				Element label1 = doc.createElement("label");
				label1.appendChild(doc.createTextNode(ca.getLev1().get(i).getName()));
				level1.appendChild(label1);

				//second level
				for (int j = 0; j<ca.getLev1().get(i).getLev1().size();j++){

					System.out.println("  l2  "+ca.getLev1().get(i).getLev1().get(j).getName());
					level2 = doc.createElement("node");
					attrType = doc.createAttribute("refinement");
					attrType.setValue("disjunctive");
					level2.setAttributeNode(attrType);

					Element label2 = doc.createElement("label");
					label2.appendChild(doc.createTextNode(ca.getLev1().get(i).getLev1().get(j).getName()));
					level2.appendChild(label2);
					Element patt1 = doc.createElement("node");

					attrType = doc.createAttribute("refinement");
					attrType.setValue("conjunctive");
					patt1.setAttributeNode(attrType);

					attrType = doc.createAttribute("switchRole");
					attrType.setValue("yes");
					patt1.setAttributeNode(attrType);
					Element labelp1 = doc.createElement("label");
					labelp1.appendChild(doc.createTextNode("."));
					patt1.appendChild(labelp1);
					//second level patterns
					for (int x = 0; x<ca.getLev1().get(i).getLev1().get(j).getPat().size();x++){
						int a=0;
						System.out.println("    "+ca.getLev1().get(i).getLev1().get(j).getPat().get(x).getName());
						//second level related patterns
						int xxx=0;
						for (a = 0; a<ca.getLev1().get(i).getLev1().get(j).getPat().get(x).getRel().size();a++){
							System.out.println(ca.getLev1().get(i).getLev1().get(j).getPat().get(x).getRel().get(a).getNature()+"  222222   "+ca.getLev1().get(i).getLev1().get(j).getPat().get(x).getRel().get(a).getPattern());
							xxx ++;

							Element repatt1 = doc.createElement("node");

							attrType = doc.createAttribute("refinement");
							attrType.setValue(ca.getLev1().get(i).getLev1().get(j).getPat().get(x).getRel().get(a).getNature());
							repatt1.setAttributeNode(attrType);
							Element relabelp1 = doc.createElement("label");
							relabelp1.appendChild(doc.createTextNode("."));
							repatt1.appendChild(relabelp1);

							Element repatt11 = doc.createElement("node");
							attrType = doc.createAttribute("refinement");
							attrType.setValue("conjunctive");
							repatt11.setAttributeNode(attrType);
							Element labelp11 = doc.createElement("label");
							labelp11.appendChild(doc.createTextNode(ca.getLev1().get(i).getLev1().get(j).getPat().get(x).getName()));
							repatt11.appendChild(labelp11);
							repatt1.appendChild(repatt11);

							Element repatt12 = doc.createElement("node");
							attrType = doc.createAttribute("refinement");
							attrType.setValue("conjunctive");
							repatt12.setAttributeNode(attrType);
							Element labelp12 = doc.createElement("label");
							labelp12.appendChild(doc.createTextNode(ca.getLev1().get(i).getLev1().get(j).getPat().get(x).getRel().get(a).getPattern()));
							repatt12.appendChild(labelp12);
							repatt1.appendChild(repatt12);

							patt1.appendChild(repatt1);


						}
						System.out.println("LEVEL 2 *********"+xxx);
						if (xxx==0){
							Element patt11 = doc.createElement("node");

							attrType = doc.createAttribute("refinement");
							attrType.setValue("conjunctive");
							patt11.setAttributeNode(attrType);
							Element labelp11 = doc.createElement("label");
							labelp11.appendChild(doc.createTextNode(ca.getLev1().get(i).getLev1().get(j).getPat().get(x).getName()));
							patt11.appendChild(labelp11);

							patt1.appendChild(patt11);
						}
					}
					level2.appendChild(patt1);

					//third level
					for (int k = 0; k<ca.getLev1().get(i).getLev1().get(j).getLev1().size();k++){

						System.out.println("    l3  "+ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getName());
						level3 = doc.createElement("node");
						attrType = doc.createAttribute("refinement");
						attrType.setValue("disjunctive");
						level3.setAttributeNode(attrType);
						Element label3 = doc.createElement("label");
						label3.appendChild(doc.createTextNode(ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getName()));
						level3.appendChild(label3);
						Element patt2 = doc.createElement("node");
						Element labelp2 = doc.createElement("label");
						labelp2.appendChild(doc.createTextNode("."));
						patt2.appendChild(labelp2);

						attrType = doc.createAttribute("refinement");
						attrType.setValue("conjunctive");
						patt2.setAttributeNode(attrType);
						attrType = doc.createAttribute("switchRole");
						attrType.setValue("yes");
						patt2.setAttributeNode(attrType);
						//third level patterns
						for (int y = 0; y<ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getPat().size();y++){

							System.out.println("      "+ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getPat().get(y).getName());
							int b;


							//third level related patterns
							int xxx =0;
							for (b = 0; b<ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getPat().get(y).getRel().size();b++){

								System.out.println(ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getPat().get(y).getRel().get(b).getNature()+"  33333333  "+ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getPat().get(y).getRel().get(b).getPattern());
								xxx++;

								Element repatt1 = doc.createElement("node");

								attrType = doc.createAttribute("refinement");
								attrType.setValue(ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getPat().get(y).getRel().get(b).getNature());
								repatt1.setAttributeNode(attrType);
								Element relabelp1 = doc.createElement("label");
								relabelp1.appendChild(doc.createTextNode("."));
								repatt1.appendChild(relabelp1);

								Element repatt11 = doc.createElement("node");
								attrType = doc.createAttribute("refinement");
								attrType.setValue("conjunctive");
								repatt11.setAttributeNode(attrType);
								Element labelp11 = doc.createElement("label");
								labelp11.appendChild(doc.createTextNode(ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getPat().get(y).getName()));
								repatt11.appendChild(labelp11);
								repatt1.appendChild(repatt11);

								Element repatt12 = doc.createElement("node");
								attrType = doc.createAttribute("refinement");
								attrType.setValue("conjunctive");
								repatt12.setAttributeNode(attrType);
								Element labelp12 = doc.createElement("label");
								labelp12.appendChild(doc.createTextNode(ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getPat().get(y).getRel().get(b).getPattern()));
								repatt12.appendChild(labelp12);
								repatt1.appendChild(repatt12);

								patt2.appendChild(repatt1);


							}
							System.out.println("LEVEL3 *********"+xxx);
							if (xxx==0){
								Element patt21 = doc.createElement("node");
								attrType = doc.createAttribute("refinement");
								attrType.setValue("conjunctive");
								patt21.setAttributeNode(attrType);
								Element labelp21 = doc.createElement("label");
								labelp21.appendChild(doc.createTextNode(ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getPat().get(y).getName()));
								patt21.appendChild(labelp21);
								patt2.appendChild(patt21);}

						}
						level3.appendChild(patt2);
						//fourth level
						for (int l = 0; l<ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getLev1().size();l++){

							System.out.println("      l4  "+ ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getLev1().get(l).getName());
							Element level4 = doc.createElement("node");
							attrType = doc.createAttribute("refinement");
							attrType.setValue("disjunctive");
							level4.setAttributeNode(attrType);
							Element label4 = doc.createElement("label");
							label4.appendChild(doc.createTextNode(ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getLev1().get(l).getName()));
							level4.appendChild(label4);
							level3.appendChild(level4);
							Element patt3 = doc.createElement("node");
							attrType = doc.createAttribute("refinement");
							attrType.setValue("conjunctive");
							patt3.setAttributeNode(attrType);

							attrType = doc.createAttribute("switchRole");
							attrType.setValue("yes");
							patt3.setAttributeNode(attrType);

							Element labelp3 = doc.createElement("label");
							labelp3.appendChild(doc.createTextNode("."));
							patt3.appendChild(labelp3);
							//fourth level patterns
							for (int z =0;z<ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getLev1().get(l).getPat().size();z++){
								System.out.println(ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getLev1().get(l).getPat().get(z).getName());
								int xxx=0;
								//fourth level related patterns
								for (int c =0;c<ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getLev1().get(l).getPat().get(z).getRel().size();c++){
									System.out.println(ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getLev1().get(l).getPat().get(z).getRel().get(c).getNature()+"  444444  "+ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getLev1().get(l).getPat().get(z).getRel().get(c).getPattern());
									xxx++;
									Element repatt1 = doc.createElement("node");

									attrType = doc.createAttribute("refinement");
									attrType.setValue(ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getLev1().get(l).getPat().get(z).getRel().get(c).getNature());
									repatt1.setAttributeNode(attrType);
									Element relabelp1 = doc.createElement("label");
									relabelp1.appendChild(doc.createTextNode("."));
									repatt1.appendChild(relabelp1);

									Element repatt11 = doc.createElement("node");
									attrType = doc.createAttribute("refinement");
									attrType.setValue("conjunctive");
									repatt11.setAttributeNode(attrType);
									Element labelp11 = doc.createElement("label");
									labelp11.appendChild(doc.createTextNode(ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getLev1().get(l).getPat().get(z).getName()));
									repatt11.appendChild(labelp11);
									repatt1.appendChild(repatt11);

									Element repatt12 = doc.createElement("node");
									attrType = doc.createAttribute("refinement");
									attrType.setValue("conjunctive");
									repatt12.setAttributeNode(attrType);
									Element labelp12 = doc.createElement("label");
									labelp12.appendChild(doc.createTextNode(ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getLev1().get(l).getPat().get(z).getRel().get(c).getPattern()));
									repatt12.appendChild(labelp12);
									repatt1.appendChild(repatt12);

									patt3.appendChild(repatt1);


								}
								if (xxx==0){
									Element patt31 = doc.createElement("node");
									attrType = doc.createAttribute("refinement");
									attrType.setValue("conjunctive");
									patt31.setAttributeNode(attrType);
									Element labelp31 = doc.createElement("label");
									labelp31.appendChild(doc.createTextNode(ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getLev1().get(l).getPat().get(z).getName()));
									patt31.appendChild(labelp31);
									patt3.appendChild(patt31);
								}
							}
							level4.appendChild(patt3);
						}
						level2.appendChild(level3);
					}
					level1.appendChild(level2);
				}
				category.appendChild(level1);
			}




			rootElement.appendChild(category);
			//close reader
			reader.close();
			// write the content into xml file
			TransformerFactory transformerFactory =
					TransformerFactory.newInstance();
			Transformer transformer =
					transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result =
					new StreamResult(new File(catID+".xml"));
			transformer.transform(source, result);
			// Output to console for testing
			//			StreamResult consoleResult =
			//					new StreamResult(System.out);
			//			transformer.transform(source, consoleResult);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);

	}

}