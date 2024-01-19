package practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class A1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String word;
		word = sc.nextLine();
		int answer;
		
		StringTokenizer str = new StringTokenizer(word," ");
		
		answer = str.countTokens();
		
		System.out.println(answer);
		}
}
