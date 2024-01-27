package practice;

import java.util.Scanner;

public class A2441 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int j=0; j<N; j++)
		{
			for(int i=0; i<j; i++)
			{
				System.out.print(" ");
			}
			for(int k=N; k>j; k--)
			{	
				System.out.print("*");
			}
		System.out.println(" ");	
		}
		
	}

}
