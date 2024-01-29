package practice;

import java.util.Scanner;

public class A4072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			String sentence = sc.nextLine();
			int idx = 0;
			int count = 0;
			
			String arr[] = new String[sentence.length()];
			String arrA[] = new String[1];
			String reverse = "";
			
			if(sentence.equals("#"))
				break;
			
			for(int i=sentence.length(); i>0; i--)
			{
				if(sentence.substring(i-1,i).equals(" "))
				{
					count++;
				}
				
				arr[idx++] = sentence.substring(i-1,i);
			}
			//	System.out.println(count);
			
			for(int j=0; j<sentence.length(); j++)
			{
				reverse += arr[j];
			}
			
			//System.out.println(reverse);

				String arrB[] = reverse.split(" ");
			
				for(int m=count; m>=0; m--)
				{
					System.out.print(arrB[m]+" ");
				}	
		}
	}

}
