package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A18883 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int X = N*M;
		int count = 0;
		int num = 1;
		int answer = 0;
		
		for(int i=0; i<X; i++)
		{
			count++;
		}
		
		//System.out.println(count);
		for(int k=0; k<N; k++)
		{	
			for(int j=0; j<M; j++)
			{
				answer = num++;
				bw.write(Integer.toString(answer));
				
				if(j<M-1)
				{
					bw.write(" ");
				}
			}
			bw.write("\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
