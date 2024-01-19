package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class A1764 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N;
		int M;
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
	
		HashSet<String> dudSet = new HashSet<>();
		for(int i=0; i<N; i++)
		{
			dudSet.add(br.readLine());
		}
		
		TreeSet<String> commonSet = new TreeSet<>();
		for(int j=0; j<M; j++)
		{
			String boName = br.readLine();
			if(dudSet.contains(boName))
			{
				commonSet.add(boName);
			}
		}
		
		String dudbo [] = commonSet.toArray(new String[0]);
		
		bw.write(dudbo.length+"\n");
		
		for(String name : dudbo)
		{
			bw.write(name+"\n");
		}
		
			br.close();
			bw.flush();
			bw.close();
		}
		
	}

