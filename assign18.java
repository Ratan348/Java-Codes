import java.util.Scanner;
class assign
{
    	double x;
		double y;
		double c;
	
	    void input()
		{
			    Scanner sc=new Scanner(System.in);
	      		
				System.out.print("\n\n Enter x-coordinate:");
				x=sc.nextDouble();
				
				System.out.println("Enter y-coordinate: ");
				y=sc.nextDouble();
				
				System.out.println("Enter a constant: ");
				c=sc.nextDouble();
		}
		
        void show()
		{
		 System.out.println(x+"x"+" + "+y+"y"+" = "+c);	
		
		}

        void calValue(assign p1,assign p2)
		{
			double x1=0;
			x1=(p1.c-p1.y)/x;
		}		
}
class assign18
{
	public static void main(String args[])
	{
		System.out.println("Linear Equation__"); 
        
		assign o1=new assign();
	    assign o2=new assign();
		assign o3=new assign();
		o1.input();
		o2.input();
		o1.show();
		o2.show();
		
		o1.calValue(o1,o2);
	}
}

