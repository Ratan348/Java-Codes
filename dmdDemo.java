class a
{
	public void show()
	{
		System.out.println("In Show of class a");
	}
}
class b extends a
{
	public void show()
	{
		System.out.println("In show of class b");
	}
}

public class dmdDemo
{
public static void main(String args[])
 {
   a o1=new a();
   b o2=new b();
   
   o1.show();
   o2.show();
   
   a o3=new b();
   
   o3.show();
   //b o4=new a();
 }
}
