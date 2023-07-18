package TestCases;
import java.util.*;

public class TestCase4 {

	public static void main(String[] args) {
		int n,m,N;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		n=sc.nextInt();
		System.out.println("Enter m");
		m=sc.nextInt();
		System.out.println("Enter N");
		N=sc.nextInt();
		
		System.out.print("The results are ");
		
		
		for(int i=n;i<=m;i++) {
			int c=i;
			int sum=0,d;
			while(c!=0) {
				d = c % 10;
				sum =sum + d;
				c = c/10;
			}
			if(N==sum) {
				System.out.print(i+" ");
			}
		}
	

	}

}
