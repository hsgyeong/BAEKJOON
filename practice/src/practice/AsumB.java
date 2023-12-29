package practice;

import java.util.Scanner;

public class AsumB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A;
		int B;
		int n=0;
		String answer;
		int sum;
		
		n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{			
			A = sc.nextInt();
			B = sc.nextInt();
			sum = A+B;
			
			answer="Case #"+i+": "+sum;
			
			System.out.println(answer);
		}
	}

}
