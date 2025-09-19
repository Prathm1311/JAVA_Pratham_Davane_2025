package ferm;
public class Developer extends BaseEmployee 
{
    private String programmingLanguage;
    private static final int BONUS = 5000;

    public Developer(String name, int id, int salary, String programmingLanguage) 
    {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() 
    {
        return programmingLanguage;
    }

    public int getSalary() 
    {
        return super.getSalary() + BONUS;
    }

    @Override
    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
    
}
