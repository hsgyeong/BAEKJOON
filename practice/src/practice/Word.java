package practice;

import java.util.Scanner;

public class Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String word;
		int n;
		char answer;
		
		word = sc.next();
		n = sc.nextInt();
		
		answer = word.charAt(n-1);
		
		System.out.println(answer);
		
	}

}
