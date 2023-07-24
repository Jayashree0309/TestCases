package TestCases;

import java.util.Scanner;

public class TestCase6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value: ");
		String a=s.next();
		char str[]=a.toCharArray();
		for(int i=0;i<str.length;i+=2) {
			int c=str[i+1]-'0';
			while(c-- >0) {
				System.out.print(str[i]);
			}
		}
		

	}

}
