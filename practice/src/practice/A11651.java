package practice;

import java.util.Arrays;
import java.util.Scanner;

public class A11651 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N;
		N = sc.nextInt();
		
		int a [] = new int [N];
		int b [] = new int [N];
		
		for(int i=0; i<N; i++)
		{
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i=0; i<N; i++)
		{
			System.out.println(a[i]+" "+b[i]);
		}	
	}

}
