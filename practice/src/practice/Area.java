package practice;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int m;
		int h;
		int w;
		int n;
		int answer=0;
		
		m = sc.nextInt();
		
		for(int i=0; i<m; i++)
		{
			h = sc.nextInt();
			w = sc.nextInt();
			
			n = h*w;
			
			if(answer<n)
				answer = n;
		}
		System.out.println(answer);
	}
}
