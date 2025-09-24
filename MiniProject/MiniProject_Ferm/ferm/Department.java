package ferm;

public class Department {
    private String name;
    private Manager manager;

    public Department(String name, Manager manager) 
    {
        this.name = name;
        this.manager = manager;
    }

    public String getName() 
    {
        return name;
    }

    public Manager getManager() 
    {
        return manager;
    }

    public void displayInfo() {
        System.out.println("Department Name: " + name);
        if (manager != null) 
        {
            System.out.print("Manager Info: ");
            manager.displayInfo();
        } 
        else 
        {
            System.out.println("No manager givem");
        }
    }
}
