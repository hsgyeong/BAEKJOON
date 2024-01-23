package practice;

import java.util.Scanner;

public class A10093 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long A;
		A = sc.nextLong();
		
		long B;
		B = sc.nextLong();
		
		if(A!=B)
		{
			if(A<B)
			{
				System.out.println((B-A)-1);
				
				for(long i=(A+1); i<B; i++)
				{	
					System.out.print(i+" ");
				}
			} else if(B<A)
			{
				System.out.println((A-B)-1);
				
				for(long i=(B+1); i<A; i++)
				{
					System.out.print(i+" ");
				}
			}
		}
		else if(A==B)
			System.out.println(0);
	
	}

}
