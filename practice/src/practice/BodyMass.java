package practice;

import java.util.Scanner;

public class BodyMass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double weight;
		double height;
		double BMI;
		
		weight = sc.nextDouble();
		height = sc.nextDouble();
		
		if(weight/(height*height)>25)
			System.out.println("Overweight");
		else if(weight/(height*height)>=18.5&&weight/(height*height)<=25)
			System.out.println("Normal weight");
		else if(weight/(height*height)<18.5)
			System.out.println("Underweight");
	}

}
