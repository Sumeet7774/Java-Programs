class Employee
{
	private static int empId;
	private static String name;
	private static int empCount = 0;

	public Employee()
	{
		this.empId = empId;
		this.name = name;
		empCount++;
	}

	public Employee(int empId, String name)
	{
		this.empId = empId;
		this.name = name;
		empCount++;
	}

	public void getData(int empId, String name)
	{
		this.empId = empId;
		this.name = name;
	}

	public void disp()
	{
		System.out.println("The employee id is: " + empId);
		System.out.println("The employee name is: " + name);
	}

	public static void DispCount()
	{
		System.out.println("Total number of employees: " + empCount);
	}
}

class Teacher extends Employee
{
	private String Qualification;

	public void setQual(String Qualification)
	{
		this.Qualification = Qualification;
	}

	@Override
	public void disp()
	{
		super.disp();
		System.out.println("Teacher Qualification is: " + Qualification);
	}

	public Teacher()
	{
		super();
	}

	public Teacher(int empId, String name, String Qualification)
	{
		super(empId,name);
		this.Qualification = Qualification;
	}
}

public class Example4
{
	public static void main(String args[])
	{
		Employee emp1 = new Employee(1,"Sumeet");
		emp1.disp();

		Employee emp2 = new Employee(2,"Jimit");
		emp2.disp();

		Employee.DispCount();

		Teacher teacher1 = new Teacher();
		teacher1.getData(3, "Yash");
        	teacher1.setQual("Masters in Valorant");
        	teacher1.disp();

		Teacher teacher2 = new Teacher(4, "Bob", "Ph.D. in Mathematics");
       		teacher2.disp();
	
		 Employee.DispCount();
	}
}