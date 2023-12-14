package practice;

import java.util.Scanner;

public class AB5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A;
		int B;
		int n;
		
		while(true)
		{
			A = sc.nextInt();
			B = sc.nextInt();
			n = A+B;
			
			if(A==0&&B==0)
				break;
			
			System.out.println(n);
		
		}
	}

}
