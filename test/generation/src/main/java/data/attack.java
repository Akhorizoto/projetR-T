package data;

import java.util.ArrayList;

public class attack {


	private String id;
	private String name;
	private ArrayList<phase> phases;
	private ArrayList<String> prereq;
	private String resor;

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	

	public ArrayList<String> getPrereq() {
		return prereq;
	}


	public void setPrereq(ArrayList<String> prereq) {
		this.prereq = prereq;
	}


	public String getResor() {
		return resor;
	}


	public void setResor(String resor) {
		this.resor = resor;
	}


	public ArrayList<phase> getPhases() {
		return phases;
	}


	public void setPhases(ArrayList<phase> phases) {
		this.phases = phases;
	}


	public attack(String id) {
		super();
		this.id = id;
		this.phases = new ArrayList<>();
		this.prereq = new ArrayList<>();

	}
public void addpreq(String preq) {
	if (preq!=null){
		boolean b = false;
		for (int i=0;i<this.prereq.size();i++){
			if (this.prereq.get(i).equals(preq)) b=true;
		}
		if (!b) this.prereq.add(preq);
	}
}

	public void addphase(phase p) {
		int x = -1;
		if (p!=null){
			String n = p.getName();
			
			for (int i=0;i<this.phases.size();i++){
				if (this.phases.get(i).getName().equals(n)){
					x=i;
				}
			}
			if (x<0){this.phases.add(p);}
			else {
				for (int j=0;j<p.getStep().size();j++){
					this.phases.get(x).addstep(p.getStep().get(j));
				}
			}
		}
	}


}
