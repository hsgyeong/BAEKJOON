package practice;

import java.util.Scanner;

public class A9506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		int factor = 0;
		int sumfactor= 0;
		
		while(true)
		{
			n = sc.nextInt();
			
			if(n == -1)
				break;
			
			for(int i=1; i<=n; i++)
			{
				if(n%i == 0)
				{
					factor = i;
					
					 sumfactor += factor;
					 
					 if(sumfactor-n==n)
					 {
						 System.out.print(factor);
					 }
					 else 
						 System.out.println(n+" is NOT perfect.");
				}
			}
		}
	}

}
