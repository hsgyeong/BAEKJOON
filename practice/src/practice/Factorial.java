package practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		int m;
		int answer = 1;
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			m = n-i+1;
			if(m<1)
				break;
			
			answer *= m;
			
		}
		
		System.out.println(answer);
	}

}
