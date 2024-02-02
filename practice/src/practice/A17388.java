package practice;

import java.util.Scanner;

public class A17388 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int Soongsil = sc.nextInt();
		int Korea = sc.nextInt();
		int Hanyang = sc.nextInt();
		String answer = "";
		
		if(Soongsil+Korea+Hanyang>=100)
		{
			answer = "OK";
		}
		else
		{
			if(Soongsil > Korea && Hanyang > Korea)
			{
				answer = "Korea";
			}
			else if(Korea>Soongsil && Hanyang>Soongsil)
			{
				answer = "Soongsil";
			}
			else if( Korea>Hanyang && Soongsil>Hanyang)
			{
				answer = "Hanyang";
			}
		}
		
		System.out.println(answer);
	}

}
