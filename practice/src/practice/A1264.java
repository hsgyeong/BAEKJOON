package practice;

import java.util.Scanner;

public class A1264 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String sentence;

		while(true)
		{
			int count = 0;
			
			sentence = sc.nextLine();
		
			if(sentence.equals("#"))
						break;
			
			for(int i=sentence.length(); i>0; i--)
			{
				String spell = sentence.substring(i-1, i);
				
				if(spell.equals("a")||spell.equals("e")||spell.equals("i")
				||spell.equals("o")||spell.equals("u")
				||spell.equals("A")||spell.equals("E")||spell.equals("I")
				||spell.equals("O")||spell.equals("U"))
				{
					count++;
				}
			}
			
			System.out.println(count);
				
		}

	}

}
