package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A11441 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); 
		int arr[] = new int [N];
		int answer = 0;
		
		st = new StringTokenizer(br.readLine());
		
		for(int a=0; a<N; a++)
		{
			arr[a] = Integer.parseInt(st.nextToken()); 
		}
		
		int M = Integer.parseInt(br.readLine()); 
		
		for(int b=0; b<M; b++)
		{
			answer = 0;

			st = new StringTokenizer(br.readLine());
			
			int i = Integer.parseInt(st.nextToken()); 
			int j = Integer.parseInt(st.nextToken()); 
			
			for(int k=i-1; k<j; k++)
			{
				answer += arr[k];
			}
			bw.write(Integer.toString(answer)+"\n");
		
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
