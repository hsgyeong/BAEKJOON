package practice;

import java.util.Scanner;

public class Darius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String score;
		
		score = sc.next();
				
		char k = score.charAt(0);
		char d = score.charAt(2);
		char a = score.charAt(4);
		
		int K = (int)k-'0';
		int D = (int)d-'0'; 
		int A = (int)a-'0';
		
		if(K+A<D||D==0)
			System.out.println("hasu");
		else
			System.out.println("gosu");
	}

}
