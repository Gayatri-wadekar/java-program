public class StudentInformation {

	int id;
	String name;
	  static String collegename="abc college";
	
	
	StudentInformation(int id, String name ){
		this.id=id;
		this.name=name;
		
	}
	
	public void show() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(collegename);
		
	}
	
	public static void main(String[] args) {
		
		StudentInformation s1= new StudentInformation(101,"gayatri");
		StudentInformation s2= new StudentInformation(102,"raj");
		StudentInformation s3= new StudentInformation(103,"riya");
		StudentInformation s4= new StudentInformation(104,"Amit");
		
		System.out.println(s1);
		
		
		
		System.out.println(s1.id);
    	System.out.println(StudentInformation.collegename);
    	
    	s1.show();
    	s2.show();
    	s3.show();
    	s4.show();
		
	}
}
