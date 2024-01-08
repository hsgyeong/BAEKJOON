package practice;

import java.util.Scanner;

public class MinMax {

	public static void main(Word[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N;
		int m;
		int max=0;
		int min=0;
	
		N = sc.nextInt();
		int num[] = new int [N];
		
		for(int i=0; i<N; i++)
		{
			num[i] = sc.nextInt();
			
		}
		
		for(int i=0; i<N; i++)
		{
			if(num[i]>max)
				max = num[i];
			
			if(num[i]<num[N-1])
				min = num[i];
			else 
				min = num[N-1];
			
		}
		System.out.println(min+" "+max);	
	}	

}
			
	

