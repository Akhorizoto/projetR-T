package data;

public class indicator {
	
	private String id;
	private String type;
	private String desc;
	public indicator(String id, String type, String desc) {
		super();
		this.id = id;
		this.type = type;
		this.desc = desc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
}
