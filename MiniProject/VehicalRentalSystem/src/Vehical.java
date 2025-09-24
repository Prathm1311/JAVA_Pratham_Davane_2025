package src;

public class Vehical 
{
    
    public String vehicalNo;
    public double basePricePerDay;

    public Vehical(String vehicalNo, double basePricePerDay) 
    {
        this.vehicalNo = vehicalNo;
        this.basePricePerDay = basePricePerDay;
    }

    public double getRent(int days) 
    {
        return basePricePerDay * days;
    }

    public String getType() 
    {
        return "Generic Vehical";
    }

    public Object vehicalGetBuddyVehical()
    {
        return new Vehical("abc123", 500);
    }


    
}























