package practice;

import java.util.Scanner;

public class Count {

	public static void main(Word[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N;
		int v;
		int a;
		int count=0;
		
		N = sc.nextInt();
		int num [] = new int[N];
		
		for(int i=0; i<N; i++)
		{
			 num[i] = sc.nextInt();
		}	
		
		v = sc.nextInt();
		
		for(int j=0; j<N; j++)
		{	
			
		a = num[j]; 
		if(v==a)
			count++;
		}
		
		System.out.println(count);
	}

}
