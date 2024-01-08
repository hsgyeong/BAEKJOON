package practice;

import java.util.Scanner;

public class NoBrainer {

	public static void main(Word[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			int A;
			int B;
			
			A = sc.nextInt();
			B = sc.nextInt();
			
			if(A>=B)
				System.out.println("MMM BRAINS");
			else
				System.out.println("NO BRAINS");
			
		}
	}

}
