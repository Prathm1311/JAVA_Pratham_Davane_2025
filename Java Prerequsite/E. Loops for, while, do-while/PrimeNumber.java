public class PrimeNumber 
{

    static void display(int num)
    {
        System.out.print(num+ " ");
    }

    public static void main(String[] args) 
    {
        System.out.println("Prime numbers from 1 to 100:");

        for (int num = 2; num <= 100; num++) {
            int isPrime = 1;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = 0;
                    break;
                }
            }

            if (isPrime == 1) {
                display(num);
            }
        }
    }
}