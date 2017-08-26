import java.util.Scanner;
class assign14 
{
	static short input()
	{
	 Scanner sc=new Scanner(System.in);	
	 short x=sc.nextShort();
	 return x;
	}	
	
	static void check(short c)
	{
	   if (c>=0 && c<=1000)
        {
         display(c);
        } 
		
       else
       {
	     System.out.println("Please enter a Valid Number in range..");
	     c=input();
		 check(c);
       }	
   		
	}
	
	static void display(short z)
	{
		System.out.println("you have entered " +z);
		sum(z);
	}
	
	static void sum(int z)
	{
		int res=0;
		int sum=0;
		short q=0;
		q=(short)z;
		while(z>0)
		{
			res=z%10;
			z=z/10;
            sum=sum+res;
		}
		System.out.println("sum of digits of "+q + " is "+ sum);
	}
	
 public static void main(String args[])
 {
  System.out.println("___Sum of Integer__");
  System.out.println("Enter a number between 0 and 1000");
  short n=input();
  check(n);
 }
}