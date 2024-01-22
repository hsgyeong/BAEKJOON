package practice;

import java.util.Scanner;

public class A30979 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T;
		T = sc.nextInt();
		
		int N;
		N = sc.nextInt();
		
		int F;
		int result = 0;
		
		for(int i=0; i<N; i++)
		{
			F = sc.nextInt();
			result += F;
		}
		
		if(result>=T)
			System.out.println("Padaeng_i Happy");
		else if(result<T)
			System.out.println("Padaeng_i Cry");

	}

}
