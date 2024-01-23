package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A11728 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a;
		a = Integer.parseInt(st.nextToken());
		int arrA[] = new int[a];
		
		int b;
		b = Integer.parseInt(st.nextToken());
		int arrB[] = new int[b];
		
		int arrC[] = new int[a+b];
		
		int C[]= new int[a+b];
		
		int answer = 0;
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<a; i++)
		{
			arrA[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		
		for(int j=0; j<b; j++)
		{
			arrB[j] = Integer.parseInt(st.nextToken());
		}
			
		for(int k=0; k<a; k++)
		{				
			arrC[k] = arrA[k];
		}
		
		for(int l=0; l<b; l++)
		{
			arrC[l+a] = arrB[l];
		}
		
		for(int m=0; m<(a+b); m++)
		{
			C[m] = arrC[m];
		}
		
		Arrays.sort(C);
		
		for(int n=0; n<(a+b); n++)
		{
			answer = C[n];
			
			bw.write(Integer.toString(answer)+" ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
