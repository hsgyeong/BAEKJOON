package practice;

import java.util.Scanner;

public class Maple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N;
		int U;
		int L;
		
		N = sc.nextInt();
		U = sc.nextInt();
		L = sc.nextInt();
		
		if(N>=1000&&(U>=8000||L>=260))
			System.out.println("Very Good");
		else if(N>=1000)
			System.out.println("Good");
		else
			System.out.println("Bad");
	}

}
