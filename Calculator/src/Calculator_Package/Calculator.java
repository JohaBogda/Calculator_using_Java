package Calculator_Package;
import java.util.Scanner;

public class Calculator {
	
// 	Build a calculator:

//	Write a program to create a calculator that can Add, Subtract, Multiply, and Divide 2 numbers entered by the user. Also, add an option to exit out from the program. 	
//  1. Write different methods for each module (add, subtract, multiply, and divide).
//	2. Use switch/case to call the particular method.	
//	3. Take input inside the methods to perform the related operation.
//	4. Return the answer and display it inside the main method.
//	5. Display a default message (ex. "Invalid Entry, Try Again") if any number other than 1-5 is entered by the user
	

	
// initialize values: 
	int number1;
	int number2;
	float number1f;
	float number2f;
	

	
	//Addition: 
		public static void addition() {
			Scanner myObj = new Scanner(System.in);		
			System.out.println("Enter first number between 1 & 5: ");
			int number1 = myObj.nextInt();
			
			if(number1 >=1 && number1 <=5) {
			
			System.out.println("Enter second number between 1 & 5: ");
			int number2 = myObj.nextInt();
			
			int sum = number1 + number2;
			System.out.println(sum);
			} else {
				System.out.println("Invalid number, try again");
			}
		}
		
//	//Subtraction: 
		public static void subtraction() {
		Scanner myObj = new Scanner(System.in);		
		System.out.println("Enter first number between 1 & 5: ");
		int number1 = myObj.nextInt();
		
		if(number1 >=1 && number1 <=5) {
		
		System.out.println("Enter second number between 1 & 5: ");
		int number2 = myObj.nextInt();
		
		int difference = number1 - number2;
		System.out.println(difference);
		} else {
			System.out.println("Invalid number, try again");
		}
	}
	
//	//Multiplication: 
		public static void multiplication() {
		Scanner myObj = new Scanner(System.in);		
		System.out.println("Enter first number between 1 & 5: ");
		int number1 = myObj.nextInt();
		
		if(number1 >=1 && number1 <=5) {
		
		System.out.println("Enter second number between 1 & 5: ");
		int number2 = myObj.nextInt();
		
		int product = number1 * number2;
		System.out.println(product);
		} else {
			System.out.println("Invalid number, try again");
		}
	}
//		
//	//Division: 
		public static void division() {
		Scanner myObj = new Scanner(System.in);		
		System.out.println("Enter first number between 1 & 5: ");
		float number1f = myObj.nextFloat();
		
		if(number1f >=1 && number1f <=5) {
		
		System.out.println("Enter second number between 1 & 5: ");
		float number2f = myObj.nextFloat();
		
		float quotient = number1f / number2f;
		System.out.println(quotient);
		} else {
			System.out.println("Invalid number, try again");
		}
	}
			
		
//		//  EXIT():
		public static void exit() {
			Scanner myObj = new Scanner(System.in);
			System.out.println("See ya!");
		}

	public static void main(String[] args) {


				
				Scanner myObj = new Scanner(System.in);
				System.out.println("Would you like to add, subtract, multiply, divide, or exit?");
				String operation = myObj.next();	
				 


					switch(operation) {
					case "add":
						addition();
						break;
					case "subtract":
						subtraction();
						break;
					case "multiply":
						multiplication();
						break;
					case "divide": 
						division();
						break;
					case "exit":
						exit();
						break;
					}
	}

}
