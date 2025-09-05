import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        
        if(a + b > c && b + c > a && a + c > b){
            System.err.println("Valid triangle");

          
            if( a == b && b == c){
                System.out.println("Equliteral Triangle");
            }
            
            else if ( a == b || b == c || a == c) {
                System.out.println("Isosceal Triangle");
            }
            
            else {
                System.out.println("Scalene Triangle");
            }
            
            if( a*a + b*b == c*c || c*c + b*b == a*a || a*a + c*c == b*b){
                System.out.println("Right Triangle");
            }
        }
        else{
            System.out.println("Invalid Triangle measurements");
        }
        }
        
    }

    
   

