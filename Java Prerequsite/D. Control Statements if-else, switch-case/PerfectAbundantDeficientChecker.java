import java.util.Scanner;

public class PerfectAbundantDeficientChecker {
    public static void main(String[] args) {
        int sum = 0;
        int divi = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number ");
        int num = sc.nextInt();
        while(divi< num){
            if(num%divi == 0){
                sum = sum + divi;
            }
            divi++;
        }
        String ans = (sum>num) ? "Abundant Number":(sum==num) ? "Perfect Number": "Deficient Number";
        System.out.println("The number is "+ ans);
        sc.close();
    }
}
