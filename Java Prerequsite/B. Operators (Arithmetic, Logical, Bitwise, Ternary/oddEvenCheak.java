public class oddEvenCheak {
    public static void main(String[] args) {
        int num = 45;
        if((num & 1)==0){
            System.out.println(num + " is Even Number");
        }       
        else{
            System.out.println(num + " is Odd number");
        }
    }
    
}