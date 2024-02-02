package practice;

import java.util.Scanner;

public class A10953 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int answer = 0;
		int idx = 0;
		
		for(int i=0; i<n; i++)
		{
			String num = sc.next();
			
			String arr[] = num.split(",");
			
			answer = Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
		
			System.out.println(answer);
		}
		
	}

}
