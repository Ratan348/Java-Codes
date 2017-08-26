import java.util.Scanner;
class assign21
{
 public static void main(String args[])
 {
  System.out.println("\t Sum of two Numbers");
  
  System.out.println(" enter a number ");
  
  Scanner sc=new Scanner(System.in);
  
  int a= sc.nextInt();
  
  System.out.println(" Enter second number ");
  
  int b= sc.nextInt();
  
  int c=a+b;
  System.out.println("Sum of a="+a +" and b= "+ b +" is = "+c);
  }
}