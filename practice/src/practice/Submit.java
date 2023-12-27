package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Submit {

	public static void main(Strings[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		int [] arr = new int[31];
		for(int i=1; i<=28; i++)
		{
			arr[sc.nextInt()]++;
		}
		sc.close();
		
		for(int i=1; i<=30;i++)
		{
			if(arr[i]==0)
			{
				System.out.println(i);
			}
		}
	}

}
