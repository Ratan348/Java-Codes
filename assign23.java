import java.util.Scanner;
class assign23
{
 public static void main(String args[])
 {
	 System.out.println("__ Swaping of two numbers __");
     System.out.println("Enter a number_");
	 
	 Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
	 
	 System.out.println("Enter another Number_");
	
	 int b=sc.nextInt();
     
	 System.out.println("You have entered \n\t a= "+a+" and b= "+b);
	 
	 a=a+b;
	 b=a-b;
	 a=a-b;
	 
	 System.out.println("After SWaping \n\t : a= "+a+" b= "+b);
 }
}