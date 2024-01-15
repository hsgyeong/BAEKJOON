package practice;

import java.math.BigInteger;
import java.util.Scanner;

public class A2935 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        String AString;
        String operator;
        String BString;
        
        AString = sc.next();
        operator = sc.next();
        BString = sc.next();
        
        BigInteger A = new BigInteger(AString);
        BigInteger B = new BigInteger(BString);
        
        switch(operator){
            case "+":{
                System.out.println(A.add(B));
                break;
            }
            case "*":{
                System.out.println(A.multiply(B));
                break;
            }
        }
	}

}
