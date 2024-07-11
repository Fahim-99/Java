import java.lang.*;
import java.util.*;
import Classes.*;
import Interface.*;
import Fileio.*;
public class start
{
	public static void main(String args[])
	{
		System.out.println("Welcome to Java project");
		boolean choice = true;
		Scanner sc = new Scanner(System.in);
		Faculty f1 = new Faculty("Ayessa siddique","17-1","1234");
		Faculty f2=new Faculty();
		Students s2=new Students();
		Students s1=new Students("Ayman","19-40397-1","CSE");
		//Students s4=new Students("Naimur","19-40396-1","CSE");
		Courses c1=new Courses("oop1","141");
		Courses c2=new Courses("oop2","142");
		Courses c3=new Courses("Economics","124");
		Admin a1=new Admin("Admin","Admin");
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		frwd.writeInFile("Naimur;Bsc Cse;19403971;files/Student Info.txt");
		
		
		while(choice)
		{
			System.out.println("Select one");
			System.out.println("	1. Admin panel");
			System.out.println("	2.Faculty Panel");
			System.out.println("	3. Students Panel");
			System.out.println("    4.exit");
			
			
			
			int first = sc.nextInt();
			switch(first){
			
				case 1:
				System.out.println("	Welcome you to the Admin panel");
				Scanner Sc = new Scanner(System.in);
				
			System.out.println("Please enter the userName: ");
			String user = Sc.nextLine();
        
			System.out.println("Please enter the password: ");
			String password = Sc.nextLine();
			
			if("Admin".equals(user)&& "Admin".equals(password)){
				System.out.println("	Which task you want to perform");
				System.out.println("	1.ADD Student");
				System.out.println("	2.see the inserted student list");
			System.out.println("	3.Delete Student");
			
			System.out.println("	4. Add faculty");
			System.out.println("	5. Delete faculty");
			System.out.println("	6. see the inserted  faculty list");
			System.out.println("	7. Go Back\n");
					System.out.print("What do you want to do? : ");
			
			int second1=sc.nextInt();
			switch( second1)
			{
				case 1:
				System.out.println("	You have selected to Add student");
				System.out.println("	Enter name of the Student");
				String sname=sc.next();
				System.out.println("	Enter Id of the Student");
				String sid=sc.next();
				System.out.println("	Enter Department of the Student");
				String sdeptname=sc.next();
				//Students s2=new Students();
				s2.setname(sname);
				s2.setid(sid);
				s2.setdeptname(sdeptname);
				a1.addstudent(s2);
				
				
				break;
				case 2:
				a1.showAllstudents();
			
				break;
				case 3:
				
				Students s;
							
							
							
							a1.removestudent();
							
							
							
								
							
							
							
							
			
			
			break;
			
			case 4:
			System.out.println("	You have selected to Add Faculty");
			System.out.println("	Enter name of the Faculty");
			String fname=sc.next();
			System.out.println("	Enter Id of the faculty");
			String fid=sc.next();
			
			f2.setfacultyname(fname);
			f2.setfacultyid(fid);
			a1.addfecalty(f2);
			
			break;
			case 5:
			
			a1.removeFaculty();
			//break;
			
			break;
			case 6:
			a1. showAllFaculty();
			case 7:
						
							System.out.println("Going Back . . .");
							break;
							
						
			}
			
			break;

			}
			case 2:
			
			System.out.println("	Welcome you to the Faculty panel");
				Scanner fc = new Scanner(System.in);
				
			System.out.println("Please enter the userName: ");
			String us = fc.nextLine();
        
			System.out.println("Please enter the Password: ");
			String ps = fc.nextLine();
			
			if(f2.getfacultyname().equals(us)&& f2.getfacultyid().equals(ps)){
				System.out.println("	Which task you want to perform");
				
				System.out.println("	1.see the student list");
			
			
			
			System.out.println("	2.set result");

			System.out.println("	3. Go Back\n");
					System.out.print("What do you want to do? : ");
					int second2=sc.nextInt();
					switch(second2){
						case 1:
						System.out.println("Here are the student list");
						a1.showAllstudents();
			break;
			case 2:
			System.out.println("Insert the student Id to add merk");
			String as=sc.next();
			if(s2.getid().equals(as)){
				System.out.println("Name of the Student"+"   "+s2.getname());
			//f1.SetcourseResult(c1);
			f1. MidTermandFinalTerm(c1);
			System.out.println("	                     ");
				f1. MidTermandFinalTerm(c2);
				System.out.println("	                     ");
				f1. MidTermandFinalTerm(c3);
				System.out.println("	                     ");
			}
			
			break;
		case 3:
		System.out.println("Going Back . . .");
							break;
							default:
									System.out.println("Invalid insertion . . .");
							
							
							
		}
	}
			
	else {
		System.out.println("you type invalid username or password");
		
		
		
	
 
		
		
		
	}
	//continue;

//break;
	
	
	case 3:
	System.out.println("	Welcome you to the Student panel");
				Scanner stu = new Scanner(System.in);
				
			System.out.println("Please enter the userName: ");
			String u = stu.nextLine();
        
			System.out.println("Please enter the password: ");
			String p = stu.nextLine();
			if(s2.getname().equals(u)&& s2.getid().equals(p)){
				System.out.println("WELCOME" +"   "+s2.getname() );
				System.out.println("	Which task you want to perform");
				
				System.out.println("	1.see courses");
				System.out.println("	2.see course result ");
				
			
			
			
			
					int second3=sc.nextInt();
					switch(second3){
						case 1:
						System.out.println("your courses are");
						c1.showInfo();
					    c2.showInfo();
						c3.showInfo();
						break;
						
					case 2:
					System.out.println("which course result you want to see");
						System.out.println("	1."+c1.getcoursename());
				System.out.println("	2."+c2.getcoursename());
			System.out.println("	3."+c3.getcoursename());
				int second4=sc.nextInt();
				switch(second4){
					case 1:
					f1.MidTermandFinalTerm(s2,c1);
					
					break;
					case 2:
					f1.MidTermandFinalTerm(s2,c2);
					break;
					case 3:
					f1.MidTermandFinalTerm(s2,c3);
					
					break;
					

}		
}

	}
	case 4:
choice = false;
break;
}
	}
}
}


				
			
				