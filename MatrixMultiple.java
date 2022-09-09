import java.util.Scanner;
class MatrixMultiple
{	
  public static void display(int[][] arr,int ro,int col)
  {
	  for(int i=0;i<ro;i++)
	  {
		  for(int j=0;j<col;j++)
		  {
			  System.out.print(arr[i][j]+" ");
		  }
		  System.out.println();
	  }
  }
  public static void multiply(int res[][],int a[][],int b[][],int r1,int c1,int r2,int c2)
  {
	  int ro=0;
	  for(int i=0;i<c1;i++)
	  {
		  for(int j=0;j<c2;j++)
		  {
			  res[i][j]=((a[i][ro])*(b[ro][j])+(a[i][ro+1]*b[ro+1][j]));
		  }
	  }
  }
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Row and Column Value for A Matrix");
	  int r1=sc.nextInt(),c1=sc.nextInt();
	  int arr1[][]=new int[r1][c1];
	  for(int i=0;i<r1;i++)
	  {
		  for(int j=0;j<c1;j++)
		  {
			  System.out.print("Enter value for "+(i+1)+" row "+(j+1)+" Column ");
			  arr1[i][j]=sc.nextInt();
		  }
	  }
	  System.out.println("Enter the Row and Column Value for B Matrix");
	  int r2=sc.nextInt(),c2=sc.nextInt();
	  int arr2[][]=new int[r2][c2];
	  for(int i=0;i<r2;i++)
	  {
		  for(int j=0;j<c2;j++)
		  {
			  System.out.print("Enter value for "+(i+1)+" row "+(j+1)+" Column ");
			  arr2[i][j]=sc.nextInt();
		  }
	  }
	  int res[][]=new int[r1][c2];
	  System.out.println("Array 1 Matrix ");
	  display(arr1,r1,c1);
	  System.out.println("Array 2 Matrix ");
	  display(arr2,r2,c2);
	  multiply(res,arr1,arr2,r1,c1,r2,c2);
	  System.out.println("Result Matrix ");
	  display(res,r1,c2);
  }
}