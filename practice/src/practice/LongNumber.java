package practice;

import java.math.BigInteger;
import java.util.Scanner;

public class LongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger A;
		BigInteger B;
		BigInteger answer1;
		BigInteger answer2;
		BigInteger answer3;
		
		A = sc.nextBigInteger();
		B = sc.nextBigInteger();
		
		answer1 = A.add(B);
		answer2 = A.subtract(B);
		answer3 = A.multiply(B);
		
		System.out.println(answer1+"\n"+answer2+"\n"+answer3);
				
	}

}
