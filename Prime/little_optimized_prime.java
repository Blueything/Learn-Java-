import java.util.*;

class Main{
  public static void main(String args[])
  {
    int num;
    boolean flag=false;
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
            flag=true;
            break;
          }
          
        }
    }
    if(flag==false)
    {
      System.out.println("Prime");
    }
  }
}
