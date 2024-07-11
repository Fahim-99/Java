package Classes;
public class Students extends Faculty {
	public String name;
	public String id;
    public String deptname;
	Admin admin;
	Faculty faculties;
	Courses course[];
	
	public Students(){
		
	}
	public Students(String name,String id,String deptname){
		course=new Courses[20];
	this.name=name;
	this.id=id;
	this.deptname=deptname;
	}
	
	public void setname(String name){
		this.name=name;
	}
	public String getname(){
		return name;
	}
	
	public void setid(String id){
		this.id=id;
	}
	
	public String getid(){
		return id;
	}
	public void setdeptname(String deptname){
		this.deptname=deptname;
	}
	public String getdeptname(){
		return deptname;
	}
	public void SetAdmin(Admin admin){
		this.admin = admin;
	}
	
	public Admin GetAdmin(){
		return admin;
	}
	
	public void SeecourseResult( double fm){
		System.out.println("Total mark is"+" "+fm);
	
	if(fm>=90){
	
	System.out.println("A+");
	}
	if(fm>=85&& fm<=89){
	
	System.out.println("A");
	}
	if(fm>=80&&fm<=84){
	
	System.out.println("B+");
	}
	
		
		

	}
	
	public void showInfo(){
		
		System.out.println("Student Name: " + name);
		System.out.println("Student Id: " + id);
		System.out.println("Student Department Name: " + deptname);
		
		
		
	}
}
	
	
	