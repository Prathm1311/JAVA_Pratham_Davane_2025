public class Employee 
{   
    private static int employeeCount;
    
    private static int employeeId = 100;
    
    public Employee() 
    {
        this.employeeId = employeeId;
        employeeId++;
        employeeCount++;
    }
    
    static void displayEmployeeCount()
    {
        System.out.println("Employee Count: " + employeeCount );
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();
        Employee emp5 = new Employee();
        Employee emp6 = new Employee();
        Employee emp7 = new Employee();
        Employee emp8 = new Employee();

        displayEmployeeCount();

        System.out.println("Employee id of 7th Employee: " + emp7.employeeId);
    }
    
}
