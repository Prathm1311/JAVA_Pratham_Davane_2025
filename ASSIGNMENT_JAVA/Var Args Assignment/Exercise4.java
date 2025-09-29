public class Exercise4 {

    static void multiply(String msg, int... nums)
    {
        int product = 1;
        for (int num : nums) {
            product *= num;
        }
        System.out.println(msg + " Product = " + product);
    }
    

     public static void main(String[] args) {
        // Call with one number
        multiply("Single number:", 5);

        // Call with multiple numbers
        multiply("Three numbers:", 2, 3, 4);

        // Call with no numbers
        multiply("No input:");
    }
}
