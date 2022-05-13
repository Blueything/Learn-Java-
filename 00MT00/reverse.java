import java.util.*;

class Main {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
        String txt;
        String empty="";
        txt = sc.nextLine();
        
        for(int i=0;i<txt.length();i++)
        {
            empty =   txt.charAt(i)+empty;
        }
        
        System.out.println(empty);
	}
}
