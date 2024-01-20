package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A10258 {
	
	static Queue<Integer> queue = new LinkedList<Integer>();
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N;
		N = Integer.parseInt(br.readLine());
		int num = 0;
		int size = 0;
	
		String order;
		
		for(int i=0; i<N; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			order = st.nextToken();
			
			switch(order){			
				case "push" : 
					
					num = Integer.parseInt(st.nextToken());
					push(num);
					size++;
					break;
				
				case "pop" :
					if(queue.isEmpty())
					{	
						bw.write("-1\n");
					}	
					else
						{
							bw.write(queue.poll()+"\n");
							size--;
						}
					break;
						
				case "size":
					bw.write(Integer.toString(size)+"\n");
					break;
			
				case "front":
					if(queue.isEmpty())
					{
						bw.write("-1\n");
					}
					else
						bw.write(queue.peek()+"\n");
					break;
				
				case "empty":
					if(queue.isEmpty())
						bw.write("1\n");
					else
						bw.write("0\n");
					break;
					
				case "back":
					if(queue.isEmpty())
					{
						bw.write("-1\n");
					}
					else
						bw.write(((LinkedList<Integer>)queue).peekLast()+"\n");	
					break;
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}

	private static void push(int num) {
		// TODO Auto-generated method stub
		queue.add(num);
	}

}
