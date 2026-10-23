 public class Student{

    int id;
    String name;
    double marks;

public void display(){

    System.out.println(" id :"+ id);
    System.out.println("name :"+ name);
    System.out.println("marks :"+ marks);
   
}

public static void main (String[] args){

    Student s1= new Student();
    s1.id= 1;
    s1.name="gayatri";
    s1.marks= 80.17;

    Student s2= new Student();
    s2.id= 2;
    s2.name="raj";
    s2.marks= 90.78;

    s1.display();
    s2.display();
}
}



