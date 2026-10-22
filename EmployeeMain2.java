class Employees{
	 int id;
	 String name;
	 static String department ="IT"; 


public Employees(int id,String name) {
	this.id=id;
	this.name=name;
   }
}

class display {
	
	Employees emp = new Employees(101,"riya");
	
	public void show() {
		
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(Employees.department);
		
	}
	
	public static void m1() {
		System.out.println("Hello");
	}
	
}

public class EmployeeMain2 {
	
	public static void main(String[] args) {
		
		 display d = new display();
		 d.show();
		 
		 display.m1();
	}
}
