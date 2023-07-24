package Practice;

public class practice1 {
	private int id;
	private String S_name;
	
	
	// Getter and Setter methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getS_name() {
		return S_name;
	}
	public void setS_name(String s_name) {
		S_name = s_name;
	}
	
	public String toString() {
		return "Student Name: "+S_name+" Student id: "+id; // object printing method
	}
	

}
