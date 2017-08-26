import java.io.*;
import java.util.Scanner;
public class CandidateCode 
{ 

    public static int[] fibonacci_series(int f1,int f2)
    {
        int i=0;
        int c=0;
        int[] arr=new int[20];
        while(i<=10)
        {
            c=f1+f2;
            arr[i]=c;
            f1=f2;
            f2=c;
            i++;
        }
        return arr;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k1=0;
        int k2=1;
      //  System.out.print("Enter a number_");
        //int k1=sc.nextInt();
        
    //    System.out.print("\n\n Enter second number_");
      //  int k2=sc.nextInt();
        
        int[] res=fibonacci_series(k1,k2);
 
      int j=0;
	  
	  try{
       while(res[j]!=0)
       {
           System.out.println(res[j]);
		   j++;
       }
	  }
	  catch(Exception e)
	  {}
 
    }
}