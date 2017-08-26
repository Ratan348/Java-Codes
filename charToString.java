import java.util.Scanner;
class charToString
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Input a String:");
  String str=sc.nextLine();
  
  char[] arr=str.toCharArray();
  int i=0;
  
  char[] store;
  
  while(i<=arr.length)
  {
	  System.out.print(arr[i]);
	  i++;
  }
    int j=0;
	while(j<=5)
	{
		store[j]=arr[i];
		i++;
		j++;
	}
   
     String s=String.valueOf(store);
	 
System.out.println("string is "+s);   
 }
}