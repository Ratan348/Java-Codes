import java.util.Scanner;
class assign11
{
	static double convertToFahrenheit(double x)
	{
		double c;
		double p;
		p=9.0/5.0;
		c= p* x + 32;
		 System.out.println("value of p: "+p);
	 
		return c;
	
	}
 public static void main(String args[])
 {
	
	 double celsius,fahrenhiet;
	 
	 System.out.println("_____ Celsius to Fahrenheit ____");
	 System.out.println("\n\n\n\n");
	 System.out.println(" \t Enter temperature in Celsius_");
	 
      Scanner sc=new Scanner(System.in);	 
	 double s = sc.nextInt();
	 fahrenhiet=convertToFahrenheit(s);
	 System.out.println("In Fahrenheit : "+ fahrenhiet);
   
   }
}