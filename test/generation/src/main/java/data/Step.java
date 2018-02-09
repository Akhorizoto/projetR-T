package data;

import java.util.ArrayList;

public class Step {

	private String id;
	private String name;
	private ArrayList<tech> tech;
	private ArrayList<outcome> outcome;
	private ArrayList<indicator> indicator;
	private ArrayList<pattern> patt;
	private String desc;

	public Step(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.tech = new ArrayList<>();
		this.patt = new ArrayList<>();
		this.outcome= new ArrayList<>();
		this.indicator = new ArrayList<>();
	}


	

	public String getDesc() {
		return desc;
	}




	public void setDesc(String desc) {
		this.desc = desc;
	}




	public ArrayList<outcome> getOutcome() {
		return outcome;
	}




	public void setOutcome(ArrayList<outcome> outcome) {
		this.outcome = outcome;
	}




	public ArrayList<indicator> getIndicator() {
		return indicator;
	}




	public void setIndicator(ArrayList<indicator> indicator) {
		this.indicator = indicator;
	}




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

	public ArrayList<tech> getTech() {
		return tech;
	}

	public void setTech(ArrayList<tech> tech) {
		this.tech = tech;
	}

	public ArrayList<pattern> getPatt() {
		return patt;
	}

	public void setPatt(ArrayList<pattern> patt) {
		this.patt = patt;
	}
	public void addoutcome(outcome o) {
		if (o !=null){
			int ex = this.outcome.indexOf(o);
			if (ex<0){this.outcome.add(o);}
		}

	}
	public void addindicator(indicator ii) {
		if (ii!=null){
			String ee = ii.getDesc();
			boolean b = false;
			for (int i=0;i<this.indicator.size();i++){
				if (ee.equals(this.indicator.get(i).getDesc())) b = true; 
			}
			if (!b) this.indicator.add(ii);
		}		
	}

	public void addtech(tech t) {
		if (t != null){
			String ee = t.getName();
			boolean b = false;
			for (int i=0;i<this.tech.size();i++){
				if (ee.equals(this.tech.get(i).getName())) b = true; 
			}

			if (! b){
				this.tech.add(t);
			}
		}
	}
	public void addpatt(pattern p) {
		int x = -1;
		if (p != null){
			String n = p.getName();
			for(int i=0; i<this.patt.size();i++){
				if (this.patt.get(i).getName().equals(n)){
					x=i;
				}
			}
			if (x<0){this.patt.add(p);}
			else {
				for (int j=0; j<p.getRel().size();j++){
					this.patt.get(x).addrel(p.getRel().get(j));
				}
			}
		}
	}
	

}
