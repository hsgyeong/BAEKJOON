package practice;

import java.util.Arrays;
import java.util.Scanner;

public class A2587 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int [5];
		int sum = 0;
		int avg;
		int center;
		
		for(int i=0; i<5; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int j=0; j<5; j++)
		{
			sum += arr[j];
		}
		
		avg = sum/5;
		center = arr[2];
		
		System.out.println(avg);
		System.out.println(center);
	}

}
