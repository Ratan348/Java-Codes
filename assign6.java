public class assign6
{
 public static void main(String[] args)
 {
  float d=14;
  float m=45;
  float s=30;
  double miles;
  float hrs;
  System.out.println("Distance Travelled = "+d +"Km");
  
  System.out.println("Time = " + m +" minute "+ s + " second");
 
  System.out.println("__Distance in Miles__ ");
  miles=d/1.6;
  System.out.println(miles+"mile");
  System.out.println("__Time in Hours__");
  hrs=m/60+s/(60*60);
  System.out.println(hrs+"hour");
  System.out.println("__Speed in MILES/HOUR__");
  System.out.println(miles/hrs+"miles/hr");
 }

}