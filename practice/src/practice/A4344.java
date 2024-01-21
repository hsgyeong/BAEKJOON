package practice;

import java.util.Scanner;

public class A4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double C;
		C = sc.nextInt();
		
		int N ;
		double count;
		
		double score = 0;
		double avg = 0;
		double answer;
		
		for(int i=0; i<C; i++)
		{
			N = 0;
		    count = 0;
			N = sc.nextInt();
			
			int arr []= new int [N];
			double sum = 0;
			
			for(int j=0; j<N; j++)
			{
				score = sc.nextInt();
				
				arr[j] = (int)score; 
								
				sum += score;
				
			}
			
			 avg = sum/N;
			 
			for(int k=0; k<N; k++)
			{				 
				if(avg<arr[k])
				{
					count++;
				}
			}
			
			//System.out.println(count);
			answer = ((double)count/N)*100;
			
			System.out.printf("%.3f",answer);
			System.out.println("%");
		}
	}

}
