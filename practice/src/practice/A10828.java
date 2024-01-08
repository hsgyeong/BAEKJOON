package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class A10828 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			Stack stack = new Stack();
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int N;
			N = Integer.parseInt(br.readLine());
			
			String order; 
			
			StringTokenizer st;
			
			for(int i=0; i<N; i++)
			{
				st = new StringTokenizer(br.readLine());
				
				order = st.nextToken();
				bw.write(order);
				
				if(order.equals("push"))
				{
					stack.push(Integer.parseInt(st.nextToken()));
				}
				else if(order.equals("top"))
				{
					System.out.println();
				}
			}
			br.close();
			
			bw.flush();
			bw.close();
		
		
		

	}

}
