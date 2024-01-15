package practice;

import java.util.Scanner;

public class A10886 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N; 
		N = sc.nextInt();
		int num;
		int cute = 0;
		int notcute = 0;
		
		for(int i=0; i<N; i++)
		{
			num = sc.nextInt();
			if(num == 1)
				cute++;
			
			if(num == 0)
				notcute++;
		}
		
		if(cute>notcute)
		{
			System.out.println("Junhee is cute!");
		}
		else if(cute<notcute)
		{
			System.out.println("Junhee is not cute!");
		}
	}

}
