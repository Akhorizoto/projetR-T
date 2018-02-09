package launcher;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.io.FileUtils;
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



public class FeaturesGen3 {

	String ttt;



	public FeaturesGen3() {
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


	

		
		//Phases
		for(int i=0;i<att.getPhases().size();i++){
			
			//Steps
			for(int j=0;j<att.getPhases().get(i).getStep().size();j++){
			

			

				String str =  att.getPhases().get(i).getStep().get(j).getName();
				str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
				String str2= "CAPEC_"+capecid+"_Step_"+att.getPhases().get(i).getId()+"_"+att.getPhases().get(i).getStep().get(j).getId()+".feature";
				if(!str2.equals("")){
				FileUtils.copyFileToDirectory(new File("src/test/java/features/"+str2), new File(path+"/src/test/java/features/"));
				}
				if(!str.equals(""))
				
				FileUtils.copyFileToDirectory(new File("src/test/java/steps/"+str+".java"), new File(path+"/src/test/java/steps/"));
				


			}
		}
	}
}
