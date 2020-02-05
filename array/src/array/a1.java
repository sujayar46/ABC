package array;

import java.util.Scanner;

public class a1 
{
	public static void main (String args[])
	{
		System.out.print("enter the number of canditates =");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print("enter the marks of canditate ");
			System.out.print(i+1);
			System.out.print('=');
			a[i]=sc.nextInt();
		}
		System.out.print("result is ");
		System.out.println();
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print("the marks of candidate ");
			System.out.print(i+1);
			System.out.print('=');
			System.out.println(a[i]);
		}
				
	}

}
