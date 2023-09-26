package Sample1;

import java.util.Scanner;

public class ControlStatementDemo {

	public static void main(String[] args) {
		// program to check number is positive or negative
		int num;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number:");
		num=sc.nextInt();
				
		if(num>0)
		{
			System.out.println("Number is positive");
		}
		else if(num<0)
		{
			System.out.println("Number is negative");
		}
		else {
			System.out.println("Number is zero");
		
		}

		
		
		//Switch Example
		System.out.println("Enter Day Number:");
		int day = sc.nextInt();
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid Output");
			break;
			
		}
	}

}
