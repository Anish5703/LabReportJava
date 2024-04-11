//Program to read two number from user and perform a desired operations and determine if the result is negative or positive or zero;
import java.util.Scanner;
public class ControlStatements {
	void displayStatus(int result)
	{
		if(result>0) 
			System.out.println("Result is Positive");
		else if(result<0) 
			System.out.println("Result is negative");
		else 
			System.out.println("Result is equals to zero");
	}

	public static void main(String[] args) {
		
        ControlStatements myObj = new ControlStatements();
		System.out.println("Enter any two numbers ");
		Scanner keyboard = new Scanner(System.in);
		int num1 = keyboard.nextInt();
		int num2 = keyboard.nextInt();
		System.out.println("Choose any operators '+','-','*','/'");
		char choice = keyboard.next().charAt(0);

		
		
		switch(choice)
		{
		case '+':
			int result = num1+num2;
			myObj.displayStatus(result);
			break;
		
		case '-':
			result = num1-num2;
            myObj.displayStatus(result);
			break;
			
		case '*':
			result = num1*num2;
			myObj.displayStatus(result);
			break;
		
		case '/':
			result = num1/num2;
			myObj.displayStatus(result);
			break;
		}
		
		keyboard.close();
		 
	}

}
