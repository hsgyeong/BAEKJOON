package practice;

import java.util.Scanner;

public class School {

	public static void main(Strings[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Strings school;
		
		school = sc.next();
		
		if(school.equals("NLCS"))
			System.out.println("North London Collegiate School");
		else if(school.equals("BHA"))
			System.out.println("Branksome Hall Asia");
		else if(school.equals("KIS"))
			System.out.println("Korea International School");
		else
			System.out.println("St. Johnsbury Academy");
	}

}
