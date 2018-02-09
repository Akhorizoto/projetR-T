package data;

import java.util.ArrayList;

public class phase {
	
	private String id;
	private String name;
	private ArrayList<Step> step;
	
	
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


	public ArrayList<Step> getStep() {
		return step;
	}

	public phase(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.step = new ArrayList<>();
	}
	
	public void addstep(Step s) {
		int x=-1;
		if (s != null){
			String n = s.getName();
			for (int i=0;i<this.step.size();i++){
				if (this.step.get(i).getName().equals(n)){
					x=i;
				}
			}
			if (x<0){
				this.step.add(s);
			}
			else {
				for (int j=0;j<s.getPatt().size();j++){
					this.step.get(x).addpatt(s.getPatt().get(j));
				}
				for (int k=0;k<s.getTech().size();k++){
					this.step.get(x).addtech(s.getTech().get(k));
				}
			}
		}
		
	}
	

}
