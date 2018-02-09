package data;

import java.util.ArrayList;

public class pattern {
	
	private String name;
	private ArrayList<Relation> rel;
	private ArrayList<String> consequences;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ArrayList<Relation> getRel() {
		return rel;
	}


	public void setRel(ArrayList<Relation> rel) {
		this.rel = rel;
		
	}
	
	public ArrayList<String> getConsequences() {
		return consequences;
	}


	public void addconseq(String c) {
		if (c!=null){
			this.consequences.add(c);
		}
	}
	public pattern(String name, ArrayList<Relation> rel) {
		super();
		this.name = name;
		this.rel = new ArrayList<>();
		this.consequences = new ArrayList<>();
	}


	public void addrel(Relation r) {
		if (r != null){
		boolean b = false;
		for (int i=0;i<this.rel.size();i++){
			if (this.rel.get(i).getPattern().equals(r.pattern)){b=true;}
		}
		if (!b){
			this.rel.add(r);
		}
		}
	}
}
