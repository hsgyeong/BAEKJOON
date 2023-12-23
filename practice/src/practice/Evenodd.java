package practice;

import java.math.BigInteger;
import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		BigInteger K;
		BigInteger a;
		
		N = sc.nextInt();
		
		for(int i=0; i<N; i++)
		{
			K = sc.nextBigInteger();
			 a= K.mod(BigInteger.valueOf(2));
			
			if(a.equals(BigInteger.ZERO))
				System.out.println("even");
			else
				System.out.println("odd");
		}
	}

}
