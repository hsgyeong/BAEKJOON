package practice;

import java.util.Scanner;

public class A10987 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		
		int length = word.length();
		int answer = 0;
		
		for(int i=0; i<length; i++)
		{
			char ch = word.charAt(i);
			
			if(Character.toString(ch).equals("a")||Character.toString(ch).equals("e")||
				Character.toString(ch).equals("i")||Character.toString(ch).equals("o")||
				Character.toString(ch).equals("u"))
			{
				answer++;
			}
		}
		
		System.out.println(answer);
	}

}
