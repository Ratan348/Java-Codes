public class assign7
{
 public static void main(String[] args)
 {
  float mile=45;
  float hour=1;
  float min=40;
  float sec=35;
  float hrs;
  double km;
  System.out.println("Distance = "+ mile + " miles");
  System.out.println("Time taken = " + hour + " hour " + min + " min " + sec + " sec ");
  
  km = mile*1.6;
  hrs=hour+(min/60)+(sec/60*60);
  
  System.out.println("Speed = "+km/hrs + " km/hr " );
 }
}