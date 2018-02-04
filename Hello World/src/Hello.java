/* Authored by Terrence Whaley
 * CEO of Play For Keeps
 * Practice
 */

import java.util.Scanner;

class Student {
	
	String name;
	String classificationYear;
	int age; 
	int timeInSchool;
	
	// User input for name and length of time being in school. 
	Scanner studentName = new Scanner(System.in);
	
	Scanner timeEntered = new Scanner(System.in);
	
	void speak() {
		System.out.println("Hello, please enter your first name:");
		String nameOfStudent = studentName.next();
		
		System.out.println("Greetings, " + nameOfStudent);
	
	}
	
	// class that calculates classification and graduation 
	int calculateYearsLeftUntilGraduation() {
		
		System.out.println("How many years have you been in college?: ");
		int timeInSchool = timeEntered.nextInt();
		
		// Array that pulls classification based on user's time in school. 
String[] classification = new String[4];
		
		classification[0] = "Freshmen";
		classification[1] = "Sophomore";
		classification[2] = "Junior";
		classification[3] = "Senior";
		
		// if-else statement that determines classification.
		if (timeInSchool == 1) {
		
		System.out.println("You must be a " + classification[0]);
		}
		
		else if(timeInSchool == 2) {
		
		System.out.println("You must be a " + classification[1]);
		}
		
		else if(timeInSchool == 3) {
			System.out.println("You must be a " + classification[2]);
		}
			
		else if(timeInSchool == 4) {
			System.out.println("You must be a " + classification[3]);
		}
		
		else {
			System.out.println("You entered an invalid time frame to be in school!");
		}
				
		// Algorithm that determines how many years you have until graduation 
		int graduationYear = 4 - timeInSchool;
		System.out.println("You have " + graduationYear + " year(s) until you get your degree!");
		
		return graduationYear;
		
		
	}
	// End of class Student
	
}

public class Hello {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		
		student1.speak();
		student1.calculateYearsLeftUntilGraduation();
		
		String[] days = {"monday", "tuesday", "wednesday", "thursday", "friday","monday and tuesday","monday and wednesday",
				"monday and wednesday", "monday and thursday", "monday and friday", "tuesday and wednesday", "tuesday and thursday", "tuesday and friday",
				"wednesday and thursday", "wednesday and friday", "monday, wednesday, and friday", "monday, tuesday, wednesday, thursday"};
		
		
		// Setting input to throw false for incorrect input by user.
		boolean input = false;
		
		
		// Loop
		do {
			// User input.
			Scanner Input = new  Scanner(System.in);
			
			System.out.println("Enter the day(s) of the week you go to school (Please seperate each day with a comma): ");
			String answer = Input.next(); 
			
			
			// Shows user what day they entered into console. 
			System.out.println("You entered: " + answer);
		
		switch(answer) {
		
		case "monday": 
			System.out.println("You have class on " + days[0]);
			input = true;
			break;
			
		case "monday and tuesday":
			System.out.println("You have class on "+ days[5]);
			input = true;
			break;
		
		case "monday and wednesday":
			System.out.println("You have class on " + days[6]);
			input = true;
			break;
			
		case "monday and thursday":
			System.out.println("You have class on " + days[7]);
			input = true;
			break;
			
		case "monday and friday":
			System.out.println("You have class on " + days[8]);
			input = true;
			break;
			
		case "tuesday":
			System.out.println("You have class on " + days[1]);
			input = true;
			break;
			
		case "tuesday and wednesday": 
			System.out.println("You have class on " + days[10]);
			input = true;
			break;
			
		case "tuesday and thursday":
		System.out.println("You have class on " + days[11]);
		input = true;
		break; 
			
		case "tuesday and friday":
			System.out.println("You have class on " + days[12]);
			input = true;
			break;
			
		case "wednesday":
			System.out.println("You have class on " + days[2]);
			input = true;
			break;
			
		case "wednesday and thursday":
			System.out.println("You have class on " + days[13]);
			input = true;
			break;
			
		case "wednesday and friday":
			System.out.println("You have class on " + days[14]);
			input = true;
			break;
			
		case "monday, wednesday, and friday":
			System.out.println("You have class on" + days[15]);
			input = true;
			break;
			
		case "monday, tuesday, wednesday, and thursday":
			System.out.println("You have class on " + days[16]);
			
		case "monday, tuesday, wednesday, thursday, and friday":
			System.out.println("You have class on " + days[16]);
			input = true;
			break;
			
		default:
			System.out.println("School does not take place on " + answer + ". Let's try this again:");
			input = false; 
			break;
		
		}

	} while(input != true);

}
	
}

