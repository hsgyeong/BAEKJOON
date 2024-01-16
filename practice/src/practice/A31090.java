package practice;

import java.util.Scanner;

public class A31090 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T;
		T = sc.nextInt();

		int[] arr = new int [T];
		
		int d = 0;
		
		for(int i=0; i<T; i++)
		{	
			arr[i] = sc.nextInt();
			
			d = arr[i]%100;		
			
			if((arr[i]+1)%d==0)
			{
				System.out.println("Good");	
			}
			else
				System.out.println("Bye");
			}
		}

}
