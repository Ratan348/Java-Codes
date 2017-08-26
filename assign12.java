import java.util.Scanner;
class assign12
{
	public static final double pi=3.14;
	
	static double AreaOfCylinder(double x)
	{
		double ar;
		ar= pi*x*x;
		return ar;
	}
	
	static double VolumeOfCylinder(double a,double l)
	{
		double v;
		v=a*l;
		return v;
	}
 public static void main(String args[])
 {
	 
 System.out.println("___Cylinder____");
 
 System.out.println("Enter radius of Cylinder(in m)");
 Scanner sc=new Scanner(System.in);
 double radius=sc.nextDouble();
 System.out.println("Radius of Cylinder is =" +radius);
 
 System.out.println("Enter length of Cylinder(in m)");
 double length=sc.nextDouble();
 System.out.println("Length of Cylinder is =" +length); 
 
 System.out.println("\n\n\n");
 
 double area=AreaOfCylinder(radius);
 System.out.println("Area of Cylinder is = " +area+" "+"square metre");
 
 double vol=VolumeOfCylinder(area,length);
 System.out.println("Volume Of Cylinder = " +vol+" "+"meter cube");
 
 }
}