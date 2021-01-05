package mvc_pattern;

public class Course {
	
	private int crn;
	private String name;
	private String prof;
	private String location;
	
	public String getProf() {
		return prof;
	}
	public void setProf(String prof) {
		this.prof = prof;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCrn() {
		return crn;
	}
	public void setCrn(int crn) {
		this.crn = crn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
