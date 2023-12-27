package practice;

import java.util.Scanner;

public class NEWBIE {

	public static void main(Strings[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N;
		int M;
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		if(M==1||M==2)
			System.out.println("NEWBIE!");
		else if (M<=N&&(M!=1||M!=2))
			System.out.println("OLDBIE!");
		else 
			System.out.println("TLE!");
	}

}
