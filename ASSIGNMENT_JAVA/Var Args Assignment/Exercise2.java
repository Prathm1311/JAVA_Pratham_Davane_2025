public class Exercise2 
{
    static int findSum(int... nums)
    {
        int sum = 0;
        for(int i: nums){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        int result = findSum(1,2,3,4,5);
        System.out.println("The sum is: " + result);    
    }
    
}
