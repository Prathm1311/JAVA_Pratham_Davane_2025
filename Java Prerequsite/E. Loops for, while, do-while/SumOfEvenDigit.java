import java.util.Scanner;

public class SumOfEvenDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int num =  sc.nextInt();
        int sum = 0;
        while(num>0){
            int temp = num%10;
            if(temp%2 ==0){
                sum = temp + sum;
            }
            num = num/10;
        }
        System.out.println("The sum of Even number is: "+sum);
        sc.close();
    }
}
