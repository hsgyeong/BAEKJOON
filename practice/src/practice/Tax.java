package practice;

import java.util.Scanner;

public class Tax {

	public static void main(Word[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int prize;
		int answer1;
		int answer2;
		
		prize = sc.nextInt();
		
		answer1 = prize-((prize*22)/100);
		answer2 = prize-((prize-((prize*80)/100))*22)/100;
		
		System.out.println(answer1+" "+answer2);
	}

}
