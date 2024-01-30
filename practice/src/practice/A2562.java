package practice;

import java.util.Arrays;
import java.util.Scanner;

public class A2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int maxnum = 0;
		
		int arr[] = new int [9];
	
		for(int i=0; i<9; i++)
		{
			arr[i] = sc.nextInt();
		}
	
		int copyarr[] = Arrays.copyOf(arr, 9);
		
		Arrays.sort(arr);
		
		max = arr[8];
		
		for(int j=0; j<9; j++)
		{
			if(copyarr[j]==max)
			maxnum = j+1;
		}
		
		System.out.println(max);
		System.out.println(maxnum);
	}

}
