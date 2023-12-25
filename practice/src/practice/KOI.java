package practice;

import java.util.Scanner;

public class KOI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A;
		int B;
		int C;
		int D;
		int E;
		int answer;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		E = sc.nextInt();
		
		answer=((A*A)+(B*B)+(C*C)+(D*D)+(E*E))%10;
		
		System.out.println(answer);
	}

}
