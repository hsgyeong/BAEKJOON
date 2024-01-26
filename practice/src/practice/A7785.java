package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

public class A7785 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String name;
		String check;
		
		int n;
		n = Integer.parseInt(st.nextToken());
		
		HashSet<String> work = new HashSet<>();
		
		for(int i=0; i<n; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			name = st.nextToken();
			check = st.nextToken();
			
			if(check.equals("enter"))
			{
				work.add(name);
			}
			else if(check.equals("leave"))
			{
				work.remove(name);
			}
		}
		
		ArrayList<String> list = new ArrayList<>(work);
	
		Collections.sort(list, Comparator.reverseOrder());	
		
		for(String answer: list)
		{
			bw.write(answer+"\n");
		}
			
		br.close();
		bw.flush();
		bw.close();
	}

}
