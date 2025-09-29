class Circle
{
    private final double pi = 3.14;
    double CalculateArea(double radius)
    {
        return pi * radius * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        double area = c.CalculateArea(5);
        System.out.println("Area of circle with radius 5: " + area);

        //c.pi = 9; 
    }
}