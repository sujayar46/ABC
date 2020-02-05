package array;
import java.util.Scanner;
public class primeliit 
{
	public static void main (String args[])
	{
		System.out.println("enter the limit");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=0;
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=i;j++) 
			{
				if(i%j==0)
				{
					count++;
					
				}
				
			}
			if(count==2)
			{
				System.out.println(i);
				sum++;
				if(sum==10)
				{
					break;
				}
			}
			count=0;
		}
		
	}

}
