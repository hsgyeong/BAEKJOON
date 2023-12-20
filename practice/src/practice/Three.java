package practice;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int A;
		int B;
		int C;
		int N = 0;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		if(A>=B&&A>=C&&B>=C||C>=B&&C>=A&&B>=A)
			N=B;
			
		else if(B>=A&&B>=C&&C>=A||A>=B&&A>=C&&C>=B)
			N=C;
			
		else if(C>=A&&C>=B&&A>=B||B>=A&&B>=C&&A>=C)
			N=A;
		
		System.out.println(N);
	}

}
