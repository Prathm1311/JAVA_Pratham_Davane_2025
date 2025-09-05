
import java.util.Scanner;
public class TotalDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number");            
        int number = sc.nextInt();
        int count = 0;
        while(number>0){
            count++;
            number = number/10;
        }
        System.out.println("Total digit in number are: "+ count);
        
    }
}
