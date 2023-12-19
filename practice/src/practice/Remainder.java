package practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n;
		int a;
		int k;
		int count=0;
		
//		배열을 만들고 번지별로 값을 넣어줌
		
		int []arr = new int[10];
		
		for(int i=0; i<10; i++)
		{
			n = sc.nextInt();
			
			a=n%42;
	
			arr[i]=a;
			
	//	System.out.println(Arrays.toString(arr));
		}
		
		Arrays.sort(arr);   //크기순으로 정렬
		
		for(int i=1; i<10;i++)
		{
			if(arr[i]!=arr[i-1])
				count++;
			else
				continue;
		}
		
		System.out.println(count+1);
		
	}

}
