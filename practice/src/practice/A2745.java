package practice;

import java.util.Scanner;

public class A2745 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String N;  //2진법의 1001 > 10진수로
		int B;  //B=2
		int n = 0;
		int answer = 0;

		N = sc.next();
		B = sc.nextInt();

		for (int i=0; i<N.length(); i++) {
			char a = N.charAt(i);   
			if (a >= '0' && a <= '9') {

				n = n*B + (a-'0'); 		 // n=1
										//(1*2)+0 = n=2
										//(2*2)+0 = n=4
										//(4*2)+1 = n=9  1001=9
			} else {							//	35
			    						//		+	35*36
				n = n*B + (a-'A'+10);	//		+   35*36*36
			}							// 		+   35*36*36*36	
		}								// 		+   35*36*36*36*36	
		answer = n;						//     	+   35*36*36*36*36*36	
										          
		System.out.println(answer);
	}

}