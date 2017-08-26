import java.util.Scanner;
import java.lang.*;
class assign27
{
	static long CountDigit(long z)
	{
		int count=0;
		while(z!=0)
		{
			
			int p=(int)z%10;
			z=z/10;
			count++;
		}
		
		System.out.println("Size of digit " +count);
		
	return count;
	}
	
	static long reverse(long b,int c)
	{
		c=c-1;
		System.out.println("Value of C: "+c);
        int d=1;
		long sum=0;
		while(b!=0)
		{
 			d=(int)b%10;
			b=b/10;
			sum=sum+(long)d*(long)Math.pow(10,c);
		    c--;
	    }
		System.out.println("sum si "+sum);
	return sum;
	}
	
	static void compare(long p,long q)
	{
		System.out.println("p="+p+" Q= "+q);
		if (p==q)
		{
			System.out.println("p= "+p+" is a palindrome Number");
		}
		else
		{
			System.out.println("\n\n p= "+p+" is not a Palindromw NUmber");
		}
	}
	
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  
  System.out.println(" Palindrome Number Check ");
  System.out.print(" \n\n \tEnter a number_ ");
  
  long k=sc.nextLong();
  
  int n=(int)CountDigit(k);
 
  long result=reverse(k,n);
  
  compare(result,k);
  
 }
}