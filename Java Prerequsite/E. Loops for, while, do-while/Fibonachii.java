public class Fibonachii 
{
    static int fibo(int num)
    {
        if(num == 1 ||  num == 0)
        {
            return 1;
        }
        else
        {
            return fibo(num - 1) + fibo(num - 2);
        }
    }

    public static void main(String[] args) 
    {
        int lastTerm = 10;
        for (int i = 0; i < lastTerm; i++) {
            System.out.print(fibo(i) + " ");
        }

    }
}
