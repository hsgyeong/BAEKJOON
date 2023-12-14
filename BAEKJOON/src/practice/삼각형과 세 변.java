package practice;

import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int A;
    	int B;
    	int C;
    	
    	while(true) {
    	
    	A = sc.nextInt();
    	B = sc.nextInt();
    	C = sc.nextInt();
    	
    	if(A==0&&B==0&&C==0)
    		break;
    	
    	
    	if(A>=B+C||B>=A+C||C>=A+B)
    		System.out.println("Invalid");
    	else if(A==B&&A!=C&&B!=C||B==C&&B!=A&&A!=C||A==C&&A!=B&&B!=C)
    		System.out.println("Isosceles");
    	else if(A!=B&&A!=C&&B!=C)
    		System.out.println("Scalene");
    	else if(A==B&&A==C&&B==C)
    		System.out.println("Equilateral");
 
    	}
}
}