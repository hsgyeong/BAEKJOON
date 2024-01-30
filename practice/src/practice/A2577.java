package practice;

import java.util.Scanner;

public class A2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int zero = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		
		int multiply = A*B*C;
		String st = Integer.toString(multiply);
		
		for(int i=st.length(); i>0; i--)
		{
			if(Integer.parseInt(st.substring(i-1, i))==0)
			{
				zero++;
			}
			else if(Integer.parseInt(st.substring(i-1, i))==1)
			{
				one++;
			}
			else if(Integer.parseInt(st.substring(i-1, i))==2)
			{
				two++;
			}
			else if(Integer.parseInt(st.substring(i-1, i))==3)
			{
				three++;
			}
			else if(Integer.parseInt(st.substring(i-1, i))==4)
			{
				four++;
			}
			else if(Integer.parseInt(st.substring(i-1, i))==5)
			{
				five++;
			}
			else if(Integer.parseInt(st.substring(i-1, i))==6)
			{
				six++;
			}
			else if(Integer.parseInt(st.substring(i-1, i))==7)
			{
				seven++;
			}
			else if(Integer.parseInt(st.substring(i-1, i))==8)
			{
				eight++;
			}
			else if(Integer.parseInt(st.substring(i-1, i))==9)
			{
				nine++;
			}
			
		}
		
		System.out.println(zero+"\n"+one+"\n"+two+"\n"+three+"\n"
			+four+"\n"+five+"\n"+six+"\n"+seven+"\n"
			+eight+"\n"+nine);
		
	}

}
