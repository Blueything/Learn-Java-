public class Main
{
    public static String reverse(String text)
    {
        String rev = "";
        
        for(int i=0; i<text.length();i++)
        {
            char s = text.charAt(i);
            rev = s + rev;
        }
        return rev;
    }
	public static void main(String[] args) {
		System.out.println(reverse("kidrah"));
	}
}
