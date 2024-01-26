package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class A10867 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		HashSet<Integer> arr = new HashSet<>();
		
		for(int i=0; i<N; i++)
		{
			int number = sc.nextInt();
			arr.add(number);
		}
		
		ArrayList<Integer> num = new ArrayList<Integer>(arr);
		
		Collections.sort(num);
		
		for(int answer: num)
		
		System.out.print(answer+" ");
	}

}
