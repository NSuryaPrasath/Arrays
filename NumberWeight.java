import java.util.Scanner;
class NumberWeight
{	
  
  public static void main(String args[])
  {
	  int[] arr=new int[] {49,36,8,10,12};
	  int  weig[]=new int[arr.length];
	  for(int i=0;i<arr.length;i++)
	  {
		  for(int j=1;j<=arr[i];j++)
		  {
			  if((j*j)==arr[i])
			  {
				  weig[i]=5;
			  }
		  }
		  if((arr[i]%4==0)&&(arr[i]%6)==0)
		  {
			  weig[i]+=4;
		  }
		  if(arr[i]%2==0)
		  {
			weig[i]+=3;  
		  }
	  }
	  for(int i=0;i<weig.length;i++)
	  {
		  for(int j=i+1;j<weig.length;j++)
		  {
			  if(weig[i]<weig[j])
			  {
				  int tem=weig[i];
				  weig[i]=weig[j];
				  weig[j]=tem;
				  int t=arr[i];
				  arr[i]=arr[j];
				  arr[j]=t;
			  }
		  }
	  }
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.print("<"+arr[i]+","+weig[i]+"> ");
	  }
  }
}

