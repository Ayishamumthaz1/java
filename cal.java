
import java.util.Scanner;

 class Calculator {

	static int result;
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		
		
		
		while(true){
			System.out.println();
			System.out.println("Enter first number::");
			int firstNumber = scan.nextInt();
			System.out.println("Enter second number::");
			int secondNumber = scan.nextInt();
			
			System.out.println("Enter 1");
			System.out.println("Enter 2");
			System.out.println(" Enter 3");
			System.out.println(" Enter 4");
			System.out.println(" Enter 5");

			System.out.println();
			System.out.println("Enter choice::");
			int choice = scan.nextInt();

			switch(choice){
			case 1: System.out.println("Adding the numbers");
			add(firstNumber, secondNumber);
			break;
			case 2: System.out.println("Subtracting the numbers");
			subtract(firstNumber, secondNumber);
			break;
			case 3: System.out.println("Dividing the numbers");
			divide(firstNumber, secondNumber);
			break;
			case 4: System.out.println("Multiplying the numbers");
			multiply(firstNumber, secondNumber);
			break;
			case 5: System.out.println("exit");
			System.exit(0);
			break;
			default: System.out.println("Incorrect input!!!");
			}
		}

	}
	
	
	public static void add(int num1, int num2){
		result = num1+num2;
		System.out.println("Addition result="+ result);
		
	}
	
	public static void subtract(int num1, int num2){
		result = num1-num2;
		System.out.println("Subtraction result="+ result);
	}
	
	public static void multiply(int num1, int num2){
		result = num1*num2;
		System.out.println("Multiplication result="+ result);
	}
	
	public static void divide(int num1, int num2){
		result = num1/num2;
		System.out.println("Division result="+ result);
	}

}
