package practice;

import java.util.Scanner;

public class Seminar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String seminar;
		int n;
		n = sc.nextInt();
		
		for(int i=0; i<=n; i++)
		{
			seminar = sc.next();
			if(seminar.equals("Algorithm"))
				System.out.println("204");
			else if(seminar.equals("DataAnalysis"))
				System.out.println("207");
			else if(seminar.equals("ArtificialIntelligence"))
				System.out.println("302");
			else if(seminar.equals("CyberSecurity"))
				System.out.println("B101");
			else if(seminar.equals("Network"))
				System.out.println("303");
			else if(seminar.equals("Startup"))
				System.out.println("501");
			else if(seminar.equals("TestStrategy"))
				System.out.println("105");
		}
	}

}
