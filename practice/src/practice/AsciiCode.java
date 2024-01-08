package practice;

import java.util.Scanner;

public class AsciiCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String A;
		A = sc.next();
		
		int answer = A.charAt(0);
		
		System.out.println(answer);
	}

}
