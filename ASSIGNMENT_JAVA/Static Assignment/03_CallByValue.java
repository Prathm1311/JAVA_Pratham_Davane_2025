public class CallByValue 
{

    static void changeValue(int x) 
    {
        x = 20;
    }

    public static void main(String[] args) 
    {
        int x = 10;
        System.out.println("Before changeValue, x is: " + x);
        
        changeValue(x);
        System.out.println("After changeValue, x is: " + x);

        // learning point: jar pass by value kele ter a copy madhe value change hote pan real reference change nhi hot  

    }
}
