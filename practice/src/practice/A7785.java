package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
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
		
		ArrayList<String> work = new ArrayList<>();
		ArrayList<String> answer = new ArrayList<>();
		
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
		
		for(int j=work.size()-1; j>=0; j--)
		{
			answer.add(work.get(j));
		}
		
		Collections.sort(answer, Collections.reverseOrder());
		
		for(String a :  answer)
		{
			bw.write(a+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
