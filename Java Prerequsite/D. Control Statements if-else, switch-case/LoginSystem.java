
import java.util.Scanner;


public class LoginSystem {
    public static void main(String[] args) {
        String pass = "pratham";
        System.out.print("Enter the password: ");
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i<= 3; i++){
            String input = sc.nextLine();
            boolean result = input.equals(pass);
            if(result){
                System.out.println("Correct password in "+i+"th attempt" );
                break;
            }
            else{
                System.out.println("Wrong Password");
                System.out.println((3-i)+" attempt remain");
            }
        }
    }
}
