package launcher;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import project.ProjectCreate;
import xmlForm.Node;
import xmlForm.ReadingXML;

public class Main {

	

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new FileReader("Ids.csv"));
		Conseq cc = new Conseq();
		cc.mainy();
		
		
	  String line = null;
		Scanner scanner = null;
		int index = 0;
		int compt=0;
		
		DocumentBuilderFactory dbFactory =
				DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = 
				dbFactory.newDocumentBuilder();
		Document doc = dBuilder.newDocument();
		Element rootElement = doc.createElement("adtree");
		doc.appendChild(rootElement);
		/*
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String input = "";
		while (!input.equals("q")){
			System.out.println("Enter CAPEC-ID (enter q to end):");
			input= sc.nextLine();
			if (!input.equals("q")){
				attacks.add(input);
				attacksTree.add("trees/"+input+".xml");
			}
		
		
		}
		System.out.println("What is the name of the tree ?");
		
		Sys
		String per = sc.nextLine();*/
		
		System.out.println("supply the path to the initial ADTree");
		
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
		System.out.println("-----------------------------------------------------------");
		
		
		
		List<String> l = ReadingXML.lire(path);
		String per = ReadingXML.getTreeName(path);
		Element rac = Node.createNode(doc, per+"compl", "conjunctive", "no");
		rootElement.appendChild(rac);
		Iterator<?> it = l.iterator();
		/*for (int i = 0; i < attacks.size(); i++) {
			Element elt = Node.hierStruct(attacks.get(i), doc);
			rac.appendChild(elt);
		}*/
		while (it.hasNext()) {
			Element elt = Node.hierStruct((String) it.next(), doc);
			rac.appendChild(elt);
		}
		
		Node.writeXML(doc, per+"Compl");
		
		System.out.println("Generated tree written in :"+per+"Compl.xml");
		System.out.println("Select the chosen patterns from the tree");
		System.out.println("when you finich supply the path to the modified tree");
		path = sc.nextLine();
		System.out.println("-----------------------------------------------------------");
		List<String> l1 = ReadingXML.lire(path);
		String per2 = ReadingXML.getTreeName(path);
		
		String p = ProjectCreate.create("test");
		Iterator<String> it1 = l1.iterator();
		
		while (it1.hasNext()) {
			Node.hierStruct2( it1.next(), doc, p);
			
		}
		//Node.mergeTrees(per, attacksTree);
//		FeaturesGen2 gen = new FeaturesGen2();
//		while ((line = reader.readLine()) != null) {
//			scanner = new Scanner(line);
//			scanner.useDelimiter(";");
//			while (scanner.hasNext()) {
//				String data = scanner.next();
//				compt++;
//				System.out.println("Attack "+compt+"/133");
//				if (index == 0) gen.mainy(data, "");
//				
//			}
//			
//		}
		
	}
}