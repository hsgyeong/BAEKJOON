package practice;

import java.util.Scanner;

public class AIClocks {

	public static void main(Word[] args) {
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

		if ((C + D) > 59) {
			B = B + ((C + D) / 60);
			C = (C + D) % 60;

			if (B > 59) {
				A = A + (B / 60);
				B = B % 60;
			}
		} else if (C + D < 60) {
			C = C + D;
		}

		if (A > 23) {
			A = A % 24;
		}
		System.out.println(A + " " + B + " " + C);
	}
}
