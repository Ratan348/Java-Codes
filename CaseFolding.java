import java.util.Scanner;
class CaseFolding
{
 public static void main(String[] args)
 {
	 System.out.println("Enter a String : \n");
	 Scanner sc=new Scanner(System.in);
	 String s=sc.nextLine();
	 char[] ch=s.toCharArray();
	 char store='\0';
	 int k=0;
	 int cal;
	 for(int i=0;i<ch.length;i++)
	 {   
          char a=ch[i];
          cal=(int)a;
		 
		 if(cal>=65 && cal<=90)
		 {
		 k=(int)ch[i]+32;
		 ch[i]=(char)k;
		 
		 }
	    else
		{
			
		}
	 }
	 System.out.println("\n");
	 for(int i=0;i<ch.length;i++)
	 {
		 System.out.print(""+ch[i]);
	 }
 }
}