package basics;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int N=0,temp=0,rem=0,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter A Number To Check it is a Palindrome:");
		N=scan.nextInt();
		temp=N;
		while(temp>0)
		{
		rem=temp%10;
		sum=sum*10+rem;
		temp=temp/10;
		}
		if(N==sum) {
		System.out.println("The Given number is palindrome"+sum);
		}
		else {
			System.out.println("The Given number is not a palindrome"+sum);
		}
	}

}
