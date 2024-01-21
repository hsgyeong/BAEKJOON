package practice;

import java.util.Scanner;

public class A2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N;
		N = sc.nextInt();
		
		for(int i=1; i<=N; i++)
		{
			for(int j=N-i; j>0; j--)
			{
					System.out.print(" ");	
			}
			
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
			
		}
	
	}

