package practice;

import java.util.Arrays;
import java.util.Scanner;

public class A11656 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		String arr[] = new String[word.length()];
		
		for(int i=0; i<word.length(); i++)
		{
			arr[i] = word.substring(i, word.length());
		}
		
		Arrays.sort(arr);
		
		for(int j=0; j<word.length(); j++)
		{
			System.out.println(arr[j]);
		}
		
	}

}
