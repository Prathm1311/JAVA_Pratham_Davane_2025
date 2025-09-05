import java.util.Scanner;

public class sum_Of_Digit_In_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 3 Digit Number: ");
        int num = sc.nextInt();
        int sum = 0;
        
        if(num>99 && num<999){
            while(num>0){
                int temp = num%10;
                sum = temp + sum;
                num/=10;
            }
            
            System.out.println("The sum of Digits is: " + sum);
        }
        
        else{
            System.out.println("Invalid Number");
        }

        sc.close();
    }
}
