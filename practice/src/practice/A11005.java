package practice;

import java.util.Scanner;

public class A11005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String N;
		int num;
		char alphabet;
		String answer = null;
		
		N = sc.next();
		num = sc.nextInt();
		
		if(num<10)
		{
			answer = N;
		}
		else if(num>=10 && num<=35)
		{
			alphabet = (char)num;
		}	
		else 
		
		System.out.println(answer);
	}

}
