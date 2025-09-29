public class Exercise5 {

    static void avarage(int... nums)
    {
        if (nums.length == 0) {
            System.out.println("No input provided.");
            return;
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        double average =  (double) sum / nums.length;
        System.out.println("Average = " + average);
    }
    
    public static void main(String[] args) {
        avarage(5,6,9,8);
    }
}
