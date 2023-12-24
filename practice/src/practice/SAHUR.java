package practice;

import java.util.Scanner;

public class SAHUR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n;
		int hour;
		int minute;
		
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			hour = sc.nextInt();
			minute = sc.nextInt();
	
		if(minute<45)
		{	
			if(hour==0)
				hour=24;
			
			hour = hour-1;
			minute = minute+15;}
		else if(minute>=45)
		{	
			if(minute==0)
				minute=60;
		
			minute = minute-45;
		}
			System.out.println("Case #"+i+": "+hour+" "+minute);
		}
		
	}

}
