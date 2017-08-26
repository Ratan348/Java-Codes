import java.lang.*;
import java.util.Scanner;
class Distance
{
	int x;
	int y;
 
  void input()
   {
      Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter x Coordinate_");
	  x=sc.nextInt();
	  
	  System.out.println("Enter y Coordinate_");
	  y=sc.nextInt();
	  
   }
   
  void display()
  {
	  
	  System.out.println("X-Coordinate: "+x);
	  System.out.println("Y-Coordinate: "+y);
	  
  }
  
   static double calDist(Distance o1,Distance o2)
  {
	  Distance z=new Distance();
	  z.x=(int)Math.pow((o1.x-o2.x),2);
	  z.y=(int)Math.pow((o1.y-o2.y),2);

      System.out.println("z.x is : "+z.x);
      System.out.println("z.y is : "+z.y);	  
  
	  double res=(double)Math.pow((z.x+z.y),(1.0/2.0));
	  
	  return res;
  }
 public static void main(String args[])
 {
  System.out.println("\t Distance between two given coordinates___\n\n\n");
 
  Distance d1=new Distance();
  Distance d2=new Distance();
  
  d1.input();
  d2.input();
  
  d1.display();
  d2.display();
  
  double dis=calDist(d1,d2);
  
  System.out.println("Distance will be "+dis +" unit");
  }
}