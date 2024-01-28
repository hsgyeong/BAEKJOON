package practice;

import java.util.Scanner;

public class A10480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int num;
		
		for(int i=0; i<n; i++)
		{
			num = sc.nextInt();
			
			if(num>0)
			{
				if(num%2==0)
				{
					System.out.println(num+" is even");
				}
				else 
					System.out.println(num+" is odd");
			}
			else if(num<0)
			{
				if((num*-1)%2==0)
				{
					System.out.println(num+" is even");
				}
				else if((num*-1)%2!=0)
				{
					System.out.println(num+" is odd");
				}
			}
			else
				System.out.println(num+" is even");
		}
	}

}
