import java.util.Scanner;
class one
{
	private int[] num;
	private int set;
	private int small,great;
	void input()
	{
	 
	 System.out.println("Enter the size of array_");
	 Scanner sc=new Scanner(System.in);
	 set=sc.nextInt();
	 num=new int[set];
     	 System.out.println("Okay , now enter your data...\n");
		 
		 try{
		 
		    for(int i=0;i<num.length;i+=1)
		     {
			 num[i]= sc.nextInt();
	     	 }
		 
		    }
		catch(Exception e)
		{
			
			System.out.println("Please enter valid Input_");
			String[] args={};
			     CompareDataInArray.main(args);
		  }
	 }
	 
	 void display()
	 {
		 System.out.print("\n your input data :- \n");
		 for(int i=0;i<num.length;i+=1)
		 {
			 System.out.print(" "+num[i]);
		 }
	 }
	 
	 void compare()
	 {
		 
		 int i=0;
		 great=num[i];
		 small=num[i];
		  while(i<num.length)
		  {
			  if(great<=num[i])
			  {
				  great=num[i];
			  }
			  if(small>=num[i])
			  {
				  small=num[i];
			  }
			  i++;
		  }
	 }
	 
	 void ShowResult()
	 {
		 System.out.println("\n\nGreatest number in the array is "+great);
		 System.out.println("\nSmallest Number in the array is "+small);
	 }
	 
}
class CompareDataInArray
{
 public static void main(String[] args)
 {
  one o1=new one();
  o1.input();
  o1.display();
  o1.compare();
  o1.ShowResult();
 }
}