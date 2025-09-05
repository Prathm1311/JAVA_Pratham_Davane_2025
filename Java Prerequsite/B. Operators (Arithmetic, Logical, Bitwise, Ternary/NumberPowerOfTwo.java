import java.util.Scanner;

public class NumberPowerOfTwo {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        if(num < 2)
        {
            System.out.println(temp + "Not Power Of 2 ");
        }
        else
        {
            while(num>1)
            {
                if(num % 2 != 0)
                {
                    System.out.println(temp + "not Power of 2");
                    break;
                }
                num = num/2;

            }
            if(num == 1)
            {
                System.out.println( temp + " is Power of 2 ");
            }
            else
            {
                System.out.println(temp + "Not Power Of 2 ");
            }
            
        }
        
    
    }
}
