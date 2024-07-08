class Student
{
	private static int rollno;
	private static String name; 
	private static String universityName = "PDEU";
	private static int studentCount = 0;

	public Student(int rollno, String name)
	{
		this.rollno = rollno;
		this.name = name;
		studentCount++;
	}	

	public static void Disp()
	{
		System.out.println("Roll Number: " + rollno);
        	System.out.println("Name: " + name);
        	System.out.println("University: " + universityName);
        	System.out.println("Student Count: " + studentCount);
	}

	public static void SDisp()
	{
		System.out.println("University: " + universityName);
	        System.out.println("Student Count: " + studentCount);
	}

	public static void studentCount()
	{
		studentCount++;
	}
}

public class Main
{
	 public static void main(String[] args) 
	 {
		Student s1 = new Student(1,"Sumeet");
		 System.out.println("Student 1 Details:");
		s1.Disp();

		Student s2 = new Student(2,"Jimit");
		 System.out.println("Student 2 Details:");
		s2.Disp();

		System.out.println("\nStatic Student Info:");
       		Student.SDisp();
	}
}