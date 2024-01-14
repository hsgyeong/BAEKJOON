package practice;

import java.util.Arrays;
import java.util.Scanner;

public class A10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		int num;
		int Maxnum = 0;
		int Minnum = 0;
		N = sc.nextInt();
		int arr [] = new int [N];
		
		for(int i=0; i<N; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		Minnum = arr[0];
		Maxnum = arr[N-1];
		
		System.out.println(Minnum+" "+Maxnum);
		
	}

}
