package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A25206 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st; 
		
		String subject;
		double score;
		String grade;
		double grade_score = 1;
		double sum = 0;
		double sub_sum = 0;
		double avg;
		
		for(int i=0; i<20; i++)
		{			
			st =  new StringTokenizer(br.readLine());
			
			subject = st.nextToken();
			score = Double.parseDouble(st.nextToken());
			grade = st.nextToken();
		
		if(!grade.equals("P")) {
			
			if(grade.equals("A+"))
				grade_score = 4.5;
			else if(grade.equals("A0"))
				grade_score = 4.0;
			else if(grade.equals("B+"))
				grade_score = 3.5;
			else if(grade.equals("B0"))
				grade_score = 3.0;
			else if(grade.equals("C+"))
				grade_score = 2.5;
			else if(grade.equals("C0"))
				grade_score = 2.0;
			else if(grade.equals("D+"))
				grade_score = 1.5;
			else if(grade.equals("D0"))
				grade_score = 1.0;
			else if(grade.equals("F"))
				grade_score = 0.0;
			
			sum += score;
			
			sub_sum += grade_score*score;
			
			}	
		}	
		avg = sub_sum/sum;
		
		String answer = String.format("%.6f", avg);
		bw.write(answer);

		br.close();
		bw.flush();
		bw.close();
	}
	
}
