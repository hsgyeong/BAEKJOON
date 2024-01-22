package practice;

import java.util.Scanner;

public class A30793 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double first;
		first = sc.nextDouble();
		
		double second; 
		second = sc.nextDouble();
	
		double result = 0;
		String answer;
		
		result = first/second;
		
		if(result<0.2)
			answer = "weak";
		else if(result>=0.2 && result<0.4)
			answer = "normal";
		else if(result>=0.4 && result<0.6)
			answer = "strong";
		else 
			answer = "very strong";
		
		System.out.println(answer);
		
	}

}
