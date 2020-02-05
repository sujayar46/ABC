package array;
import java.util.Scanner;
public class merge 
{
	public static void main(String args[])
	{
		System.out.print("enter the size of array1 =");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		System.out.print("enter the size of array2 =");
		int n=sc.nextInt();
		int a[]=new int[m];
		int b[]=new int[n];
		int c[]=new int[m+n];
		
	
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.print("enter the array1 =");
		System.out.print(i+1);
		a[i]=sc.nextInt();
		
		
	}
	for(int i=0;i<=b.length-1;i++)
	{
		System.out.print("enter array2 =");
		System.out.print(i+1);
		b[i]=sc.nextInt();
		
	}
int count=0;
for(int i=0;i<=a.length-1;i++)
{
	c[count]=a[i];
	count++;
	
}
for(int i=0;i<=b.length-1;i++)
{
	c[count]=b[i];
	count++;
	
}
System.out.print("c = ");
for(int i=0;i<=c.length-1;i++)
{
	System.out.print(" ");
	System.out.print(c[i]);
	
}

}
}
