package calculator;

import java.util.Scanner;

public class Mycalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fnum, snum, answer,option;
		Scanner input = new Scanner(System.in); 
		System.out.println(" enter first number");
		System.out.println("eternamesdfgdfgf");
		fnum = input.nextInt();
		System.out.println(" enter second number");
		snum = input.nextInt();
		System.out.println(" enter 1 2 ");
		option = input.nextInt();
		if (option == 1)
		{	answer = fnum + snum;			
		    System.out.println("addition of above number= ");	
			System.out.println(answer);

		}
		if (option == 2)
		{	answer = fnum - snum;			
		    System.out.println("subtraction of above number= ");	
			System.out.println(answer);

		}
		
	}

}
