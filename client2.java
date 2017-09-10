import java.util.Scanner;
import java.net.*;
import java.io.*;

class client2
{
 public static void main(String[] args)
 {
   System.out.println("Search your query...");
   Scanner sc=new Scanner(System.in);
   
   try{
   Socket s=new Socket("localhost",1010);
   DataOutputStream dout=new DataOutputStream(s.getOutputStream());
   dout.writeUTF("Search my ROOM");
   
   DataInputStream dis=new DataInputStream(s.getInputStream());
   
   while(true)
   {
	   
   String st=dis.readUTF();
   System.out.println("Server : "+ st);
   String str2=sc.nextLine();
   dout.writeUTF(str2);
   
   
   
   }
   
   
   }
   catch(Exception e)
   {
	   
   }
 }
}