package practice;

import java.util.Scanner;

public class A9085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<T; i++)
		{
			int N = sc.nextInt();

			sum = 0;
			
			for(int j=0; j<N; j++)
			{	
				sum += sc.nextInt(); 
			}

			System.out.println(sum);
		
		}	
	}

}
