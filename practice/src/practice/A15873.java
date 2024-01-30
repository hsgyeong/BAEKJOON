package practice;

import java.util.Scanner;

public class A15873 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		int sum = 0;
		
		char arr[] = new char[num.length()];
		
		for(int i=0; i<num.length(); i++)
		{
			arr[i] = num.charAt(i);
		}
		
		for(int j=0; j<num.length(); j++)
		{
			if(num.length()==4)
			{
				if(arr[num.length()-3]=='0'&&arr[num.length()-1]=='0')
				{
					sum = 20;
					break;
				}
			}
			else if(arr[j]=='0')
			{
				if(j+1<num.length())
				 {			
					String stA = Character.toString(arr[j-1])+Character.toString(arr[j]);
				
				 int a = Integer.parseInt(stA);
				 
					 sum = (a+(arr[j+1]-'0'));
					 break;
					 
				 }
				 else if(j+1==num.length())
				 {
					 String stB = Character.toString(arr[j-2]);
					 String stB2 = Character.toString(arr[j-1])+Character.toString(arr[j]);
					 int b = Integer.parseInt(stB);
					 int b2 = Integer.parseInt(stB2);
					 
					 sum = b+b2;
				 }	 
				
			}else if(arr[j]!='0')
			{	
				sum += arr[j]-'0';
			}
		}
		System.out.println(sum);
	}

}
