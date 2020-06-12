
public class alphabaticorder4 {
public static void main(String[] args) {
	String s = args[0];
	char alph1 = s.charAt(0);
	
	char alph2 = s.charAt(1);
	
    if (alph1 > alph2)

        System.out.println(alph2+" , "+alph1);

    

    else

        System.out.println(alph1+" , "+alph2);
}
}
