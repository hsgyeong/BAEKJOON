package practice;

import java.util.Scanner;

public class A31009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		N = sc.nextInt();
		int fee = 0;
		int count = 0;
		
		String cities [] = new String[N];
		int cash [] = new int [N];
		
		for(int i=0; i<N; i++)
		{
			cities[i] = sc.next();
			cash[i] = sc.nextInt();	
		}
		
		for(int i=0; i<N; i++)
		{
			if(cities[i].equals("jinju"))
			{
				fee = cash[i];
			}
		}
		
		for(int i=0; i<N; i++)
		{
			if(cash[i]>fee)
				count++;
		}
		
			System.out.println(fee+"\n"+count);
		}
	}


