package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A1629 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long A = Long.parseLong(br.readLine());
		long B = Long.parseLong(br.readLine());
		long C = Long.parseLong(br.readLine());
		
		long m = 1;
		int answer;
		
		for(int i=1; i<=B; i++)
		{
			m *= A; 
		}
		
		answer = m%C;
		
		System.out.println(answer);
		
		
	}

}
