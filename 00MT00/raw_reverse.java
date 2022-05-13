import java.util.*;

class Main {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
        String txt;
        
        txt = sc.nextLine();
        
        //String[] empty= txt.split(" ");
        //System.out.print(txt.charAt(i));

        
        for(int i=0;i<txt.length();i++)
        {
            if((txt.charAt(i)) == ' ')   //always use single quote for character in java
            {
                System.out.println("");
            }
            else{
                System.out.print(txt.charAt(i));
            }
            
            
         }
        
	}
}

