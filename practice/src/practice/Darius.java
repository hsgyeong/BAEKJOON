package practice;

import java.util.Scanner;

public class Darius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int K;
		int D;
		int A;
		String n;
		String m;
		
		K = sc.nextInt();
		n = sc.next();
		D = sc.nextInt();
		m = sc.next();
		A = sc.nextInt();
		
		if(K+A<D||D==0)
			System.out.println("hasu");
		else
			System.out.println("gosu");
	}

}
