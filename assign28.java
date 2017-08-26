import java.util.Scanner;
class assign28
{
 public static void main(String args[])
 {
  System.out.println("Star Pattern");
  
  Scanner sc=new Scanner(System.in);
  System.out.println("\t\t Input an integer to set the Limit of Pattern");
  
  int n=sc.nextInt();
  System.out.println("You have set the Limit to n= " +n);
  
  int lc=1;
  int sp=n;
  int pnt=0;
  
  while(lc<=n)
  {
	  sp=n-lc;
	  while(sp>0)
	  {
	  System.out.print("  ");
	  sp-=1;
	  }
	  
	  pnt=lc;
 
      while(pnt>0)
	  {
		  System.out.print("  * ");
		  pnt-=1;
	  }
	  System.out.println("\n");
	  lc+=1;
 }
  

 }
}