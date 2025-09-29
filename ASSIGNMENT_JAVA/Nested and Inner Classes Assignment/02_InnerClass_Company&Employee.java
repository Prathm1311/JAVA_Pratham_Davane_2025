class Company {
    String companyName;

    public Company(String companyName) {
        this.companyName = companyName;
    }
    
    class Employee{
        
        String empName;
        double salary;

        public Employee(String empName, double salary) {
            this.empName = empName;
            this.salary = salary;
        }

        public void showDetail(){
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee Name: "+ this.empName);
            System.out.println("Salary: " + this.salary);
        }
    }
}

class Main{
    public static void main(String[] args) {

        Company com = new Company("Mike Tech");

        Company.Employee emp1 = com.new Employee("Raju", 5000);
        Company.Employee emp2 = com.new Employee("Sahil", 1000);
        Company.Employee emp3 = com.new Employee("Vicky", 3000);

        emp1.showDetail();
        emp2.showDetail();
        emp3.showDetail();


    }
}