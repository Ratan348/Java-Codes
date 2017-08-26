class LeftbitShift
{
 public static void main(String args[])
 {
  int a =(int)(Math.pow(2,31)-1);
  int e= -a;
  int b=a;
  int c=8;
  int h=40;
  int f=e+1;
  System.out.println("value of a "+a);
  System.out.println("Value of c " +c);
  c=c<<1;
  System.out.println("value of c shifted left by one bit " +c);
  
  int d=c<<2;
  
  System.out.println("value of c shifted left by two bit "+d);
  System.out.println("value of e "+e);
  System.out.println("value of e+1 "+f);
  
  System.out.println("value of h "+h);
  int k =h>>1;
  System.out.println("value of h shifted right by 1 bit"+k);
  int j =h>>2;
  System.out.println("value of h shifted right by 2 bit"+j);
 }
}