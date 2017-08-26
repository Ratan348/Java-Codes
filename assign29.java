import java.util.Scanner;
class assign29
{
	public static void main(String args[])
	{
		System.out.println(" Star Pattern ");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a limit of Pattern_");
		int n=sc.nextInt();
	    
        int pnt,lc,k;
		k=1;
		while(n>0)
		{
			lc=k;
			pnt=n;
			while(pnt>0)
			{
				System.out.print("  * ");
				pnt-=1;
			}
			System.out.print("\n");
			
			while(lc>0)
			{
				System.out.print("  ");
			    lc-=1;
			 }
			 k+=1;
		n-=1;
		}
	   
	}
	
}