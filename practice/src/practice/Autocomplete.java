package practice;

import java.util.Scanner;

public class Autocomplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String A;
		
		A = sc.next();
		
		if(A.equals("N")||A.equals("n"))
			System.out.println("Naver D2");
		else
			System.out.println("Naver Whale");
	}

}
