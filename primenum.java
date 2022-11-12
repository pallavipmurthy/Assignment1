package basics;

import java.util.Scanner;

public class primenum {

	public static void main(String[] args) {
		int n=0;
		boolean isPrime=true;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number To Check Prime Or Not");
		n=scan.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				isPrime=false;
			// TODO Auto-generated method stub
			}
			if(isPrime==true)
			{
				System.out.println(n+"Prime Number");
			}
			else
			{ 
				System.out.println(n+"Not a Prime Number");
		     }
		}
		scan.close();
	}

}
