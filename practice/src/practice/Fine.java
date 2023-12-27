package practice;

import java.util.Scanner;

public class Fine {

	public static void main(Strings[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A;
		int B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(B-A>=31)
			System.out.println("You are speeding and your fine is $500.");
		else if(B-A>=21&&B-A<=30)
			System.out.println("You are speeding and your fine is $270.");
		else if(B-A>=1&&B-A<=20)
			System.out.println("You are speeding and your fine is $100.");
		else
			System.out.println("Congratulations, you are within the speed limit!");
	}

}
