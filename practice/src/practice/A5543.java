package practice;

import java.util.Arrays;
import java.util.Scanner;

public class A5543 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int burger[] = new int [3];
		int drink[] = new int [2];
		int answer;
		
		for(int i=0; i<3; i++)
		{
			burger[i] = sc.nextInt();
		}
		
		for (int j=0; j<2; j++)
		{
			drink[j] = sc.nextInt();
		}
		
		Arrays.sort(burger);
		Arrays.sort(drink);
		
		answer = burger[0]+drink[0]-50;
		
		System.out.println(answer);;
	}

}
