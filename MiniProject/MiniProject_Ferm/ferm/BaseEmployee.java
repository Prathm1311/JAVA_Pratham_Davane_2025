package ferm;

public class BaseEmployee 
{
    private String name;
    private int id;
    private int salary; 

    public BaseEmployee(String name, int id, int salary) 
    {
        this.name = name;
        this.id = id;
        this.salary = salary; 
    }


    public String getName() 
    {
        return name;
    }

    public int getId() 
    {
        return id;
    }

    public int getSalary() 
    {
        return salary;
    }

    public void displayInfo() 
    {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }

}