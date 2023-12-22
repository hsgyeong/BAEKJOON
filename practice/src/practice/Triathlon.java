package practice;

import java.util.Scanner;

public class Triathlon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int a;
		int d;
		int g;
		int m;
		int answer=0;
		
		n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			a = sc.nextInt();
			d = sc.nextInt();
			g = sc.nextInt();
			
			if(a==(d+g))
			{
				m = 2*(a*(d+g));
			}
			else 
				m = a*(d+g);
			
			if(m>answer)
				answer = m;
		}
		
		System.out.println(answer);

	}

}
