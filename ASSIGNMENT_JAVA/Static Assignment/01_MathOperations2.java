class MathOperations1 
{

    static int counter = 0;

    int add(int a, int b) 
    {
        counter++;
        return a + b;
    }
    
    int multiply(int a, int b) 
    {
       return a * b;
    }
    
}
public class MathOperations2{
    public static void main(String[] args) 
    {
        MathOperations1 obj1 = new MathOperations1();
        MathOperations1 obj2 = new MathOperations1();

        System.out.println("Addition 1st: " + obj1.add(5, 10)); 
        System.out.println("Counter after 1st add(): " + obj1.counter); 

        System.out.println("Addition 2nd: " + obj2.add(20, 30)); 
        System.out.println("Counter after 2nd add(): " + obj2.counter); 
        
        System.out.println("Multiplication 1st: " + obj1.multiply(5, 10)); 
        System.out.println("Multiplication 2nd: " + obj2.multiply(20, 30)); 
    }

}
