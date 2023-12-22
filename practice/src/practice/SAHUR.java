package practice;

import java.util.Scanner;

public class SAHUR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n;
		int H;
		int M;
		
		n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			H = sc.nextInt();
			M = sc.nextInt();
			
			if(H==0&&M>45)
			{	H = 0;
				M = M-45;
			}
			else if(H==0&&M<45) {
				H = 23;
				M = (60+M)-45;
			}
			else if(H!=0&&M<45)
			{
				H = H-1;
				M = (60+M)-45;
			}
			else if(H!=0&&M>45)
			{	
				M = M-45;}
			else if(H==0&&M==0)
			{
				H = 23;
				M = 60-45;
			}
			else if(H!=0&&M==0)
			{
				H = H-1;
				M = 60-45;
			}
			
			
			System.out.println("Case #"+(i+1)+": "+H+" "+M);
		}
		
		
	}

}
