import java.util.*;

class Main {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    String txt;
	    txt = sc.nextLine();
	    
	    HashMap<Character, Integer> dict = new HashMap<Character, Integer>();
	    
	    for(Character ch : txt.toCharArray())
	    {
	        if(dict.containsKey(ch))
	        {
	            dict.put(ch, dict.get(ch)+1);
	        }
	        else
	        {
	            dict.put(ch,1);
	        }
	    }
	    
	    dict.forEach((k,v) -> System.out.println(k+"->"+v));
	    
	    
	}
}
