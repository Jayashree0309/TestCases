package basicconcepts;

import java.util.Scanner;

public class IncDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=sc.nextInt();
		int b;
		b=++a + a +a++;
		System.out.println(b);
		

	}

}
