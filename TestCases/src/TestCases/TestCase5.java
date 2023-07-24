package TestCases;

import java.util.Scanner;

public class TestCase5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		int sum=0;
		while(n!=0) {
			int d=n%10;
			sum =sum+d;
			n=n/10;
			
		}
		System.out.println("Addition of digits:"+sum);
		

	}

}
