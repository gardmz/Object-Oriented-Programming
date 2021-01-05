package mvc_pattern;

public class MVC_Client {
	
	public static void main(String[] args) {
		Course course = getCourse();
		Catalog catalog = new Catalog();
		CourseController cont = new CourseController(course, catalog);
		cont.updateView();
		System.out.println("Updated course name");
		cont.setCourseName("COMPUTER SECURITY");
		cont.updateView();
		
	}
	private static Course getCourse() {
		Course course = new Course();
		course.setName("DATA STRUCTURES");
		course.setCrn(1234);
		course.setProf("Proffesor Harris");
		course.setLocation("IT Building");
		return course;
	}
}
