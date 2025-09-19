import ferm.Department;
import ferm.Developer;
import ferm.Manager;

public class FremDemo {
    public static void main(String[] args) {
        
        
        
        Developer dev1 = new Developer("Satyam", 101, 70000, "Java");
        Developer dev2 = new Developer("Aditya", 102, 75000, "Python");
        Developer dev3 = new Developer("Pratham", 103, 72000, "Java Script");

        
        Manager mag = new Manager("Sudhir", 201, 90000, "IT");   
        mag.addDeveloper(dev1);
        mag.addDeveloper(dev2);
        mag.addDeveloper(dev3);

        Department dept = new Department("Software Development", mag);
        dept.displayInfo();


        mag.displayInfo();

        mag.disp




}

}
