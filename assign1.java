import java.util.Scanner;
public class assign1
{
   
  public static void main(String[] args)
  {
	  Scanner scan=new Scanner(System.in);
	  char arr[]=new char[500];
      
	  for(int i=0;arr[i]!='\n';i++)
	  {
		  arr[i]=scan.nextChar();
		  System.out.println("Counter is running_");
	  }
  
     for(int i=0;arr[i]!='\0';i++)
	 {
		 System.out.println("tokens are "+arr[i]);
	 }
  
  }

}