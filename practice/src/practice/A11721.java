package practice;

import java.util.Scanner;

public class A11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String word;
		word = sc.nextLine();
		
		double length;
		length = word.length();
			
		for(int i=0; i<word.length(); i+=10)
		{
			System.out.println(word.substring(i,Math.min(i+10,word.length())));
		}
	}

}
