package practice;

import java.util.Scanner;

public class Club {

	public static void main(Strings[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String c;
		String answer = null;
		
		c = sc.next();
		
		if(c.equals("M"))
			answer = "MatKor";
		else if(c.equals("W"))
			answer = "WiCys";
		else if(c.equals("C"))
			answer = "CyKor";
		else if(c.equals("A"))
			answer = "AlKor";
		else if(c.equals("$"))
			answer = "$clear";
		
		System.out.println(answer);
		
	}

}
