import java.util.Scanner;
class assign22
{
	public static void main(String args[])
	{
      System.out.println("ODD EVEN CHECKING");
      Scanner sc=new Scanner(System.in);
      int k=sc.nextInt();
 
     if(k%2==0)
      {
	   System.out.println("The number k= "+k+ "is even");
      }
     else
     {
	 System.out.println("The Number k= "+k+" is ODD");
     }
 }
}