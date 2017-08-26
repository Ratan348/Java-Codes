import java.util.Scanner;
public class bmi
{
	static double calBmi(float x,float y)
	{
		double weightInKg=(double)(x*0.4535);
		double heightInMetre=(double)(y*0.024);
		
		System.out.println("weight in kg  "+weightInKg);
		System.out.println("height in metre "+heightInMetre);
		
		double result= weightInKg/(heightInMetre);
		
		return result;
	}
	
 public static void main(String args[])
 {
   System.out.println("Welcome ! Please enter your name to Continue...");
   
   Scanner sc=new Scanner(System.in);
   String nm=sc.nextLine();
   System.out.println("Hi "+nm);
   
   System.out.println("This Application will help you to calculate your BMI(Body Mass Index)");
   
   System.out.println("Do you want to Continue \n 1.Yes \n 2.No ");
   
   char ch=sc.next().charAt(0);
   if(ch=='1')
   {
	   System.out.println("You are Successfully Logged IN... ");

	   System.out.print("Please enter your weight (in pounds) only_");
	   int wt=sc.nextInt();
	 
       System.out.print("Now Enter your Height (in Inch)_");
	   int ht=sc.nextInt();
      
       System.out.println("Hi "+nm+"your weight is "+wt+" kg"+"your height is "+ht +"inch");
	   
	   double res=calBmi(wt,ht);
	   System.out.println("Your BMI is "+res);
   }
    
	else if(ch=='2')
	{
		System.out.println("Ok!Visit Next Time");
	}
    else 
	{
		System.out.println("Please press a valid key!");
	}
   sc.close();
   }
}