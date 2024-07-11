package Classes;
public class Courses{
	 public String courseName;
	public String courseId;


	Students student[];
	Faculty faculties;

	
	
	
	public Courses(){
		
		
	}
	
	public Courses(String courseName, String courseId){
		this.courseName = courseName;
		this.courseId = courseId;
		student = new Students[20];
		
		
	}
	public void SetFaculty(Faculty faculties){
		this.faculties = faculties;
	}
	
	public Faculty getFaculty(){
		return faculties;
	}
	public void SetcourseName(String courseName){
		this.courseName = courseName;
	}
	
	public String getcoursename(){
		return courseName ;
	}
public void setcourseId(String courseId){
		this.courseId = courseId;
	}
	
	
	public String getcourseId(){
		return courseId ;
	}
	public void Resultofthecourse(int cgpa){
		System.out.println("CourseName: " + courseName);
		System.out.println("CourseGrade: " + cgpa);
		
	}
	public void showInfo(){
		System.out.println("Course Name: " + courseName);
		System.out.println("Course Id: " + courseId);
		
		
	}
}
	
	