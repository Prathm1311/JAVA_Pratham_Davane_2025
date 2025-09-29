class Employee {

    private final int EmployeeId;

    public Employee(int id) {
        EmployeeId = id;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101);
        System.out.println("Employee ID: " + emp.EmployeeId);

        //emp.EmployeeId = 202;
    }
    
}
