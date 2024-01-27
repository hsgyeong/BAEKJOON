package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A2755 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		String subject;
		double score;
		String grade;
		double grade_score = 0;
		double sum = 0;
		double total_sum = 0;
		double answer = 0;
		
		for(int i=0; i<T; i++)
		{
			st = new StringTokenizer(br.readLine());
			subject = st.nextToken();
			score = Integer.parseInt(st.nextToken());
			grade = st.nextToken();
			
			if(grade.equals("A+"))
				grade_score = 4.3;
			else if(grade.equals("A0"))
				grade_score = 4.0;
			else if(grade.equals("A-"))
				grade_score = 3.7;
			else if(grade.equals("B+"))
				grade_score = 3.3;
			else if(grade.equals("B0"))
				grade_score = 3.0;
			else if(grade.equals("B-"))
				grade_score = 2.7;
			else if(grade.equals("C+"))
				grade_score = 2.3;
			else if(grade.equals("C0"))
				grade_score = 2.0;
			else if(grade.equals("C-"))
				grade_score = 1.7;
			else if(grade.equals("D+"))
				grade_score = 1.3;
			else if(grade.equals("D0"))
				grade_score = 1.0;
			else if(grade.equals("D-"))
				grade_score = 0.7;
			else if(grade.equals("F"))
				grade_score = 0.0;
			
			sum += score*grade_score;
			total_sum += score;
		}
		
		answer = sum/total_sum;
		
		bw.write(String.format("%.2f", answer));
		br.close();
		bw.flush();
		br.close();
	}
}
