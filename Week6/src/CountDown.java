/*
Jakob Vendegna
CSC 161 201
Date

Description:
*/
import java.util.Scanner;

public class CountDown {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Count Down: Please input the starting number");
		int countFrom = kb.nextInt();
		count(countFrom);


	}

	public static boolean count(int c) {
		if (c == 0) {
			System.out.println(c);
			return true;
		}
		else {
			for(int i = 0; c > i; c--) {

				System.out.println(c);
				
			}
            return count(c);
	    }
    }
}