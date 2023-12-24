package practice;

import java.util.Scanner;

public class SafariWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long N;
		long M;
		long answer;
		
		N = sc.nextLong();
		M = sc.nextLong();
		
		answer=Math.abs(N-M);
		
		System.out.println(answer);
	}

}
