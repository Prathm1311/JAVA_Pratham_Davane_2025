class PhysicConstants {
    private static final int speed_of_light = 3000000;
    private static final double gravitational_constant = 9.8;

    public double Calculate_Energy(double mass){
        return mass * speed_of_light * speed_of_light;
    }
    
    public static void main(String[] args) {
        PhysicConstants obj = new PhysicConstants();
        double energy = obj.Calculate_Energy(10);
        System.out.println("Energy of mass 10: " + energy);

        //obj.speed_of_light = 400000;
    }
}
