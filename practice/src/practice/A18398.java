package practice;

import java.util.Scanner;

public class A18398 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T;
		int N;
		int C;
		int D;
		
		N = sc.nextInt();
		
		for(int j=0; j<N; j++)
		{	
			int answerA = 0;
			int answerB = 0;

			T = sc.nextInt();
			
			for(int i=0; i<T; i++)
			{		
				C = sc.nextInt();
				D = sc.nextInt();	
		
				answerA = C+D;
				answerB = C*D;			
				
				System.out.println(answerA+" "+answerB);
			}
		}
	}
}