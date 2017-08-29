import java.util.Scanner;
class WhiteSpaceTokenizer
{
	
 public static void main(String args[])throws Exception
 {
	 String save="";
	 System.out.println("input a String ");
	 Scanner sc=new Scanner(System.in);
	 
	 String s=sc.nextLine();                   //Inputs a string.
	 
	 s=s+" ";
	 System.out.println(" \n\n");

     char[] arr=s.toCharArray();    //Converts string into characater
     int set=arr.length;   //calculates length of array and returns to the set variable 
	 String[] store=new String[set];	
	 
	 char[] ch=new char[100];
	  
	 int count=0;
	      
	 System.out.println("\n\n");
	 int i=0;
	 int j=0;
	 
	 System.out.println("length of array "+set);
	 
	 try{
		 
	 while(i<arr.length)
	 {
		 
		 if(arr[i]!=' ')
		 {
			 ch[j]=arr[i];	 
		 }
		 else if(arr[i]==' ')
		 {
			
			 char[] str=ch;
			 save=new String(str);
			 store[count]=save;
			 j= -1;
			 ch=new char[50];
			 count++; 		 
		  } 
		 
		 i++;
		 j++;
		 
     }
	 
	    }
	  
	  catch(Exception e)
	  {
		  
	  }
         int fix=store.length;  // calculates size of store
		 System.out.println("length of string array "+fix);
	  
	  count=0;
	  System.out.println("The tokens of the input string are :- \n");
	  while(store[count]!=null)
	  {
		  System.out.println(store[count]+"\n");
		  count++;
	  }
	 
 }
 }