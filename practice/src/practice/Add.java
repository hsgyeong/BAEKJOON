package practice;

import java.util.Scanner;

public class Add {

	public static void main(Strings[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N;
		int A;
		int B;
		int answer;
		
		N = sc.nextInt();
		
		for(int i=1; i<=N; i++)
		{
			A = sc.nextInt();
			B = sc.nextInt();
			
			answer = A+B;
			
			System.out.println(answer);
		}
	}

}
