package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class A10989 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	int N = Integer.parseInt(br.readLine());
	int arr[] = new int [N];
	
	for(int i=0; i<N; i++)
	{
		int number = Integer.parseInt(br.readLine());
		arr[i] = number;
	}
	
	Arrays.sort(arr);
	
		for(int j=0; j<N; j++)
		{
			bw.write(Integer.toString(arr[j])+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
