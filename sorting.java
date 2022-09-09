import java.util.*;
class sorting
{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array length :");
		int n=sc.nextInt();
		int arr1[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr1[i]=sc.nextInt();
			}
   		int temp[]=arr1.clone(),s=0,l=n-1;
   		boolean f=true;
   		System.out.print("Input : {");
   		for(int i=0;i<n;i++)
   		{
    			System.out.print(temp[i]+" ");
   		}
   		Arrays.sort(temp);
   		System.out.println("}");
   		System.out.println(Arrays.toString(temp));
   		if(n%2==0)
   		{
   			for(int i=n-1;i>=0;i--)
   		    {
    			if(f)
    			{
				  arr1[i]=temp[l--];
			    }
			    else
			    {
				  arr1[i]=temp[s++];
			    }
			    f=!f;
   		     }
   		}
   		else 
   		{
   			for(int i=n-1;i>=0;i--)
   		    {
    			if(f)
    			{
				  arr1[i]=temp[s++];
			    }
			    else
			    {
				  arr1[i]=temp[l--];
			    }
			    f=!f;
   		     }
   		}
		System.out.print("Output : {");
		for(int i=0;i<arr1.length;i++)
   		{
     			System.out.print(arr1[i]+" ");
   		}
		System.out.println("}");
  }
}