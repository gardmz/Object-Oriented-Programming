package mvc_pattern;

public class Catalog {
	
	public void printCourseCatalog(int crn, String name, String prof, String location) {
		System.out.println("Course: " + name);
		System.out.println("CRN: " + crn);
		System.out.println("Professor: " + prof);
		System.out.println("Building: " + location);
	}
}
