import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Enter the student name: ");
		student.name = scanner.nextLine();
	
		System.out.println("Enter the 1° grade: ");
		student.grade1 = scanner.nextDouble();
		
		System.out.println("Enter the 2° grade: ");
		student.grade2 = scanner.nextDouble();
		
		System.out.println("Enter the 3° grade: ");
		student.grade3 = scanner.nextDouble();
		
		System.out.println("Final Grade = " + student.FinalGrade() + "\n" + student.StudentApproval());
	}
}
