import java.util.Scanner;
class assign24
{
 public static void main(String args[])
 {
  System.out.println("__Swaping using a third varible__");
 
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter a Number__");
  int x=sc.nextInt();
  
  System.out.println("Enter another NUmber__");
  int y=sc.nextInt();
  
  System.out.println("You have entered x= "+x+" y= "+y);
  
  int k;
  k=y;
  y=x;
  x=k;
  System.out.println("\n\n After Swaping :\t x= "+x +" y= "+y);
  }
}