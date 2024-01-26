package practice;

import java.util.Scanner;

public class A11365 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String spell;
		
		while(true)
		{
			String sentence = sc.nextLine();
			
			if(sentence.equals("END"))
				break;
			
			for(int i=sentence.length(); i>0; i--)
			{
				spell = sentence.substring(i-1, i);
				System.out.print(spell);
			}
			System.out.println();
		}
	}

}
