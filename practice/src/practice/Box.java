package practice;

import java.util.Scanner;

public class Box {

	public static void main(Strings[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		int m;
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		if((n*m)%3==0)
			System.out.println("YES");
		else 
			System.out.println("NO");
	}

}
