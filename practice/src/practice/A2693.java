package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A2693 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[10];
		
		for(int j=0; j<N; j++)
		{	
			st = new StringTokenizer(br.readLine());
			
			for(int i=0; i<10; i++)
			{
				arr[i] = Integer.parseInt(st.nextToken());
			}
		
		Arrays.sort(arr);
		
		bw.write(Integer.toString(arr[arr.length-3])+"\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
