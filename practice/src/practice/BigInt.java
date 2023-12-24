package practice;

import java.math.BigInteger;
import java.util.Scanner;

public class BigInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		BigInteger A;
		BigInteger B;
		BigInteger answer;
		
		A = sc.nextBigInteger();
		B = sc.nextBigInteger();
		
		answer = A.add(B);
		
		System.out.println(answer);
	}

}
