import java.io.*;
import java.util.*;




public class Firstrepeat {
  public static void main(String args[])throws IOException
  {
    int n,p,t;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    int ar[]=new int[n];
    for(int i=0;i<n;i++)
    ar[i]=s.nextInt();
    
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(ar[i]>ar[j])
        {
          t=ar[i];
          ar[i]=ar[j];
          ar[j]=t;
        }
      }
    }
    for(int i=0;i<n-1;i++)
    {
      if(ar[0]==ar[i+1])
      {
        i++;
        //continue;
        System.out.println(ar[i]);
      }
      
      else
      {
        
        
      System.out.println(""); }
      
    }
    
  }
}
