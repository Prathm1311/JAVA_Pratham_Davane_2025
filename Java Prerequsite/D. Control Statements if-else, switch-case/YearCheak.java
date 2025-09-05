
import java.util.Scanner;

public class YearCheak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the year to Be Cheak: ");
        int year = sc.nextInt();
        if(year % 4 == 0 && ( year % 100 != 0 || year % 400 == 0)){
            System.out.println(year + " is leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }
        sc.close();

    }
}
