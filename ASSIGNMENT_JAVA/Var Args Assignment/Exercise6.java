public class Exercise6 {

    static void concat(String... words)
    {

        if (words.length == 0) {
            System.out.println("No input provided.");
            
        }
        else{
            String result = "";
            for (String word : words) {
                result += word + " ";
            }
            System.out.println("Concatenated String: " + result.trim());

        }

    }

    public static void main(String[] args) {
        concat("Java", "is", "fun");
        concat();
    }
}
