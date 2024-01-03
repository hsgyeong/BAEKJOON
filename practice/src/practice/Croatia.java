package practice;

import java.util.Scanner;

public class Croatia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int count = 0;
							
		String alphabet;

		alphabet = sc.next();

		String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

		for (int i = 0; i < alphabet.length(); i++) {
			
			if (i + 3 < alphabet.length() && alphabet.substring(i, i + 3).equals(croatia[2])) {
				count++;
				break;
			} 
			
			if (i + 2 < alphabet.length() && alphabet.substring(i, i + 2).equals(croatia[0]) ||
				i + 2 < alphabet.length() && alphabet.substring(i, i + 2).equals(croatia[1]) ||
				i + 2 < alphabet.length() && alphabet.substring(i, i + 2).equals(croatia[3]) ||
				i + 2 < alphabet.length() && alphabet.substring(i, i + 2).equals(croatia[4]) ||
				i + 2 < alphabet.length() && alphabet.substring(i, i + 2).equals(croatia[5]) ||
				i + 2 < alphabet.length() && alphabet.substring(i, i + 2).equals(croatia[6]) ||
				i + 2 < alphabet.length() && alphabet.substring(i, i + 2).equals(croatia[7])) 
			{
				count++;
				i += 1;   
			} else if (i + 3 < alphabet.length() && alphabet.substring(i, i + 3).equals(croatia[2])) {
				count++;
				i += 2;   
 
			} else if (alphabet.substring(i, i + 1).equals("a") || alphabet.substring(i, i + 1).equals("b") ||
				alphabet.substring(i, i + 1).equals("c") || alphabet.substring(i, i + 1).equals("d") ||
				alphabet.substring(i, i + 1).equals("e") || alphabet.substring(i, i + 1).equals("f") ||
				alphabet.substring(i, i + 1).equals("g") || alphabet.substring(i, i + 1).equals("h") ||
				alphabet.substring(i, i + 1).equals("i") || alphabet.substring(i, i + 1).equals("j") ||
				alphabet.substring(i, i + 1).equals("k") || alphabet.substring(i, i + 1).equals("l") ||
				alphabet.substring(i, i + 1).equals("m") || alphabet.substring(i, i + 1).equals("n") ||
				alphabet.substring(i, i + 1).equals("o") || alphabet.substring(i, i + 1).equals("p") ||
				alphabet.substring(i, i + 1).equals("q") || alphabet.substring(i, i + 1).equals("r") ||
				alphabet.substring(i, i + 1).equals("s") || alphabet.substring(i, i + 1).equals("t") ||
				alphabet.substring(i, i + 1).equals("u") || alphabet.substring(i, i + 1).equals("v") ||
				alphabet.substring(i, i + 1).equals("w") || alphabet.substring(i, i + 1).equals("x") ||
				alphabet.substring(i, i + 1).equals("y") || alphabet.substring(i, i + 1).equals("z")) 
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
