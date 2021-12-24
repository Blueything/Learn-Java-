import java.util.*;

class Main{
  public static void main(String args[])
  {
    int num;
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    
    for(int i =2; i<num;i++)
    {
      if(num%i==0)
      {
        System.out.println("Not Prime");
        break;
      }
      if(i==(num-1))
      {
        System.out.println("Prime");
      }
    }
  }
}
