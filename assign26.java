import java.util.Scanner;
class assign26
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
 
   System.out.println("Input a number_");
   int j=sc.nextInt();
   
   System.out.println("Input another Number");
   int k=sc.nextInt();
 
   String s=(j>k)?"j= "+j+" is greater than k= "+k :"j= "+j+" is smaller than k= "+k;
 
   System.out.println("Comparison Result: "+s);
 }
}