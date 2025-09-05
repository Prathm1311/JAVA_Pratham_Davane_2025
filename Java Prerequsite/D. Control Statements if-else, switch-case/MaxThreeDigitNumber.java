
import java.util.Scanner;

public class MaxThreeDigitNumber {
    public static void main(String[] args) {
        System.out.print("Enter the numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is the Greatest Number");
        }
       else if(num2 > num3){
            System.out.println(num2 + " is Greatest Number");
       }
       else{
            System.out.println(num3+ " is Greatest Number");
       }
       sc.close();
    }
}
