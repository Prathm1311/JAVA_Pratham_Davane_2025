class Car {
    
    String brand;
    
    public Car(String brand){
        this.brand = brand;
    }
    
    class Engine{
        
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        public void showDetail(){
            System.out.println("Brand is: " + brand);
            System.out.println("HorsePower is: " + this.horsePower);
        }
        
    }
}
class Demo{
    public static void main(String[] args) {
        Car car = new Car("BMW");

        Car.Engine eng = car.new Engine(500);

        eng.showDetail();
    }
} 
