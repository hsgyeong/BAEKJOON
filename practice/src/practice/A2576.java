package practice;

import java.util.Arrays;
import java.util.Scanner;

public class A2576 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		int sum = 0;
		boolean oddNumber = false;
		int small = Integer.MAX_VALUE;
		
		for(int i=0; i<7; i++)
		{
			n = sc.nextInt();
			
			if(n%2!=0)
			{
				sum += n;
				oddNumber = true;
				
				if(n<small)
				{
					small = n;
				}
			}
		}	
		
		if(oddNumber) {

			System.out.println(sum);
			System.out.println(small);
		}
		else
		
			System.out.println(-1);
		
	}

}
