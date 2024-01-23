package practice;

import java.util.Scanner;

public class A1357 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String A;
		A = sc.next();
		String arrA[] = new String [A.length()];
		
		String a = "";
		
		int idxA = 0;
		int idxB = 0;
		int idxC = 0;
		
		String B;
		B = sc.next();
		String arrB[] = new String [B.length()];
		
		String b = "";
		
		int sum = 0;
		
		for(int i=A.length(); i>0; i--)
		{
			arrA[idxA++] = A.substring(i-1, i);	
		}
		
		for(int k=0; k<A.length(); k++)
		{
			a += arrA[k];
		}
		
		for(int j=B.length(); j>0; j--)
		{
			arrB[idxB++] = B.substring(j-1, j);
		}
		
		for(int l=0; l<B.length(); l++)
		{
			b += arrB[l];
		}

		sum = Integer.parseInt(a)+Integer.parseInt(b);
		
		String stringSum = Integer.toString(sum);
		
		String arrStr[] = new String [stringSum.length()];
		String answer = "";
		
		for(int m=stringSum.length(); m>0; m--)
		{
			arrStr[idxC++] = stringSum.substring(m-1,m);
		}
		
		for(int n=0; n<stringSum.length(); n++)
		{
			answer += arrStr[n];
		}
		
		System.out.println(Integer.parseInt(answer));
	}

}
