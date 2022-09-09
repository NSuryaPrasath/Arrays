import java.util.Scanner;
class Pattern
{	
  
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  String s=sc.nextLine();
	  int m=1;
	  for(int i=0;i<s.length();i++)
	  {
		  for(int j=0;j<s.length();j++)
		  {
			  if(i==j || j==(s.length()-m))
			  {
				  System.out.print(s.charAt(j));
			  }
			  System.out.print(" ");
		  }
		  m++;
		  System.out.println();
	  }
  }
}