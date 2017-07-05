import java.util.*;
import java.io.*;
class Largestpossible
{
  public static void main(String[] args)
  {
    System.out.println("ENTER THE NUMBER OF ELEMENTS");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    String[] z=new String[n];
    System.out.println("ENTER THE ELEMENTS");
    for(int x=0;x<n;x++)
    {
      z[x]=s.next();
    }
    for(int k=0;k<z.length;k++)
    {
      String temp=z[k];
      for(int i=0;i<z.length;i++)
      {
        String temp1=z[i];
        for(int j=0;j==0;)
        {
          if(temp.charAt(j)>temp1.charAt(j))
          {
            String swap=z[k];
            z[k]=z[i];
            z[i]=swap;
            break;
          }
          else
          break;
        }
      }
    }
    
    System.out.println("LARGEST NUMBER POSSIBLE IS:");
    
    for(String out:z)
    {
      
      System.out.print(out);
    }
   
  }
} 
