package practice;

import java.util.Scanner;

public class Knya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int A;
		int B;
		
		while(true)
		{
			
			A = sc.nextInt();
			B = sc.nextInt();
				
			if(A==0&&B==0)
				break;
		
		if(A>B)
			System.out.println("Yes");
		else 
			System.out.println("No");
		}
		
	}

}
