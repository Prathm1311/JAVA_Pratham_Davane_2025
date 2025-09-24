import java.util.Scanner;
import src.Bike;
import src.Car;
import src.LuxaryCar;
import src.Vehical;

public class VehicalRentalSystem
{
    /*
     * Question: how polymorphism
     * Q you have to design a vehical rental system where
     * different types of vehicales can be rented. 
     * 1. Class vehical (super class)
     *     fields: vehicalNo, basePricePerDay
     * 2.methods: getRent(int days) -- returns cost(default = basePricePerDay* days)
     *            getType() -- generic vehical
     * 3. clas Car subcass of vehical
     * 
     * fields - setting capacity 
     * methods - override getRent(int days) - rent increas by rupees 200 per day if seatingCapacity > 4 
     *           override getType() - car
     * 4. class Bike subclass vehical
     * 
     * field - helmetIncluded (boolean)
     * method   override getRent(int days) - if helmetIncluded == true rent increase by 50 per day
     *          override getType() - bike  
     * 5. lexury car subclass of car
     * 
     * field - driverIncluded (boolean)
     * method - override getRent(int days) normal car rent + 10,000 flat fee if driverIncluded 
     *         override getType() - luxury car
     * 
     * use covarient return type -- super class return type 
     * covarient return: a method getbuddyvehical() in vehical , but in lexury car it returns luxury car
     * 
     * Polymorphism Requirement: Create an array of vehical[] fleet containing car, bike, luxury car.
     * itteereate and calculate rent using polymorphism - fleet.getRent(int days)
     */
    

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("*** Well-Come Vehical Rental System ***");

        System.out.print("Enter number of vehical you want to rent: ");

        int n = sc.nextInt();

        Vehical [] fleet = new Vehical[n];

        for (int i = 0; i < n; i++) 
        {
            System.out.println();
            System.out.println("Select vehical Type: \n 1. Car \n 2. Bike \n 3. Lexury Car");  
            
            int choice = sc.nextInt();

            System.out.println();  //for new line 

            System.out.println("Enter Vehical Number: ");
            String vehicalNumber = sc.nextLine();
            
            System.out.println("Enter Base Price Per Day: ");
            double basePricePerDay = sc.nextDouble();
            
            System.out.println("Enter Number of Days: ");
            int days = sc.nextInt();

            switch (choice) {
                case 1:
                    //Car
                    System.out.print("Enter Seating capacity of Car: ");
                    int seats = sc.nextInt();
                    fleet[i] = new Car(vehicalNumber, basePricePerDay, seats);
                    System.out.println("Rent for " + days + "Days " + "Rupees " + fleet[i].getRent(days));
                    break;

                case 2:
                    //Bike
                    System.out.print("helmet Included ? true/false");
                    boolean helmetIncluded = sc.nextBoolean();
                    fleet[i] = new Bike(vehicalNumber, basePricePerDay, helmetIncluded);
                    System.out.println("Rent for " + days + "Days " + "Rupees " + fleet[i].getRent(days));
                    break;

                
                case 3:
                    //Lexury car
                    System.out.print("Enter Seating Capicity: ");
                    int lSeats = sc.nextInt();
                    System.out.print("Driver Included ? true/false");
                    boolean driverIncluded = sc.nextBoolean();
                    fleet[i] = new LuxaryCar(vehicalNumber, basePricePerDay, lSeats, driverIncluded);
                    System.out.println("Rent for " + days + "Days " + "Rupees " + fleet[i].getRent(days));
                    break;
                default:
                    System.out.println("Invalid Choice");
                    i--; // retry this iteration
            }
        }

        System.out.println();


        for(Vehical v : fleet)
        {
            System.out.println(v.getType() + "()" + v.vehicalNo +"-"+ v.basePricePerDay );
        }


    

        

        
    }
}
