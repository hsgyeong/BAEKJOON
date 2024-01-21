package practice;

import java.util.Scanner;

public class A11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N;
		N = sc.nextInt();
		
		String num;
		num = sc.next();
		
		int intnum;
		
		int answer = 0;
		
		for(int i=0; i<N; i++)
		{
			
			char charnum = num.charAt(i);
			
			intnum = (int)charnum-'0';
			
			answer += intnum;
			
		}	
		
		System.out.print(answer);
	}

}
