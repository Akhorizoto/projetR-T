package data;
/*******************************************************************************************************
This is a ADtree generator
Developed by Loukmen REGAINIA

Usage : Generator CAPEC-ID
The adtree is generated in home directory of the project
********************************************************************************************************/
import java.util.ArrayList;

public class cat {
	String name;
	cat parent; 
	ArrayList<cat>lev;
	ArrayList<cat> pat;
	ArrayList<Relation> rel;

	public ArrayList<cat> getPat() {
		return pat;
	}
	public void setPat(ArrayList<cat> pat) {
		this.pat = pat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<cat> getLev1() {
		return lev;
	}
	public void setLev1(ArrayList<cat> lev1) {
		this.lev = lev1;
	}
	public int exist (cat c){
		if ((c!=null)){
			String lab=c.name;
			for (int i=0; i< this.lev.size();i++){
				if (lev.get(i).name.equals(lab)) return i;
			}
		}
		return -1;

	}
	public int existP (cat c){
		if ((c!=null)){
			String lab=c.name;
			for (int i=0; i< this.pat.size();i++){
				if (this.pat.get(i).getName().equals(lab)) return i;
			}
		}
		return -1;

	}

	public void addEltP(cat c) {
		if (c!=null){
			int x = this.existP(c);
			if ((x<0)&&(!c.name.equals("")))
				this.pat.add(c);

			else if ((x>=0)&&(!c.name.equals(""))){
				//this.pat.get(x).addRel(c.getRel().get(0).getPattern(), c.getRel().get(0).getNature());
				for (int i=0 ;i< c.getRel().size();i++){
					this.pat.get(x).addRel(c.getRel().get(i).getPattern(), c.getRel().get(i).getNature());
				}
				
			}
		}
	}

	public void addElt1(cat c) {
		if (c!=null){
			int id = this.exist(c);
			if (id<0){
				lev.add(c);
				c.setParent(this);
			}
			else {
				for (int i=0; i<c.lev.size();i++) {
					c.lev.get(i).setParent(this.lev.get(id));
					this.lev.get(id).addElt1(c.lev.get(i));

				}
				for (int j=0; j<c.pat.size();j++) {
					c.pat.get(j).setParent(this.lev.get(id));
					this.lev.get(id).addEltP(c.pat.get(j));

				}
			}
		}
	}


	public void addRel(String c, String nat){
		if ((c!=null)&&(!nat.equals(""))){
			Relation r = new Relation(c, nat);
			boolean t = false;
			for (int i=0; i<this.rel.size();i++){
				if ((this.rel.get(i).getNature().equals(nat))&&((this.rel.get(i).getPattern().equals(c)))) t=true;
			}
			if (!t){
			
			this.rel.add(r);
			}
		}
	}



	public ArrayList<Relation> getRel() {
		return rel;
	}
	public void setRel(ArrayList<Relation> rel) {
		this.rel = rel;
	}
	public cat getParent() {
		return parent;
	}
	public void setParent(cat parent) {
		this.parent = parent;
	}
	public cat(String name) {
		super();
		this.name = name;
		this.lev = new ArrayList<cat>();
		this.pat = new ArrayList<cat>();
		this.rel = new ArrayList<Relation>();

	}






}
