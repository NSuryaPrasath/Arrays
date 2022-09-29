import java.io.*;
import java.util.*;
public class BlockSwap 
{	
	public static void main(String[] args)
	{
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the Length of the array ");
	       int len=sc.nextInt();
	       int array1[]=new int[len];
	       System.out.print("Enter the element ");
	       for(int i=0;i<len;i++)
	       {
	    	   array1[i]=sc.nextInt();
	       }
	       System.out.println("Enter the element to rotate ");
	       int ele=sc.nextInt();
	       leftrotate(array1,ele,len);
	       System.out.println(Arrays.toString(array1));
	}
	public static int[] leftrotate(int ar[],int d,int n)
	{
		if(d==0 || d==n)
		{
		}
		int i=d,j=n-d;
		while(i!=j)
		{
			if(i<j) {
				swap(ar,d-i,d+j-i,i);
				j-=i;
			}
			else
			{
				swap(ar,d-i,d,j);
				i-=j;
			}
		}
		swap(ar,d-i,d,i);
		return ar;
	}
	public static void swap(int ar[],int s,int e,int d)
	{
		for(int i=0;i<d;i++)
		{
			int temp=ar[s+i];
			ar[s+i]=ar[e+i];
			ar[e+i]=temp;
		}
	}
}