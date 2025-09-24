package ferm;

public class Manager extends BaseEmployee 
{
    private final int bonus = 10000;
    Developer [] teamDeveloper = new Developer[4]; 
    private int developerCount = 0;
    private String department;

    public Manager(String name, int id, int salary, String department) 
    {
        super(name, id, salary);
        this.department = department;
        
    }

    public String getDepartment() 
    {
        return department;
    }

    public int getSalary() 
    {
        return super.getSalary() + bonus;
    }

    public void addDeveloper(Developer developer) 
    {
        if (developerCount < teamDeveloper.length) 
        { 
            teamDeveloper[developerCount] = developer;
            developerCount++;
        } 
        else 
        {
            System.out.println("Team full.");
        }
        
    }

    @Override
    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Department: " + department);
    }


    public void displayTeam() 
    {
        System.out.println("Team Members:");
        for (int i = 0; i < developerCount; i++) 
        {
            teamDeveloper[i].displayInfo();
        }
    }
    
}
