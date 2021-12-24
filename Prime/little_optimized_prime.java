
import java.util.*;

class Main{
  public static void main(String args[])
  {
    int num;
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    
    if(num%2==0)
    {
        System.out.println("Not prime");
    }
    else
    {
        for(int i =3; i<num;i=i+2)
        {
          if(num%i==0)
          {
            System.out.println("Not Prime");
            break;
          }
          if(i==(num-2))
          {
            System.out.println("Prime");
          }
        }
    }
  }
}
