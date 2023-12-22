package practice;

import java.util.Scanner;

public class ChiliPeppers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n;
		String chili;
		int value=0;
		int total=0;
		
		n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			chili = sc.next();
			
			if(chili.equals("Poblano"))
				value = 1500;
			else if(chili.equals("Mirasol"))
				value = 6000;
			else if(chili.equals("Serrano"))
				value = 15500;
			else if(chili.equals("Cayenne"))
				value = 40000;
			else if(chili.equals("Thai"))
				value = 75000;
			else if(chili.equals("Habanero"))
				value = 125000;
			
			total += value;
		}
		
		System.out.println(total);
	}

}
