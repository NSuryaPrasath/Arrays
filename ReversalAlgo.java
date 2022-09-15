import java.util.*;
//Reversal Algorithm
class ReversalAlgo
{	
	public static void leftrotate(int ar[],int s,int e) {
		for(;s<e;s++)
		{
			for(int j=s+1;j<e;j++)
			{
				int temp=ar[s];
				  ar[s]=ar[j];
				  ar[j]=temp;
			}
		}
	}
	public static void reverse(int ar[],int l,int d)
	{
		int a=d,b=l-d;
		leftrotate(ar,0,d);
		leftrotate(ar,d,l);
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
			  int tem=ar[i];
			  ar[i]=ar[j];
			  ar[j]=tem;
			}
		}
		System.out.println("Left Rotation "+Arrays.toString(ar));
	}
	public static void rightrotate(int ar[],int l,int d)
	{
		for(int i=l-1;i>d;i--)
			{
				for(int j=i-1;j>d;j--)
				{
				  int temp=ar[i];
				  ar[i]=ar[j];
				  ar[j]=temp;
				}
			}
		for(int i=0;i<=d;i++)
		{
			for(int j=i+1;j<=d;j++)
			{
			  int temp=ar[i];
			  ar[i]=ar[j];
			  ar[j]=temp;
			}
		}
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
			  int tem=ar[i];
			  ar[i]=ar[j];
			  ar[j]=tem;
			}
		}
		System.out.println("Right Rotation "+Arrays.toString(ar));
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Length ");
		int length=sc.nextInt();
		int array[]=new int[length];
		System.out.println("Enter the element for the array ");
		for(int i=0;i<length;i++)
		{
			array[i]=sc.nextInt();
		}
		int len=array.length;
		int array2[]=Arrays.copyOf(array,len);
		System.out.println("Enter the value to rotate the element");
		int element=sc.nextInt();
		reverse(array2,len,element);	
		rightrotate(array,len,element);
  }
}