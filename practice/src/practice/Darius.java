package practice;

import java.util.Scanner;

public class Darius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String score;
		
		score = sc.next();
		String arr[] = score.split("/");
		
		int K = Integer.parseInt(arr[0]);
		int D = Integer.parseInt(arr[1]);
		int A = Integer.parseInt(arr[2]);
		
		if(K+A<D||D==0)
			System.out.println("hasu");
		else
			System.out.println("gosu");
	}

}
