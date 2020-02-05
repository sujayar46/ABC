package array;
import java.util.Scanner;
public class primelimit
{
	public static void main(String args[])
	{
		System.out.print("enter the prime number");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();


		int count=0;
		for(int i=1;i<=n;i++)
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
			}
			count=0;

		}

	}
}
