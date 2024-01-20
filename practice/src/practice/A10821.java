package practice;

import java.util.Scanner;

public class A10821 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s; 
		s = sc.next();
		int count = 0;
		
		for(int i=0; i<s.length(); i++)
		{
			char a = s.charAt(i);
			
			if(a==',')
			{
				count++;
			}
			
		}
		
		System.out.println(count+1);
	}

}
