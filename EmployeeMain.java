// Create One EmployeeMain Class 
// Create Employee class 
// create simple constructor and write any message and call using this
// use empId , empName , age , department , salary 
// initialize fields using constructor 
// create method to display all details with proper message
// create one more method write some message and call this method using this

class Employee {
	int empid;
	String empname;
	int age;
	String department;
	double salary;

	
	public Employee() {
		System.out.println("employee details");
	}
	
	Employee(int empid , String empname, int age, String department,double salary){
		this();
		this.empid=empid;
		this.empname=empname;
		this.age=age;
		this.department=department;
		this.salary=salary;
		
	}
	
	 public void displayDetails() {
		    this.show();
	        System.out.println("Employee ID: " + this.empid);
	        System.out.println("Employee Name: " + this.empname);
	        System.out.println("Age: " + this.age);
	        System.out.println("Department: " + this.department);
	        System.out.println("Salary: " + this.salary);
	    }
	 
	 public void show() {
		 System.out.println("employess are working");
	 }
}

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee(101, "Rohan", 25, "IT", 35000.00);
		emp.displayDetails();
		
	    Employee emp1 = new Employee (102, "raj", 26 , "cs", 40000.00);
	    emp1.displayDetails();
	   
	}
}
