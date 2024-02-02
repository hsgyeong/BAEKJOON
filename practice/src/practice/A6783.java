package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A6783 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String sentence = "";
		int english = 0;
		int french = 0;
		String answer = "";
		
		for(int i=0; i<N; i++)
		{
			sentence = br.readLine();
			
			for(int j=sentence.length(); j>0; j--)
			{
				if(sentence.substring(j-1,j).equals("T")||
					sentence.substring(j-1,j).equals("t"))
				{
					english++;
				}
				else if(sentence.substring(j-1,j).equals("S")||
					sentence.substring(j-1,j).equals("s"))
				{
					french++;
				}
			}
		}
		
		if(english > french)
			answer = "English";
		else if(english < french)
			answer = "French";
		else
			answer = "French";
		
		bw.write(answer);
		bw.flush();
		br.close();
		bw.close();
	}

}
