public class greatestNumber {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 33;
        int num3 = 18;

        int max = (num1>num2 && num1 > num3) ? num1: (num2>num3)? num2: num3;
        System.out.println( max);

        
    }
    
}
