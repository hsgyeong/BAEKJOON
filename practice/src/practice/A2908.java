package practice;

import java.util.Scanner;

public class A2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A;
		A = sc.nextInt();
		
		String a;
		a = Integer.toString(A);
		
		String arrA[] = new String[a.length()];
		
		int B;
		B = sc.nextInt();
		
		String b;
		b = Integer.toString(B);
		
		String arrB[] = new String[b.length()];
		
		for(int i=a.length(); i>0; i--)
		{
			arrA[a.length()-i] = a.substring(i-1, i);
		}
		
		for(int j=b.length(); j>0; j--)
		{
			arrB[b.length()-j] = b.substring(j-1, j);
		}
		
		int answerA = Integer.parseInt(arrA[0]+arrA[1]+arrA[2]);
		int answerB = Integer.parseInt(arrB[0]+arrB[1]+arrB[2]);
		
		if(answerA>answerB)
			System.out.println(answerA);
		else
			System.out.println(answerB);
	}

}
