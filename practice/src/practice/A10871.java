package practice;

import java.util.Scanner;

public class A10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N;
		N = sc.nextInt();
		
		int X;
		X = sc.nextInt();

		int arr[] = new int [N];
		
		for(int i=0; i<N; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int j=0; j<N; j++)
		{
			if(X>arr[j])
			{
				System.out.print(arr[j]+" ");
			}
		}
	}

}
