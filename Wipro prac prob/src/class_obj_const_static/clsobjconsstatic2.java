package class_obj_const_static;
class Calculator
{
    static double powerInt(int num1,int num2)
    {
        return Math.pow(num1,num2);
    }
static double powerDouble(double num1,int num2)
{
    return Math.pow(num1,num2);
}
}
public class clsobjconsstatic2 {
public static void main(String[] args) {
	System.out.println(Calculator.powerDouble(25.0, 3));
    System.out.println(Calculator.powerInt(112,9));
}
}
