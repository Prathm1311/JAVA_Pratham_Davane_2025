import java.util.Scanner;

public class MenuDrivenProgramSwitch 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        double result;
        
        System.out.println("Choose an operation: ");
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplcation");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        

        switch (choice) 
        {
            case 1: 
                result = num1 + num2;
                System.out.println(result);
                break;
            case 2: 
                result = num1 - num2;
                System.out.println(result);
                break;
            case 3: 
                result = num1 * num2;
                System.out.println(result);
                break;
            case 4: 
                if(num2 != 0)
                {
                result = num1 / num2;
                System.out.println(result);
                }
                else
                {
                    System.out.println("Error");
                }
                break;
            default:
                System.out.println("Have a choice");
        }

    }
}
