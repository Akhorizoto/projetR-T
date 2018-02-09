package launcher;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import data.pattern;

public class Conseq {
	@SuppressWarnings("static-access")
	public Conseq() {
		// TODO Auto-generated constructor stub
		this.plist=new ArrayList<>();
	}
	static ArrayList<pattern> plist= new ArrayList<>();
	
	public static void addp(pattern p) {
		if (p!=null){
			int x =-1;
			String n = p.getName();
			for (int i =0;i<plist.size();i++){
				if (plist.get(i).getName().equals(n)) x=i;
			}
			
			if (x<0) plist.add(p);
			else {
				for (int j=0;j<p.getConsequences().size();j++ ){
					plist.get(x).addconseq(p.getConsequences().get(j));
				}	
			}
		}
		
	}
	public  void mainy() throws IOException {
		String s = "\"";
		BufferedReader reader = new BufferedReader(new FileReader("conseq.csv"));
		String line = null;
		Scanner scanner = null;
		int index = 0;
		String pattern=null;
		String consequence=null;
		BufferedWriter bw = null;
		FileWriter fw = new FileWriter("src/test/java/steps/"+"PatternSteps.java");
		bw = new BufferedWriter(fw);
		try {
		bw.write("package steps;");	
		bw.newLine();
		bw.write("import cucumber.api.java.en.Then;");
		bw.newLine();
		bw.write("public class "+"PatternSteps"+" {");
		bw.newLine();
		while ((line = reader.readLine()) != null) {
			scanner = new Scanner(line);
			scanner.useDelimiter(";");
			while (scanner.hasNext()) {
				String data = scanner.next();
				
				if (index == 0)
					pattern =data;
				else if (index==1)
					consequence = data;
				index++;
			}
			index=0;
			pattern p = new pattern(pattern.toLowerCase(), null);
			p.addconseq(consequence);
			addp(p);
			
		}
		
		for (int i=0;i<plist.size();i++){
			
			//System.out.println(i+"  "+plist.get(i).getName());
			//Then assert the consequences of the pattern "+Paatern
			String str = plist.get(i).getName().replaceAll("[^a-zA-Z]", "").toLowerCase();
			bw.write("@Then("+s+"assert the consequences of the pattern "+plist.get(i).getName()+s+")");
			bw.newLine();
			bw.write("public void ass"+str+"(){");
			bw.newLine();
			
			for (int j=0;j<plist.get(i).getConsequences().size();j++){
				//System.out.println("     "+i+"  "+j+"  "+plist.get(i).getConsequences().get(j));
				bw.write("// in order to test the presence of "+plist.get(i).getName()+" pattern");
				bw.newLine();
				bw.write("//try to assert one of the following consequences :");
				bw.newLine();
				bw.newLine();
				bw.write("    //"+plist.get(i).getConsequences().get(j));
				bw.newLine();
			}
			bw.write("}");
			bw.newLine();
		}
		bw.write("}");
		bw.newLine();
		} catch (IOException e) {

			e.printStackTrace();

		} finally {



			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

				

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
	}
}
