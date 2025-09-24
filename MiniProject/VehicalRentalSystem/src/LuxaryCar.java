package src;

public class LuxaryCar extends Car 
{
    boolean driverIncluded;

    public LuxaryCar(String vehicalNo, double basePricePerDay, int seatingCapacity, boolean driverIncluded) {
        super(vehicalNo, basePricePerDay, seatingCapacity);
        this.driverIncluded = driverIncluded;
    }

    @Override
    public double getRent(int days) 
    {
        double rent = super.getRent(days);
        if (driverIncluded) {
            rent += 10000; // flat fee
        }
        return rent;
    }

    @Override
    public String getType() 
    {
        return "Luxury Car";
    }
    
    
    
}
