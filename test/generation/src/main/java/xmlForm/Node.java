package xmlForm;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import data.cat;
import launcher.FeaturesGen;
import launcher.FeaturesGen2;
import launcher.FeaturesGen3;
public class Node {



	public static boolean isConc(String catID) throws Exception{
		boolean b = false;
		@SuppressWarnings("resource")
		BufferedReader reader = new BufferedReader(new FileReader("Ids.csv"));
		String line = null;
		Scanner scanner = null;
		int index = 0;

		ArrayList<String> list = new ArrayList<>();
		while ((line = reader.readLine()) != null) {
			scanner = new Scanner(line);
			scanner.useDelimiter(";");
			while (scanner.hasNext()) {
				String data = scanner.next();

				if (index == 0) list.add(data);
			}
		}
		if (list.contains(catID)) b = true;

		return b;
	}


	public static Element hierStruct(String catID, Document doc) throws Exception{
		@SuppressWarnings("resource")
		BufferedReader reader = new BufferedReader(new FileReader("hierarchical.csv"));
		Element caXML = null;
		FeaturesGen gen = new FeaturesGen();
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
		caXML = createNode(doc, "CAPEC-"+catID, "disjunctive", "no");
		try {

			// root element
			cat ca = new cat(catID);

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
				//	System.out.println(cat+"|"+lev1+"|"+lev2+"|"+pat1+"|"+op1+"|"+rel1+"|"+lev3+"|"+pat2+"|"+op2+"|"+rel2+"|"+lev4+"|"+pat3+"|"+op3+"|"+rel3);
				//	System.out.println("_______________________________________");
				cat l1 = new cat(lev1);
				cat l2 = new cat(lev2);
				cat p1 = new cat(pat1);
				cat l3 = new cat(lev3);
				cat p2 = new cat(pat2);
				cat l4 = new cat(lev4);
				cat p3 = new cat(pat3);	

				if ((cat.equals(catID))||(lev1.equals(catID))){
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
			if(Node.isConc(catID)){
				Document atta = gen.mainy(catID);
				org.w3c.dom.Node fils2root = atta.getFirstChild().getFirstChild();
				org.w3c.dom.Node fils2root2 = doc.importNode(fils2root, true);
				caXML= (Element) fils2root2;
				System.out.println("CAPEC-"+catID);
			}
			
			//Level 1
			for (int i = 0; i < ca.getLev1().size(); i++) {
				Element l1XML = createNode(doc, "CAPEC-"+ca.getLev1().get(i).getName(), "disjunctive", "no");
				System.out.println("1** CAPEC-"+ca.getLev1().get(i).getName());
				//Level 2
				for (int j = 0; j < ca.getLev1().get(i).getLev1().size(); j++) {
					System.out.println("2**** CAPEC-"+ca.getLev1().get(i).getLev1().get(j).getName());
					Element l2XML = createNode(doc, "CAPEC-"+ca.getLev1().get(i).getLev1().get(j).getName(), "disjunctive", "no");
					if (isConc(ca.getLev1().get(i).getLev1().get(j).getName())) {
						Document fils2 = gen.mainy(ca.getLev1().get(i).getLev1().get(j).getName());
						org.w3c.dom.Node fils2root = fils2.getFirstChild().getFirstChild();
						org.w3c.dom.Node fils2root2 = doc.importNode(fils2root, true);
						l2XML.appendChild(fils2root2);
					}
					
					//Level 3
					for (int k = 0; k < ca.getLev1().get(i).getLev1().get(j).getLev1().size(); k++) {
						System.out.println("3****** CAPEC-"+ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getName());
						Element l3XML= createNode(doc, "CAPEC-"+ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getName(), "disjunctive", "no");
						if (isConc(ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getName())){
							Document fils3 = gen.mainy(ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getName());
							org.w3c.dom.Node fils3root = fils3.getFirstChild().getFirstChild();
							org.w3c.dom.Node fils3root2 = doc.importNode(fils3root, true);
							l3XML.appendChild(fils3root2);
							
						}
						//Level 4
						for (int l = 0; l < ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getLev1().size(); l++) {
							System.out.println("4******** CAPEC-"+ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getLev1().get(l).getName());
							Element l4XML = createNode(doc, "CAPEC-"+ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getLev1().get(l).getName(), "disjunctive", "no");
							if (isConc(ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getLev1().get(l).getName())){
								Document fils4 = gen.mainy(ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getLev1().get(l).getName());
								org.w3c.dom.Node fils4root = fils4.getFirstChild().getFirstChild();
								org.w3c.dom.Node fils4root2 = doc.importNode(fils4root, true);
								l4XML.appendChild(fils4root2);
								
							}
							
							l3XML.appendChild(l4XML);
						}

						l2XML.appendChild(l3XML);
					}

					l1XML.appendChild(l2XML);
				}

				caXML.appendChild(l1XML);

			}

		}catch (Exception e) {
			e.printStackTrace();
		}


		return caXML;
	}
	public static void hierStruct2(String catID, Document doc, String path) throws Exception{
		@SuppressWarnings("resource")
		BufferedReader reader = new BufferedReader(new FileReader("hierarchical.csv"));
		Element caXML = null;
		FeaturesGen3 gen = new FeaturesGen3();
		
		
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
		caXML = createNode(doc, "CAPEC-"+catID, "disjunctive", "no");
		try {

			// root element
			cat ca = new cat(catID);

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
				//	System.out.println(cat+"|"+lev1+"|"+lev2+"|"+pat1+"|"+op1+"|"+rel1+"|"+lev3+"|"+pat2+"|"+op2+"|"+rel2+"|"+lev4+"|"+pat3+"|"+op3+"|"+rel3);
				//	System.out.println("_______________________________________");
				cat l1 = new cat(lev1);
				cat l2 = new cat(lev2);
				cat p1 = new cat(pat1);
				cat l3 = new cat(lev3);
				cat p2 = new cat(pat2);
				cat l4 = new cat(lev4);
				cat p3 = new cat(pat3);	

				if ((cat.equals(catID))||(lev1.equals(catID))){
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
			if(Node.isConc(catID)){
//				Document atta = 
						gen.mainy(catID, path);
//				org.w3c.dom.Node fils2root = atta.getFirstChild().getFirstChild();
//				org.w3c.dom.Node fils2root2 = doc.importNode(fils2root, true);
//				caXML= (Element) fils2root2;
				System.out.println("CAPEC-"+catID);
			}
			
			//Level 1
			for (int i = 0; i < ca.getLev1().size(); i++) {
				Element l1XML = createNode(doc, "CAPEC-"+ca.getLev1().get(i).getName(), "disjunctive", "no");
				System.out.println("1** CAPEC-"+ca.getLev1().get(i).getName());
				//Level 2
				for (int j = 0; j < ca.getLev1().get(i).getLev1().size(); j++) {
					System.out.println("2**** CAPEC-"+ca.getLev1().get(i).getLev1().get(j).getName());
					Element l2XML = createNode(doc, "CAPEC-"+ca.getLev1().get(i).getLev1().get(j).getName(), "disjunctive", "no");
					if (isConc(ca.getLev1().get(i).getLev1().get(j).getName())) {
//						Document fils2 = 
								gen.mainy(ca.getLev1().get(i).getLev1().get(j).getName(), path);
//						org.w3c.dom.Node fils2root = fils2.getFirstChild().getFirstChild();
//						org.w3c.dom.Node fils2root2 = doc.importNode(fils2root, true);
//						l2XML.appendChild(fils2root2);
					}
					
					//Level 3
					for (int k = 0; k < ca.getLev1().get(i).getLev1().get(j).getLev1().size(); k++) {
						System.out.println("3****** CAPEC-"+ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getName());
						Element l3XML= createNode(doc, "CAPEC-"+ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getName(), "disjunctive", "no");
						if (isConc(ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getName())){
//							Document fils3 = 
									gen.mainy(ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getName(), path);
//							org.w3c.dom.Node fils3root = fils3.getFirstChild().getFirstChild();
//							org.w3c.dom.Node fils3root2 = doc.importNode(fils3root, true);
//							l3XML.appendChild(fils3root2);
							
						}
						//Level 4
						for (int l = 0; l < ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getLev1().size(); l++) {
							System.out.println("4******** CAPEC-"+ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getLev1().get(l).getName());
							Element l4XML = createNode(doc, "CAPEC-"+ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getLev1().get(l).getName(), "disjunctive", "no");
							if (isConc(ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getLev1().get(l).getName())){
//								Document fils4 = 
										gen.mainy(ca.getLev1().get(i).getLev1().get(j).getLev1().get(k).getLev1().get(l).getName(), path);
//								org.w3c.dom.Node fils4root = fils4.getFirstChild().getFirstChild();
//								org.w3c.dom.Node fils4root2 = doc.importNode(fils4root, true);
//								l4XML.appendChild(fils4root2);
								
							}
							
//							l3XML.appendChild(l4XML);
						}

//						l2XML.appendChild(l3XML);
					}

//					l1XML.appendChild(l2XML);
				}

//				caXML.appendChild(l1XML);

			}

		}catch (Exception e) {
			e.printStackTrace();
		}


//		return caXML;
	}


	public static boolean isAbst(String catID) throws Exception{
		@SuppressWarnings("resource")
		BufferedReader reader = new BufferedReader(new FileReader("hierarchical.csv"));
		boolean b = false;

		// read file line by line
		String line = null;
		Scanner scanner = null;
		int index = 0;
		String cat = null;
		String lev1 = null;
		try {
			while ((line = reader.readLine()) != null) {
				scanner = new Scanner(line);
				scanner.useDelimiter(";");
				while (scanner.hasNext()) {
					String data = scanner.next();
					if (index == 0)
						cat = data;
					else if (index == 1)
						lev1 = data;

					index++;
				}
				index = 0;
				//	System.out.println(cat+"|"+lev1+"|"+lev2+"|"+pat1+"|"+op1+"|"+rel1+"|"+lev3+"|"+pat2+"|"+op2+"|"+rel2+"|"+lev4+"|"+pat3+"|"+op3+"|"+rel3);
				//	System.out.println("_______________________________________");

				if ((cat.equals(catID))||(lev1.equals(catID))){
					b= true;
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}



	public static Element createNode(Document doc, String label, String refinement, String swich) throws Exception{


		Element elt = doc.createElement("node");
		Attr attrType = doc.createAttribute("refinement");
		attrType.setValue(refinement);
		elt.setAttributeNode(attrType);
		if (swich.equals("yes")){
			attrType = doc.createAttribute("switchRole");
			attrType.setValue("yes");
			elt.setAttributeNode(attrType);
		}
		Element label1 = doc.createElement("label");
		label1.appendChild(doc.createTextNode(label));
		elt.appendChild(label1);
		return elt;

	}

	public static void writeXML(Document doc,String name ) throws TransformerException{

		TransformerFactory transformerFactory =
				TransformerFactory.newInstance();
		Transformer transformer =
				transformerFactory.newTransformer();

		DOMSource source = new DOMSource(doc);
		StreamResult result =
				new StreamResult(new File(name+".xml"));
		transformer.transform(source, result);
	} 


	public static Element rePatterns(Document doc, String name1, String name2, String nature) throws Exception{
		Element rel = doc.createElement("node");
		Element label = doc.createElement("label");
		label.appendChild(doc.createTextNode(nature));
		rel.appendChild(label);
		Attr attrType = doc.createAttribute("refinement");
		if (nature.equals("impairs"))
		{
			attrType.setValue("disjunctive");
			rel.setAttributeNode(attrType);
			Element p1 = createNode(doc, name1, "disjunctive", "no"); 
			Element p2 = createNode(doc, name2, "disjunctive", "no");
			rel.appendChild(p1);
			rel.appendChild(p2);
			Element po = createNode(doc, "potential attack", "conjunctive", "yes");
			Element fand = createNode(doc, "and", "conjunctive", "yes");

			Element pp1 = createNode(doc, name1, "disjunctive", "no"); 
			Element pp2 = createNode(doc, name2, "disjunctive", "no");
			fand.appendChild(pp1);
			fand.appendChild(pp2);
			po.appendChild(fand);
			rel.appendChild(po);
		}


		else{
			if (nature.equals("alternative")) attrType.setValue("disjunctive");
			else if ((nature.equals("benifits")) || (nature.equals("depends")) )
				attrType.setValue("conjunctive");
			rel.setAttributeNode(attrType);
			Element p1 = createNode(doc, name1, "disjunctive", "no"); 
			Element p2 = createNode(doc, name2, "disjunctive", "no");
			rel.appendChild(p1);
			rel.appendChild(p2);
		}


		return rel;


	}
	public static void mergeTrees(String name, ArrayList<String> files) throws Exception{

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.newDocument();
		Element rootElement = doc.createElement("adtree");
		doc.appendChild(rootElement);

		Element test = createNode(doc, name, "Conjunctive", "no");
		rootElement.appendChild(test);
		for (int i=0; i<files.size();i++){
			Document document = builder.parse(files.get(i));
			org.w3c.dom.Node d1 = document.getFirstChild().getFirstChild();
			org.w3c.dom.Node dd1 = doc.importNode(d1, true);
			test.appendChild(dd1);
		}
		writeXML(doc, name);
	}



	public static void main(String[] args) throws Exception{
		DocumentBuilderFactory dbFactory =
				DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = 
				dbFactory.newDocumentBuilder();
		Document doc = dBuilder.newDocument();
		Element elt = hierStruct("244", doc);
		Element rootElement = doc.createElement("adtree");
		doc.appendChild(rootElement);
		rootElement.appendChild(elt);
		writeXML(doc, "hier");
		
	}
}
