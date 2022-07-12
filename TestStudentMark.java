package mark;


import java.util.Date;
import java.util.Scanner;

public class TestStudentMark {
			public static void main(String[] args) throws Exception{
			Scanner in = new Scanner(System.in);
				Date d = new Date();
			System.out.println("Enter student id");
			int student_id= in.nextInt();
			System.out.println("Enter student name");
			String Student_name=in.next();
			System.out.println("Enter physics mark");
			double physics = 0;
			physics=in.nextDouble();
			System.out.println("Enter maths mark");
			double maths = in.nextDouble();
			System.out.println("Enter chemistry mark");
			double chemistry = in.nextDouble();
			System.out.println("Enter cs mark");
			double cs = in.nextDouble();
			double total=0;
			if(physics<=100||maths<=100||chemistry<=100||cs<=100) {
				if(physics>=0||maths>=0||chemistry>=0||cs>=0) {
			total = physics + maths + chemistry + cs;
			double percentage = (total/400)*100;
			char grade;
			if(percentage>=90) {
				grade = 'O';
			}
			else if (percentage<90 && percentage>80) {
				grade = 'A';
			}
			else if (percentage<80 && percentage>70) {
				grade = 'B';
			}
			else if (percentage<70 && percentage>60) {
				grade = 'C';
			}
			else if (percentage<60 && percentage>=50) {
				grade = 'D';
			}
			else {
				grade = 'U';
			}
			System.out.println("The overall percentage of "+Student_name+" with Student ID = "+student_id+" is: "+ percentage);
			System.out.println("The overall grade of "+Student_name+" with Student ID = "+student_id+" is: "+ grade);
			System.out.println("Date: "+ d);
			}
			else {
					throw new Exception("Invalid Mark please enter mark above or equal to 0");
				}
			}
			else {
				throw new Exception("Invalid Mark Please enter mark below or equal to 100");
			}

	}

}
