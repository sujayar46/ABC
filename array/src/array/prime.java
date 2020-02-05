package array;
import java.util.Scanner;
public class prime 
{
	public static void main(String args[])
	{
		System.out.print("enter the prime number");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
				
			}
		}
			if(count==2)
			{
				System.out.print("prime");
			}
				else
				{
					System.out.print("not prime");
				}
				
			
				}
			}
		
	
		
	

