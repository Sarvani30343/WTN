package strings;

public class removex {
	public String withoutX(String str) {
	if (str.length() == 0)
	return str;
	if (str.length() == 1){
	if (str.charAt(0) == 'x')
	return "";
	else
	return str;
	}

	if (str.charAt(0) == 'x')
	str = str.substring(1, str.length());

	if (str.charAt(str.length()-1) == 'x')
	str = str.substring(0, str.length()-1);

	return str;
	}
public static void main(String[] args) {
	removex r =new removex();
	String s=r.withoutX("hix");
	System.out.println(s);
}
}
