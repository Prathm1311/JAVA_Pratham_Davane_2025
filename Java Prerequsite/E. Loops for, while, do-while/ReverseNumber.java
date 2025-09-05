
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: " );
        int number = sc.nextInt();
        int rev_num = 0;
        while(number>0){
            int temp = number%10;
            rev_num = rev_num*10 + (temp);
            number = number/10;
        }
        System.out.println("Reversed number is: "+ rev_num);
    }   
}
