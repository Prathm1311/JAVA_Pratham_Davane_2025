public class TypeCheak {
 public static void main(String[] args) {
    long num = 84958l;
            if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE)
                System.out.println("byte");

            if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE)
                System.out.println("short");

            if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE)
                System.out.println("int");

            else{
                System.out.println("long");
                }   
}
}
