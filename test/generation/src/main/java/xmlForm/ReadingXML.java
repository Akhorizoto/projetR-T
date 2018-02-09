package xmlForm;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class ReadingXML {




	public static List<String> lire(String path) throws Exception{

		List<String> ret = new ArrayList<>();
		SAXBuilder sxb = new SAXBuilder();
		Document doc = sxb.build(new File(path));
		Element racine = doc.getRootElement().getChild("node");
//		System.out.println(racine.getChild("label").getText());
		recur(racine,ret);

		return ret;
	}


	public static ArrayList<String> selecPater(String path) throws Exception{
		List<Element> ret = new ArrayList<>();
		ArrayList<String> list = new ArrayList<>();
		SAXBuilder sxb = new SAXBuilder();
		Document doc = sxb.build(new File(path));
		Element racine = doc.getRootElement().getChild("node");
		firstDef(racine, ret);

		Iterator<Element> i = ret.iterator();
		while (i.hasNext()) {
			Element element = (Element) i.next();
			
			namesPat(element, list);
		}
//		for (int j = 0; j < list.size(); j++) {
//			System.out.println(list.get(j));
//		}
		return list;

	}


	public static void namesPat(Element racine, List<String>list){
		List<?> l = racine.getChildren("node");
		Iterator<?> i = l.iterator();
		while (i.hasNext()) {
			Element element = (Element) i.next();
			Element lb = element.getChild("label");
			if ((lb.getText().equals("depends"))||(lb.getText().equals("alternative"))||(lb.getText().equals("benifits"))
					||(lb.getText().equals("impairs"))||(lb.getText().equals("."))||(lb.getText().equals(""))||(lb.getText().equals("and"))){
			}
			else{
				if (!list.contains(lb.getText()))
				list.add(lb.getText());
				//System.out.println(lb.getText());
			}
			List<?> l1 = element.getChildren("node");
			if(!l1.isEmpty()){
				namesPat(element, list);
			}
		}


	}


	public static void firstDef(Element racine,List<Element>list) {
		List<?> l = racine.getChildren("node");
		Iterator<?> i = l.iterator();
		while (i.hasNext()) {
			Element elt = (Element) i.next();
			//System.out.println(elt.getAttributes());
			//if(elt.getAttribute("switchRole")!=null) System.out.println(elt.getAttribute("switchRole").getValue());
			if (elt.getAttribute("switchRole")!=null){
				list.add(elt);
			}


			//List<?> l1 = elt.getChildren("node");
			if (!elt.getChildren("node").isEmpty()){
				firstDef(elt, list);
			}

		}

	}


	public static String getTreeName(String path) throws Exception{


		SAXBuilder sxb = new SAXBuilder();
		Document doc = sxb.build(new File(path));
		Element racine = doc.getRootElement().getChild("node");
		String ret = racine.getChild("label").getText();

		return ret;

	}


	public static List<?> recur(Element racine,List<String>list) {
		List<?> l = racine.getChildren("node");
		Iterator<?> i = l.iterator();
		while (i.hasNext()) {
			Element elt = (Element) i.next();
			Element elt1 = elt.getChild("label");
			if(elt1.getText().contains("CAPEC")){
				System.out.println(elt1.getText().substring(6));
				if (!list.contains(elt1.getText().substring(6)))list.add(elt1.getText().substring(6));
			}
			List<?> l1 = elt.getChildren("node");
			if (!l1.isEmpty()){
				recur(elt,list);
			}

		}
		return l;
	}

	public static void main (String[] args){

		try {
			//			List<String>l = lire("test.xml");
			//			Iterator<?> i = l.iterator();
			//			while (i.hasNext()) {
			//				System.out.println(i.next());
			//
			//			}

			selecPater("rootFil.xml");
System.out.println("-------------------------------------------");
			lire("rootFil.xml");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}




}
