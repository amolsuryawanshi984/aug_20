// Write program to demonstrate java methods perform arithmetic operation using methods
class Arithmetic
{
    void addition(int a,int b)
    {
        System.out.println("Addition: "+(a+b));
    }
    int subtraction(int a,int b)
    {
        return a-b;
    }
    int multiplication()
    {
        int a = 10,b = 20;
        return a*b;
    }
    void division()
    {
        int a = 5;
        float b = 2;
        System.out.println("Division: "+(a/b)); 
    }
    public static void main(String[] args) 
    {
        Arithmetic obj = new Arithmetic();
        obj.addition(10, 20);
        System.out.println("Subtraction: "+obj.subtraction(30, 20));
        System.out.println("Multiplication: "+obj.multiplication());
        obj.division();
    }
}