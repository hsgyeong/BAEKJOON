package practice;

import java.util.Scanner;

public class Oven {

	public static void main(Strings[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int hour;
		int minute;
		int m;
		int minutee=0;
		
		hour = sc.nextInt();
		minute = sc.nextInt();
		m = sc.nextInt();
	
		if(m+minute>=60)
		{	hour = hour+((m+minute)/60);
			minutee = (m+minute)%60;
			
			if(hour==24)
				hour=0;
			if(hour>24)
				hour=hour%24;
			
		}
		else if(m+minute<60)
		{	minutee = (m+minute); }	
		
			if(hour==24)
				hour=0;
			if(hour>24)
				hour=hour%24;
			
		 	System.out.println(hour+" "+minutee);
		
	}

}
