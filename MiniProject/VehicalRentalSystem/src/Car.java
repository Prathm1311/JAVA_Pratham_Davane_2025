package src;

//sub-class of vehical 
public class Car extends Vehical 
{
    int seatingCapacity;

    public Car(String vehicalNo, double basePricePerDay, int seatingCapacity) 
    {
        super(vehicalNo, basePricePerDay);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public double getRent(int days) 
    {
        double rent = super.getRent(days);
        if (seatingCapacity > 4) {
            rent = rent + 200 * days;
        }
        return rent;
    }

    @Override
    public String getType() 
    {
        return "Car";
    }
    
}
