public class Studentinfo {
	public static void main(String[] args) {
		
		int studentId = 1;
        int age = 22;
        int javaMarks = 85;
        int sqlMarks = 78;
        int htmlMarks = 82;

        int totalMarks = javaMarks + sqlMarks + htmlMarks;
        int averageMarks = totalMarks / 3;

        System.out.println("Student ID: " + studentId);
        System.out.println("Age: " + age);
        System.out.println("Java Marks: " + javaMarks);
        System.out.println("SQL Marks: " + sqlMarks);
        System.out.println("HTML Marks: " + htmlMarks);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
    }
}
        