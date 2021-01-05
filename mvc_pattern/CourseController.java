package mvc_pattern;

public class CourseController {
	private Course course;
	private Catalog catalog;
	
	public CourseController(Course course, Catalog catalog) {
		this.course = course;
		this.catalog = catalog;
	}
	
	public void setCourseName(String name) {
		course.setName(name);
	}
	
	public String getCourseName(String name) {
		return course.getName();
	}
	
	public void setCRN(int crn) { 
        course.setCrn(crn);        
    } 
  
    public int getCRN()  { 
        return course.getCrn();         
    } 
    public String getProf() {
		return course.getProf();
	}
	public void setProf(String prof) {
		course.setProf(prof);
	}
	public String getLocation() {
		return course.getLocation();
	}
	public void setLocation(String location) {
		course.setLocation(location);
	}
  
    public void updateView() 
    {                 
        catalog.printCourseCatalog(course.getCrn(), course.getName(), course.getProf(), course.getLocation()); 
    } 
}
