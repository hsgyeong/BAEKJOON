package practice;

import java.util.Scanner;

public class CaseAB {

	public static void main(Strings[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int N;
		 N = sc.nextInt();
		 
		for(int i=1; i<=N; i++) {
			 
			 int A;
			 int B;
			 int C;
			
			 A = sc.nextInt();
			 B = sc.nextInt();
			 
			 C = A+B;
			 
			 System.out.println("Case #"+i+": "+A+" + "+B+" = "+C);
		 
	}

}
}
