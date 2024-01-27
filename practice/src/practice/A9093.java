package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A9093 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		String sentence;
		
		for(int i=0; i<T; i++)
		{	
			sentence = br.readLine();
			String [] words = sentence.split(" ");
			
			
		for(String word : words) {
			for(int j=word.length()-1; j>=0; j--)
			{
				char ch = word.charAt(j);
			
				bw.write(ch);
			}
			bw.write(" ");
		}
			bw.newLine();		
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
