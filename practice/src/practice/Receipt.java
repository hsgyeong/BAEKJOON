package practice;

import java.util.Scanner;

public class Receipt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int X;
		int N;
		int a;
		int b;
		int c = 0;
		
		X = sc.nextInt();
		N = sc.nextInt();
		
		for(int i=1; i<=N; i++)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			
			c += a*b;
			
		}
		
		if(c==X)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
