class OverloadArithmetic
{
    int arithmetic(int a,int b)
    {
        return a+b;
    }
    float arithmetic(int a,float b)
    {
        return a-b;
    }
    float arithmetic(float a,Float b)
    {
        return a*b;
    }
    float arithmetic(float a,int b)
    {
        return a/b;
    }
}
class OverridingArithmetic extends MethodOverloadOverriding
{
    void display(int a,int b)
    {
        System.out.println("Add:"+(a+b));
        System.out.println("Sub:"+(a-b));
        System.out.println("Mul:"+(a*b));
        System.out.println("Div:"+(a/b));
    }
}
public class MethodOverloadOverriding 
{
    void display(int a,int b)
    {
        System.out.println("Arithmetic:");
    }
    public static void main(String[] args) 
    {
        OverloadArithmetic obj = new OverloadArithmetic();
        System.out.println("add: "+obj.arithmetic(10, 20));   
        System.out.println("sub: "+obj.arithmetic(20, 5.2f));   
        System.out.println("mul: "+obj.arithmetic(2.5f, 5.4f));   
        System.out.println("div: "+obj.arithmetic(6.4f, 2));   

        MethodOverloadOverriding MOO = new OverridingArithmetic();
        MethodOverloadOverriding MOO1 = new MethodOverloadOverriding();
        OverridingArithmetic OA = new OverridingArithmetic();
        MOO.display(10, 20);
        MOO1.display(30,20);
        OA.display(10, 40);
    }
}
