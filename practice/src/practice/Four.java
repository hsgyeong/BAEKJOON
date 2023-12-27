package practice;

import java.math.BigInteger;
import java.util.Scanner;

public class Four {

	public static void main(Strings[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A;
		int B;
		int C;
		int D;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		Strings AA = Integer.toString(A);
		Strings BB = Integer.toString(B);
		Strings CC = Integer.toString(C);
		Strings DD = Integer.toString(D);
		
		Strings sum1 = AA+BB;
		Strings sum2 = CC+DD;
	
		BigInteger e = new BigInteger(sum1);
		BigInteger r = new BigInteger(sum2);
		
		BigInteger sum = e.add(r);
		
		System.out.println(sum);
		
	}

}
