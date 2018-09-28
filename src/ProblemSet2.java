/**
 * INSTRUCTIONS.
 * 
 * Problem Set 2 will test your knowledge and understanding of arithmetic
 * operators and String concatenation. You'll be asked use the Scanner to
 * read user input from the keyboard, and use this input later to compute
 * and print certain required values to the console. All of this is explained
 * (and demonstrated, when appropriate) in the README file.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class ProblemSet2 {


	
	/**
	 * You need not modify the main method.
	 */

	Scanner input = new Scanner ( System.in );
	
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
		
	}
	
	public void sayHello() {
		System.out.println("sayHello\n\nFirst name, please!");
		String fname;
		fname = input.nextLine();
		System.out.println("Last name, please!");
		String lname;
		lname = input.nextLine();
		System.out.println("Hi, " + fname + " " + lname + "!");
		
	}
	
	public void gradeMe() {
		System.out.println("\ngradeMe\n\nGive me three quiz grades.");
		Double g1;
		Double quiz1 = input.nextDouble();
		Double quiz2 = input.nextDouble();
		Double quiz3 = input.nextDouble();
		g1 = 0.3 * (quiz1 + quiz2 + quiz3)/3;
		System.out.println("Now, give me three test grades");
		Double g2;
		Double test1 = input.nextDouble();
		Double test2 = input.nextDouble();
		Double test3 = input.nextDouble();
		g2 = 0.5 * (test1 + test2 +test3)/3;
		System.out.println("Now, give me three homework grades.");
		Double g3;
		Double homework1 = input.nextDouble();
		Double homework2 = input.nextDouble();
		Double homework3 = input.nextDouble();
		g3 = 0.15 *(homework1 + homework2 + homework3)/3;
		Double ga= (g1+g2+g3);
		DecimalFormat f = new DecimalFormat("###.##");
		System.out.println("Your grade average is " + f.format(ga) + "%");
		
	}
	
	public void groupUs() {
		System.out.println("\ngroupUs\n\nGive me a number of students and teachers");
		int number;
		number = input.nextInt();
		int busses = number / 47; 
		if (number % 47 != 0) {
			int newbusses = busses + 1;
			System.out.println("You will need " + Math.round(newbusses) + " busses. there will be 47 people on " + busses + " and " + number % 47 + " people on one bus." );
		}
		else {
			System.out.println("You will need " + Math.round(busses) + " busses. there will be 47 people on " + busses + " busses.");
		}
		
	}
	
	public void info() {
		System.out.println("\ninfo\n\nPlease enter your first name");
		String fname = input.nextLine();
		fname = input.nextLine();
		System.out.println("Please enter your last name");
		String lname;
		lname = input.nextLine();
		System.out.println("Please enter your current grade");
		int grade;
		grade = input.nextInt();
		System.out.println("Please enter your current age");
		int age;
		age = input.nextInt();
		System.out.println("Please enter your current Hometown");
		String town = input.nextLine();
		town = input.nextLine();
		System.out.println("NAME     : " + fname + " " + lname);
		System.out.println("GRADE    : " + grade);
		System.out.println("AGE      : " + age);
		System.out.println("HOMETOWN : " + town);

	}
	
	public void initials() {
		System.out.println("\ninitials\n\nEnter your first name:");
		String finitial = input.nextLine().toUpperCase();
		System.out.println("Enter your middle name (if you don't have one, then respond n):");
		String minitial = input.nextLine().toUpperCase();
		if (minitial.equals("n") || minitial.equals("N")) {
			System.out.println("Enter your last name:");
			String linitial = input.nextLine().toUpperCase();
			System.out.print(finitial.charAt(0));
			System.out.print(linitial.charAt(0));
		}
		else {
			System.out.println("Enter your last name:");
			String linitial = input.nextLine().toUpperCase();
			System.out.print(finitial.charAt(0));
			System.out.print(minitial.charAt(0));
			System.out.print(linitial.charAt(0));
		}
		input.close();
		
	}
	
}