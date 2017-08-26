import java.util.Scanner;
class assign25
{
 public static void main(String args[])

 {
 
  System.out.println("Checking a number is prime or not__");
  Scanner sc=new Scanner(System.in);
  int k=sc.nextInt();
  
  int i=1;
  int count=0;
  while(i<=k)
  {
	  if(k%i==0)
	  {
		  count++;
	  }
	  i++;
  }

  if(count==2)
  {
	  System.out.println("number is prime");
  }
  else
  {
	  System.out.println("Number is not prime");  
  }
}
}