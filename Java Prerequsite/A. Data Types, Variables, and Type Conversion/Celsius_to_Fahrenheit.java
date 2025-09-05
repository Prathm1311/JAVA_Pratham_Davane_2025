
import java.util.Scanner;

public class Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature is Celsius: ");
        float celsius = sc.nextFloat();
        float fahrenheit = (celsius * 9/5) + 32;
        System.out.println("The Fahrenheit temperature is: " + fahrenheit);        
        sc.close();
    }
}
