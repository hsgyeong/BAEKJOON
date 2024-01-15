package practice;

import java.util.Scanner;

public class A15964 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A;
		int B;
		int answer = 0;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		answer = (A+B)*(A-B);
		
		System.out.println(answer);
	}

}
