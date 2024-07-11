package Classes;
import java.util.*;
import Interface.*;
public class Faculty implements SetResult{
	
	public String name;
	protected String id;
	protected String password;
	 Courses course;
	Students student[]; 
	//public static double fm;
		public static double mid;
		public static double Final;
		public static double fm=mid+Final;
	public Faculty(){
		
	}
	public Faculty(String name, String id, String password){
		
		this.name = name;
		this.id = id;
		this.password = password;
		
		
		student = new Students[20];
	}
		
		
	
	public double MidTermandFinalTerm(Courses c){
      Scanner mc = new Scanner(System.in);
       System.out.println("Enter the Mid Term marks of :"+c.getcoursename());
       double f3=mc.nextDouble();
  mid = f3*0.4;

       System.out.println("After converted to 40% the Mid term Mark is::"+mid);
       
    

   Scanner m2c = new Scanner(System.in);
       System.out.println("Enter the Final Term marks of:"+c.getcoursename());
		double f4=m2c.nextDouble();
     Final = f4*0.6 ;
		
         
        System.out.println("After converted to 60% the Final term Mark is:"+Final);
 fm=mid+Final;
			System.out.println("Total mark of "+c.getcoursename()+"is "+""+fm);
       return fm; 
	}
	public  void MidTermandFinalTerm( Students s,Courses c){
		
		System.out.println("Mark of"+c.getcoursename()+ " is"+fm);
		
	}

    


	public void setfacultyname(String name){
	this.name=name;
	}
	public String getfacultyname(){
	return name;
	}
	
	public void setfacultyid(String id){
	this.id=id;
	}
	public String getfacultyid(){
	return id;
	}
	public void setfacultypassword(String password){
	this.password=password;
	}
	public String getfacultypassword(){
	return password;
	}
	
	
	//public void SetcourseResult( Courses course){
	//double fm;
	//Scanner m2c = new Scanner(System.in);
	
		
		// fm=m2c.nextDouble();
		//System.out.println("Total mark "+fm);
		
	//}

	public void courseResult( double fm){
		System.out.println("Total mark is"+" "+fm);
	}
	
	public void showDetails(){
		System.out.println("Faculty Name: " + name);
		System.out.println("Faculty Id: " + id);
		
		
	}
	
	public void showCourseInfo(){
		course.showInfo();
	}
}

	
	