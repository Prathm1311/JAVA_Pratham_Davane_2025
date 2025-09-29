public class Exercise1 {

    
    static void displayNumbers(int... nums){
        int counter = 1;
        for(int i: nums){
            System.out.println(counter +" number: "+ i);
            counter++;
        }

    }

        
    public static void main(String[] args) {
        displayNumbers(1,2,3,4,5);
        }
        
    }

