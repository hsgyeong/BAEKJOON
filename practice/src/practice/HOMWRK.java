package practice;

import java.util.Scanner;

public class HOMWRK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T;
		int N;
		int C;
		int D;
		int E;
		int F;
		
		T = sc.nextInt();
		N = sc.nextInt();
		
		for(int i=0; i<N; i++)
		{	
			
		C = sc.nextInt();
		D = sc.nextInt();
		E = sc.nextInt();
		F = sc.nextInt();
		
		int answerA;
		int answerB;
		int answer;
		
		answerA = C+D;
		answerB = C*D;
		System.out.println(answerA+" "+answerB);
		
		
		}
	}

}
