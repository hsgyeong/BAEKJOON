package practice;

import java.util.Scanner;

public class Chocobar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N;
		int M;
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		if((100*N)>=M)
			System.out.println("Yes");
		else 
			System.out.println("No");
	}

}
