package data;
/*******************************************************************************************************
This is a ADtree generator
Developed by Loukmen REGAINIA

Usage : Generator CAPEC-ID
The adtree is generated in home directory of the project
********************************************************************************************************/
public class Relation {

	String pattern;
	String nature;


	public Relation(String pattern, String nature) {
		super();
		if (pattern != null ){
		this.pattern = pattern;
		this.nature= nature;
		/*if (nature.equals("alternative"))
		this.nature = "or";
		else if ((nature.equals("benifits")) || (nature.equals("depends")) )
			this.nature = "and";
		else if (nature.equals("impairs"))
			this.nature = "xor";*/
		}
	}


	public String getPattern() {
		return pattern;
	}


	public void setPattern(String pattern) {
		this.pattern = pattern;
	}


	public String getNature() {
		return nature;
	}


	public void setNature(String nature) {
		this.nature = nature;
	}


}
