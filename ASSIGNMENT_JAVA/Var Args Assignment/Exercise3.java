public class Exercise3 {
    
    static void printNames(int count, String... names )
    {
        int counter = 1;
        for(String name: names)
        {
            if(counter <= count)
            {
            counter++;
            System.out.println("Name: " + name);
            
            }
            else
            {
                break;
            }
        }
    }

    public static void main(String[] args) 
    {
        printNames(3, "pratham", "anuja", "sneha", "vaishnavi", "ankita");
    }
}
