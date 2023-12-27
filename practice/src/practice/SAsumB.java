package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SAsumB {

	public static void main(Strings[] args)throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
			int T;
			T = Integer.parseInt(br.readLine());
			StringTokenizer st;
			int A;
			int B;
			int sum;

			for(int i=0; i<T; i++)
			{
				st= new StringTokenizer(br.readLine());
				A = Integer.parseInt(st.nextToken());
				B = Integer.parseInt(st.nextToken());
				sum = A+B;
			
				bw.write(sum+"\n");
			
			}
			br.close();
			
			bw.flush();
			bw.close();
			
	}

}
