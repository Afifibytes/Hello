import java.util.Scanner; 

public class HelloWorld
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      int x = s.nextInt();
      int y = s.nextInt();
      sum(x,y);
      System.out.println("Hello,World!");
   }
   
   public int sum(int x, int y)
   {
      return x + y;
   }
   
}
