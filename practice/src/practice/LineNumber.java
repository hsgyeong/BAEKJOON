package practice;

import java.util.Scanner;

public class LineNumber {

	public static void main(Strings[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N;
		Strings t;
		N = sc.nextInt();
		sc.nextLine();
		
		Strings answer;
		
		for(int i=1; i<=N; i++)
		{	
			t = sc.nextLine();
			answer = (i+". "+t);
			
			System.out.println(answer);
		}
	}

}
