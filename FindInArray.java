import java.util.Scanner;

class one 
{
	Scanner sc;
	private int k;
	private int[] store;
	void input()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int set=sc.nextInt();
		
		
		store =new int[set];
		System.out.print("OKAY! now Start entering your data_\n");
		for(int i=0;i<store.length;i+=1)
		{
			store[i]=sc.nextInt();
		}
	}
	void display()
	{
		System.out.println("You have entered data below_");
		for(int i=0;i<store.length;i+=1)
		{
		System.out.println(store[i]);
	    }
	}
	void search()
	{
		System.out.println("Enter the data you want to search_");
		k=sc.nextInt();
	}
	String find()
	{
		String s="";
		for(int i=0;i<store.length;i+=1)
		{
			if(store[i]==k)
			{
				s="Input data is found";
			}
			else
			{
				s="No such data is found";
			}
		}
	 return s;
	}
  
   void showResult(String save)
   {
	   System.out.println("   "+save);
   }   
}

class FindInArray
{
  public static void main(String args[])
  {
	  one o1=new one();
	  o1.input();
	  o1.display();
	  o1.search();
	  String res=o1.find();
	  o1.showResult(res);
  }
}