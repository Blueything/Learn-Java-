/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

class Main
{
  public static void main (String args[])
  {
    int num;
    Scanner sc = new Scanner (System.in);
    num = sc.nextInt ();
    int last = (int) Math.sqrt (num);
    boolean flag=false;
    if (num % 2 == 0)
      {
    	System.out.println ("Not prime");
      }
    else
      {
    	for (int i = 3; i < (last); i = i + 2)
    	  {
    	    if (num % i == 0)
    	      {
        		System.out.println ("Not Prime");
        		flag =true;
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
