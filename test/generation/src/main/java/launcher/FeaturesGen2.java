package launcher;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import data.Filter;
import data.Relation;
import data.Step;
import data.attack;
import data.indicator;
import data.outcome;
import data.pattern;
import data.phase;
import data.tech;
import xmlForm.Node;
import xmlForm.ReadingXML;



public class FeaturesGen2 {

	String ttt;



	public FeaturesGen2() {
		super();
	}




	public void mainy(String args, String path) throws Exception {
	//public static void main(String[] args) throws Exception {	
	// open file input stream
		
		String capecid = args;
		@SuppressWarnings("resource")
		BufferedReader reader = new BufferedReader(new FileReader("attacks.csv"));
		//ArrayList<String> patternsList= ReadingXML.selecPater(path);
		
		attack att = new attack(capecid);

		// read file line by line
		String line = null;
		Scanner scanner = null;
		int index = 0;
		String id = null;
		String name = null;
		String phid = null;
		String ph = null;
		String stid = null;
		String st = null;
		String sp = null;
		String nat = null;
		String relsp = null;
		String techid = null;
		String tec = null;
		String outctype = null;
		String outcdesc = null;
		String indid = null;
		String indtype = null;
		String inddesc = null;
		String resou = null;
		String prereq = null;
		String stedesc = null;


		while ((line = reader.readLine()) != null) {

			scanner = new Scanner(line);
			scanner.useDelimiter(";;");
			while (scanner.hasNext()) {
				String data = scanner.next();


				if (index == 0)
					id = data;
				else if (index == 1)
					name = data;
				else if (index == 2)
					resou = data;
				else if (index == 3)
					prereq = data;
				else if (index == 4)
					phid = data;
				else if (index == 5)
					ph = data;
				else if (index == 6)
					stid = data;
				else if (index == 7)
					st = data;
				else if (index == 8)
					sp = data;
				else if (index == 9)
					nat = data;
				else if (index == 10)
					relsp = data;
				else if (index == 11)
					outctype = data;
				else if (index == 12)
					outcdesc = data;
				else if (index == 13)
					indid = data;
				else if (index == 14)
					indtype = data;
				else if (index == 15)
					inddesc = data;
				else if (index == 16)
					techid = data;
				else if (index == 17)
					tec = data;
				else if (index == 18)
					stedesc = data;


				index++;
			}
			index = 0;


			phase pha = new phase(phid, ph);

			Step step = new Step(stid, st);
			tech techn = new data.tech(techid, tec);
			pattern patt = new pattern(sp.toLowerCase(), null);
			Relation r = new Relation(relsp.toLowerCase(),nat);
			outcome ou = new outcome(outctype, outcdesc);
			indicator ind = new indicator(indid, indtype, inddesc);

			if (id.equals(capecid)){
				att.setName(name);
				att.setResor(resou);
				att.addpreq(prereq);
				patt.addrel(r);
				step.setDesc(stedesc);
				step.addindicator(ind);
				step.addoutcome(ou);
				step.addtech(techn);
				step.addpatt(patt);
				pha.addstep(step);
				att.addphase(pha);
			}
		}


		BufferedWriter bw = null;
		BufferedWriter bw1 =null;
		FileWriter fw = null;
		FileWriter fw1 =null;
		int comp = 0;

//		/***************************    XML    *****************************/
//
//		DocumentBuilderFactory dbFactory =
//				DocumentBuilderFactory.newInstance();
//		DocumentBuilder dBuilder = 
//				dbFactory.newDocumentBuilder();
//		Document doc = dBuilder.newDocument();
//		// root element
//		Element rootElement = doc.createElement("adtree");
//		doc.appendChild(rootElement);
//		Element elt = Node.createNode(doc, "CAPEC-"+att.getId(), "conjunctive", "no");
//		rootElement.appendChild(elt);
//		/***************************    XML    *****************************/
		//Phases
		for(int i=0;i<att.getPhases().size();i++){
//			/***************************    XML    *****************************/
//			Element elt1 = Node.createNode(doc, att.getPhases().get(i).getName(), "conjunctive", "no");
//			elt.appendChild(elt1);
//			/***************************    XML    *****************************/
			//Steps
			for(int j=0;j<att.getPhases().get(i).getStep().size();j++){
//				/***************************    XML    *****************************/
//				Element elt2 = Node.createNode(doc, att.getPhases().get(i).getStep().get(j).getName(), "disjunctive", "no");
//				elt1.appendChild(elt2);
//				Element paXML = Node.createNode(doc, ".", "conjunctive", "yes");
//				elt2.appendChild(paXML);
//				/***************************    XML    *****************************/
				comp++;
				//System.out.println("Step: "+comp);
				try {
					String str =  att.getPhases().get(i).getStep().get(j).getName();
					str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
					fw = new FileWriter("Gen/"+"CAPEC_"+capecid+"_Step_"+att.getPhases().get(i).getId()+"_"+att.getPhases().get(i).getStep().get(j).getId()+".feature");
					fw1 = new FileWriter("Gen/"+str+".java");
					bw = new BufferedWriter(fw);
					bw1 = new BufferedWriter(fw1);

					//System.out.println("@capec"+capecid);
					bw.write("@capec"+capecid);
					bw.newLine();
					//System.out.println("Feature: CAPEC-"+att.getId()+": "+att.getName());
					bw.write("Feature: CAPEC-"+att.getId()+": "+att.getName());
					bw.newLine();

					//bw1.write("import cucumber.api.java.en.And;");
					//bw1.newLine();
					bw1.write("import cucumber.api.java.en.Given;");
					bw1.newLine();
					bw1.write("import cucumber.api.java.en.Then;");
					bw1.newLine();
					bw1.write("import cucumber.api.java.en.When;");
					bw1.newLine();
					bw1.newLine();
					bw1.newLine();
					bw1.write("// "+att.getPhases().get(i).getStep().get(j).getDesc());
					bw1.newLine();
					bw1.newLine();
					bw1.write("public class "+str+" {");
					bw1.newLine();



					//System.out.println("#"+att.getPhases().get(i).getId()+"."+" "+att.getPhases().get(i).getName());
					bw.write("#"+att.getPhases().get(i).getId()+"."+" "+att.getPhases().get(i).getName());
					bw.newLine();


					//System.out.println("Scenario: Step"+att.getPhases().get(i).getId()+"."+att.getPhases().get(i).getStep().get(j).getId()+" "+
					//	att.getPhases().get(i).getStep().get(j).getName());
					bw.write("Scenario: Step"+att.getPhases().get(i).getId()+"."+att.getPhases().get(i).getStep().get(j).getId()+" "+att.getPhases().get(i).getStep().get(j).getName());
					bw.newLine();
					//TODO
					String s = "\"";

					bw.write("Given prepare to "+att.getPhases().get(i).getStep().get(j).getName());
					bw.newLine();


					bw1.write("@Given("+s+"prepare to "+att.getPhases().get(i).getStep().get(j).getName()+s+ ")" );
					bw1.newLine();
					bw1.write("public void pre"+str+"(){");
					bw1.newLine();
					bw1.write("// "+att.getResor());
					bw1.newLine();
					for (int re=0; re<att.getPrereq().size();re++){
						String ree = att.getPrereq().get(re);
						bw1.write("// "+ree);
						bw1.newLine();
					}
					bw1.write("}");
					bw1.newLine();

					bw.write("When Try to "+att.getPhases().get(i).getStep().get(j).getName());
					bw.newLine();
					bw1.write("@When("+s+"Try to "+att.getPhases().get(i).getStep().get(j).getName()+s+")");
					bw1.newLine();
					bw1.write("public void try"+str+"(){");
					bw1.newLine();
					bw1.write("//  Try one of the following techniques :");
					bw1.newLine();
					//technics
					for (int t =0;t<att.getPhases().get(i).getStep().get(j).getTech().size();t++){
//						/***************************    XML    *****************************/
//						String techID = att.getPhases().get(i).getId()+"."+att.getPhases().get(i).getStep().get(j).getId()+"."+att.getPhases().get(i).getStep().get(j).getTech().get(t).getId();
//						Element tecXML = Node.createNode(doc,techID, "disjunctive", "no");
//						elt2.appendChild(tecXML);
//
//						/***************************    XML    *****************************/

						String ttec = att.getPhases().get(i).getStep().get(j).getTech().get(t).getName();
						String itec = att.getPhases().get(i).getStep().get(j).getTech().get(t).getId();
						bw1.write("   //"+itec+".  "+ttec);
						bw1.newLine();


					}
					bw1.write("}");


					bw.write("# assertion for attack step success");
					bw.newLine();
					bw.write("Then"+" Assert the success of "+att.getPhases().get(i).getStep().get(j).getName());
					bw.newLine();

					bw1.write("@Then("+s+"Assert the success of "+att.getPhases().get(i).getStep().get(j).getName()+s+")");
					bw1.newLine();
					bw1.write("public void ass"+str+"(){");
					bw1.newLine();
					bw1.write("//  Assert one of the following indications :");
					bw1.newLine();
					//outcomes
					for (int o =0; o<att.getPhases().get(i).getStep().get(j).getOutcome().size();o++){
						String outn = att.getPhases().get(i).getStep().get(j).getOutcome().get(o).getName();
						String outi = att.getPhases().get(i).getStep().get(j).getOutcome().get(o).getType();
						if (outi.equals("Success")) {
							bw1.write("   //  -"+outn);
							bw1.newLine();
						}
					}

					//indicators
					for (int in=0;in<att.getPhases().get(i).getStep().get(j).getIndicator().size();in++ ){
						String indn = att.getPhases().get(i).getStep().get(j).getIndicator().get(in).getDesc();
						String indt = att.getPhases().get(i).getStep().get(j).getIndicator().get(in).getType();
						if (indt.equals("Positive")){
							bw1.write("    "+ "//  -"+indn);
							bw1.newLine();
						}
					}
					bw1.write("}");
					bw1.newLine();


					bw.write("#assertions for security pattern testing (checker whether the pattern consequences are observed)");
					bw.newLine();

					//patterns
					ArrayList<Filter> sss = new ArrayList<>();
					for(int pa=0;pa<att.getPhases().get(i).getStep().get(j).getPatt().size();pa++){
						String Paatern = att.getPhases().get(i).getStep().get(j).getPatt().get(pa).getName();
						//if (patternsList.contains(Paatern)){
							
							
//						/***************************    XML    *****************************/
//						if (att.getPhases().get(i).getStep().get(j).getPatt().get(pa).getRel().size()==1){
//							if (Paatern!=null){
//							Element paternXML = Node.createNode(doc, Paatern, "conjunctive", "no");
//							paXML.appendChild(paternXML);
//							}
//						}
//
//
//						/***************************    XML    *****************************/

						bw.write("Then assert the consequences of the pattern "+Paatern);
						bw.newLine();
						//related patterns
						for (int rel=0;rel<att.getPhases().get(i).getStep().get(j).getPatt().get(pa).getRel().size();rel++){
							String nature = att.getPhases().get(i).getStep().get(j).getPatt().get(pa).getRel().get(rel).getNature();
							String relPattern = att.getPhases().get(i).getStep().get(j).getPatt().get(pa).getRel().get(rel).getPattern();
							//filter patterns first level
							boolean bb = false;
							for (int fil =0; fil<att.getPhases().get(i).getStep().get(j).getPatt().size();fil++){
								if (att.getPhases().get(i).getStep().get(j).getPatt().get(fil).getName().equals(relPattern)){
									bb = true;
								}
							}
							if (bb){

//								/***************************    XML    *****************************/
//								boolean filt = false;
//								for (int fil=0; fil<sss.size();fil++){
//									if ((sss.get(fil).p2.equals(Paatern))&&(sss.get(fil).rel.equals(nature)))
//									filt = true;}
//									if (!filt){
//										if (Paatern!=null){
//										Element relationXML = Node.rePatterns(doc, Paatern, relPattern, nature);
//										paXML.appendChild(relationXML);
//										Filter f = new Filter(Paatern, relPattern, nature);
//										sss.add(f);
//										}
//									}
//								
//								/***************************    XML    *****************************/

								//System.out.println("----------"+Paatern+" "+nature+" "+relPattern);
								bw.write("           #"+" "+nature+" "+relPattern);
								bw.newLine();
							}
						}

					//	}
					}


					bw1.write("}");
//					Node.writeXML(doc, "trees/"+att.getId());
				} catch (IOException e) {

					e.printStackTrace();

				} finally {



					try {

						if (bw != null)
							bw.close();

						if (fw != null)
							fw.close();

						if (bw1 != null)
							bw1.close();

						if (fw1 != null)
							fw1.close();

					} catch (IOException ex) {

						ex.printStackTrace();

					}

				}
			}

		}
//		return doc;




	}
}
