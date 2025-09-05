
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number");
        int num = sc.nextInt();
        int a = num;
        int rev_num = 0;
        while(num>0){
            int temp = num%10;
            rev_num = (rev_num*10)+ temp;
            num = num / 10;
        }
        if(rev_num == a){
            System.out.println(a + " is Palindrome");
        }
        else{
            System.out.println(a + " not Palindrome");
        }

    }
}
