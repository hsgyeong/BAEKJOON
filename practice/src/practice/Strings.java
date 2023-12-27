package practice;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			
			for(int i=0; i<n; i++)
			{
				String s = sc.next();
				
				char a = s.charAt(0);
				char b;
			
				if(s.length()>1)
				{	b = s.charAt(s.length()-1);
				
				System.out.print(a);
				System.out.println(b);
				}
				else {
					b=a;
				System.out.print(a);
				System.out.println(b);
				}
			}
	}

}
