class Code 
{
    static int num1 = 10;
    int num2 = 5;

    Code()
    {
        num1++;
        num2++;
    }

    public void display()
    {
        System.out.print("value of static num1: "+ num1);
        System.out.print(" value of non-static num2: "+ num2);
        System.out.println();
    }
}

public class StaticAndNonStatic
{
    public static void main(String[] args) 
    {
        Code obj1 = new Code();
        obj1.display();
        Code obj2 = new Code();
        obj2.display();
        Code obj3 = new Code();
        obj3.display();
        
    }

} 


