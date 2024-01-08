package practice;

import java.math.BigInteger;
import java.util.Scanner;

public class Rich {

	public static void main(Word[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		BigInteger n = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();
		BigInteger divide;
		BigInteger remain;
		
		divide = n.divide(m);
		remain = n.remainder(m);

		System.out.println(divide+"\n"+remain);
	}

}
