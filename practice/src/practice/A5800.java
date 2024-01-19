package practice;

import java.util.Arrays;
import java.util.Scanner;

public class A5800 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int X;
		X = sc.nextInt();
		
		int group;
	
		
		int max = 0;
		int min = 0;
		int gap;

		int count = 0;

		
		for(int k=0; k<X; k++) {
			
			group = sc.nextInt();
			int arr [] = new int [group];
		
		for(int i=0; i<group; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int largestGap = 0;
		
		for(int j=group-1; j>0; j--)
		{
			gap = arr[j]-arr[j-1];
			
			if(gap>largestGap)
			{
				largestGap = gap;
			}
		}
		
		count++;
		
		max = arr[group-1];
		min = arr[0];
		
		System.out.println("Class "+count);
		System.out.println("Max "+max+", Min "+min+", Largest gap "+largestGap);
		}
		
	}

}
