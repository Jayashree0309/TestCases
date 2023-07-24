package TestCases;

import java.util.Scanner;

public class TestCase8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the value: ");
		int n=s.nextInt();
		int a,b;
		a=b=n;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1) {
					System.out.print(j);
				}
				else if(i==n) {
					System.out.print(a--);
				}
				else if(j==1) {
					System.out.print(i);
				}
				else if(j==n) {
					System.out.print(--b);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
