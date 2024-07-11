package Classes;
import java.util.*;
import Interface.*;
//import java.lang.*;
public class Admin implements  studentandfacultyinfo{
	private String username;
	private String password;
	Students student[];
	Faculty faculties[];


	
	public Admin(){
		
	}
	public Admin(String username,String password){
		this.username=username;
		this.password=password;
		
		this.student=new Students[20];
		this.faculties=new Faculty[25];
	
		
	}
	
	public void addstudent(Students s)
	{
		int flag = 0;
		for(int i=0; i<student.length; i++)
		{
			if(student[i] == null)
			{
				
				 

				
				student[i]=s;
				
				
				
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Student Inserted");}
		else {System.out.println("Can Not Insert");}
	}
	public void removestudent()
	{
		Students s;
		Scanner s1c = new Scanner(System.in);
							System.out.println("You have selected to delete student");
							System.out.println("Enter Student Id to remove");
							String sid2=s1c.nextLine();
		int flag = 0;
		
		for(int i=0;i<student.length;i++){
			
			if(student[i]!=null&&student[i].getid().equals(sid2)){
							System.out.println("Student Found");
							
				student[i] = null;
				flag = 1;
				break;
			}
		
			else{
				System.out.println("The Student you want to remove unable to Found");
				
				
		
		}
		break;
	}
		
		if(flag == 1){System.out.println("student Removed");}
		else{System.out.println("Can Not Remove");}
		
	}

	
	public void addfecalty(Faculty f)
	{
		int flag = 0;
		for(int i=0; i<faculties.length; i++)
		{
			if(faculties[i] == null)
			{
				 
				 

				
				
				
				faculties[i]=f;
				
				
				
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Faculty Added");}
		else {System.out.println("Faculty unable to add");}
	}
	
	public void showAllstudents()
	{
		
		for(int i=0;i<student.length;i++)
		{
			

    Students s = student[i];
    

			if(s!=null){
			
			System.out.println("**********************************");
				System.out.println("Student  Name: "+ s.getname());
				System.out.println("Student ID: "+ s.getid());
				System.out.println("----------------------------------");
	
	}
	}
	}
	
		public void removeFaculty()
	{
		Faculty f;
		Scanner s2c = new Scanner(System.in);
							System.out.println("You have selected to delete Faculty");
							System.out.println("Enter Faculty Id to remove");
							String fid2=s2c.nextLine();
		int flag = 0;
		
		for(int i=0;i<faculties.length;i++){
			
			if(faculties[i]!=null&&faculties[i].getfacultyid().equals(fid2)){
							System.out.println("Faculty Found");
							
				faculties[i] = null;
				flag = 1;
				break;
			}
		
			else{
				System.out.println("The Faculty you want to remove unable to Found");
				
				
		
		}
		break;
		}
		if(flag == 1){System.out.println("Faculty Removed");}
		else{System.out.println(" Faculty Can Not Remove");}
	}
	public void showAllFaculty()
	{
		
		for(int i=0;i<faculties.length;i++)
		{
			

    Faculty f = faculties[i];
    

			if(f!=null){
			
			System.out.println("**********************************");
				System.out.println("Student  Name: "+ f.getfacultyname());
				System.out.println("Student ID: "+ f.getfacultyid());
				System.out.println("----------------------------------");
	
	}
	}
	}
}

	