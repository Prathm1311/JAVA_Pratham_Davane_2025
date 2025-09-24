package src;
//subclass of bick which extends Vehical
public class Bike extends Vehical 
{
    boolean helmetIncluded;

    public Bike(String vehicalNo, double basePricePerDay, boolean helmetIncluded) 
    {
        super(vehicalNo, basePricePerDay);
        this.helmetIncluded = helmetIncluded;
    }
   
    @Override
    public double getRent(int days) 
    {
        double rent = super.getRent(days);
        if (helmetIncluded) {
            rent = rent + 50 * days;
        }
        return rent;
    }

    @Override
    public String getType() 
    {
        return "Bike";
    }
    
}
