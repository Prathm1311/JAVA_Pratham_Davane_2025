public class Company {

    static String companyName;
    private static int totalBranches = 0;

    public Company()
    {
       
        totalBranches++;
    }

    public static void showTotalBranch()
    {
        System.out.println("Total Branch: " + totalBranches);
    }

    public void displayInfo()
    {
     System.out.println("Company name of object: " + companyName);   
    }

    public static void main(String[] args) {

        companyName = "Mike Tech";
        Company brn1 = new Company(); 
        Company brn2 = new Company(); 

        System.out.println("Before Company name change: ");
        brn1.displayInfo();
    
        companyName = "Harvy Tech";
        System.out.println("After Company name change: ");

        brn1.displayInfo();

        showTotalBranch();
        

        }


}
