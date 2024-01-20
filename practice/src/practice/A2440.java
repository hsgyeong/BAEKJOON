package practice;

import java.util.Scanner;

public class A2440 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N;
		N = sc.nextInt();
		
		for(int i=0; i<N; N--)
		{	
			for(int j=N; j>0; j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
