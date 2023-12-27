package practice;

import java.util.Scanner;

public class Triangle {

	public static void main(Strings[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int A;
		int B;
		int C;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		if(A==60&&B==60&&C==60)
			System.out.println("Equilateral");
		else if((A+B+C)==180&&A==B||(A+B+C)==180&&B==C||(A+B+C)==180&&A==C)
			System.out.println("Isosceles");
		else if((A+B+C)==180&&A!=B&&A!=C&&B!=C)
			System.out.println("Scalene");
		else if((A+B+C)!=180)
			System.out.println("Error");
	}

}
