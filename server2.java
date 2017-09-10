import java.util.Scanner;
import java.io.*;
import java.net.*;
class server2
{
 public static void main(String args[])
 {
   
   System.out.println(" \n\n \t\t PORT NUMBER "+ 1010+"\n\n\n\t\t");
      
   try{
   Scanner sc=new Scanner(System.in);   
   ServerSocket s=new ServerSocket(1010);
   Socket ss = s.accept();   
  
   DataInputStream dis=new DataInputStream(ss.getInputStream());
   DataOutputStream dou =new DataOutputStream(ss.getOutputStream());	
	
	while(true)
	{
		
   String str=(String)dis.readUTF();
   System.out.println("\t\t\t "+ str);
   
   System.out.println("_");
   
   String str1= sc.nextLine();
    
	dou.writeUTF(str1);
	
	}
   
   }
   catch(Exception e)
   {
	   
   }
 }
}