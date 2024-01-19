package practice;

import java.util.Scanner;

public class A5522 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A;
		int answer = 0;
		
		for(int i=0; i<5; i++)
		{	
			A = sc.nextInt();
		
			answer += A;
		}
		
		System.out.println(answer);
	}

}
