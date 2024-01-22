package practice;

import java.util.Scanner;

public class A30957 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		String word;
		word = sc.next();
		
		char chr;
		String ch;
		
		int s = 0;
		int b = 0;
		int a = 0;
		
		char arr[] = new char[n];
		
		for(int i=0; i<n; i++)
		{
			chr = word.charAt(i);
			ch = Character.toString(chr);
			
			if(ch.equals("S"))
			{
				s++;
			}
			else if(ch.equals("B"))
			{
				b++;
			}
			else if(ch.equals("A"))
			{
				a++;
			}
		}

		String answer = null;
		
		if(s>b && s>a)
			answer = "S";
		
		else if(b>s && b>a)
			answer = "B";
		
		else if(a>s && a>b)
			answer = "A";
		
		else if(a>s && b>s && a==b)
			answer = "BA";
		
		else if(a>b && s>b && a==s)
			answer = "SA";
		
		else if(b>a && s>a && b==s)
			answer = "BS";
		
		else if(a==b && a==s && b==s)
			answer = "SCU";
		
		System.out.println(answer);
	}

}
