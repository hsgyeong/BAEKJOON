package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int n;
	
		int arr[] = new int[3];
		
		for(int i=0; i<3; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
		
	}

}
