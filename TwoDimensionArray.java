//2D Array of string
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class TwoDimensionArray
{
  public static void main(String args[])
  {
    String[][] arr={{"luke","shaw"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int count=0;
    for(int i=0;i<arr.length;i++)
    {
        if(s.equals(arr[i][1]))
        {
           String gc=arr[i][0];
           for(int j=0;j<arr.length;j++)
           {
              if(gc==arr[j][1])
              {
    		count++;
              }
           }
        }
    }
    System.out.println(s+" has "+count+" Grandchildrens");
  }
}