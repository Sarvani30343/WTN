package strings;
public class changecase
{
public static void main(String[]args)
{
//toggling
    String s1="SarVAni";
    String s2="";
    for(int i=0;i<s1.length();i++)
    {
    if(Character.isUpperCase(s1.charAt(i)))
    {
        s2=s2+Character.toString(s1.charAt(i)).toLowerCase();
    }
    else if(Character.isLowerCase(s1.charAt(i)))
    {
        s2=s2+Character.toString(s1.charAt(i)).toUpperCase();
    }
}
    System.out.println(s2);
}


}



