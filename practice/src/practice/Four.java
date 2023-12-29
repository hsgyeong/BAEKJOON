package practice;

import java.math.BigInteger;
import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
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
		
		String AA = Integer.toString(A);
		String BB = Integer.toString(B);
		String CC = Integer.toString(C);
		String DD = Integer.toString(D);
		
		String sum1 = AA+BB;
		String sum2 = CC+DD;
	
		BigInteger e = new BigInteger(sum1);
		BigInteger r = new BigInteger(sum2);
		
		BigInteger sum = e.add(r);
		
		System.out.println(sum);
		
	}

}
