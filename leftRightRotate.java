import java.util.*;
class leftRightRotate
{	
	public static void leftrotate(int ar[],int d,int n)
	{
		for(int i=0;i<d;i++)
		{
			int temp=ar[0],j=0;
			for(int k=1;k<n;k++)
			{
				ar[j]=ar[k];
				j++;
			}
			ar[n-1]=temp;
		}
		System.out.println(Arrays.toString(ar));
	}
	public static void rightrotate(int ar[],int d,int n)
	{
		for(int i=0;i<d;i++)
		{
			int temp=ar[n-1];
			for(int k=n-1;k>0;k--)
			{
				ar[k]=ar[k-1];
			}
			ar[0]=temp;
		}
		System.out.println(Arrays.toString(ar));
	}
	public static void operations(int array[],int element,int length,Scanner sc)
	{
		System.out.println("Enter 1 for Left Rotate and 2 for Right Rotate");
		int operation=sc.nextInt();
		switch(operation)
		{
		case 1:leftrotate(array,element,length);break;
		case 2:rightrotate(array,element,length);break;
		default:System.out.println("You have entered wrong value. Do you want to continue Enter 'y' to continue and 'n' to exit");
		        String yn=sc.next();
		        if(yn.equals("y"))
		        {
		        	operations(array,element,length,sc);
		        }
		        else
		        {
		        	return;
		        }
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Length ");
		int length=sc.nextInt();
		int array[]=new int[length];
                System.out.println("Enter the element to insert into array :");
		for(int i=0;i<length;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Enter the value to rotate the element");
		int element=sc.nextInt();
		operations(array,element,length,sc);
  }
}

