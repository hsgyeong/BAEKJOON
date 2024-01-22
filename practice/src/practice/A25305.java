package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A25305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N;
		N = sc.nextInt();
		 int k;
		 k = sc.nextInt();
		 int answer = 0;
		 
		 Integer x[] = new Integer [N];
		 
		 for(int i=0; i<N; i++)
		 {
			 x[i] = sc.nextInt();
		 }
		
		 Arrays.sort(x, Collections.reverseOrder());
		 answer = x[k-1];
		 
		 System.out.println(answer);
	}

}
