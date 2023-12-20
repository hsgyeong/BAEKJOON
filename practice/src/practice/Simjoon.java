package practice;

import java.util.Scanner;

public class Simjoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int T;
		int height;
		int weight;
		double BMI;
		
		T = sc.nextInt();
		for(int i=0;i<T;i++)
		{		
		
		height = sc.nextInt();
		weight = sc.nextInt();
		BMI = weight/((height*0.01)*(height*0.01));
		
		if(height<140.1)
			System.out.println(6);
		else if(height>=140.1&&height<146)
			System.out.println(5);
		else if(height>=146&&height<159)
			System.out.println(4);
		else if(height>=159&&height<161&&(BMI<16.0||BMI>=35.0))
			System.out.println(4);
		else if(height>=159&&height<161&&(BMI>=16.0&&BMI<35.0))
			System.out.println(3);
		else if(height>=204)
			System.out.println(4);
		else if(height>=161&&height<204&&(BMI<16.0||BMI>=35.0))
			System.out.println(4);
		else if(height>=161&&height<204&&((BMI>=16.0&&BMI<18.5)||BMI>=30.0&&BMI<35.0))
			System.out.println(3);
		else if(height>=161&&height<204&&(BMI>=18.5&&BMI<20.0)||(BMI>=25.0&&BMI<30.0))
			System.out.println(2);
		else if(height>=161&&height<204&&(BMI>=20.0&&BMI<25.0))
			System.out.println(1);
		}
	}

}
