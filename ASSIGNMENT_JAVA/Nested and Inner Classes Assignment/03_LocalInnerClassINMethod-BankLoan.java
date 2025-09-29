class Bank
{
    public void calculateLoan(int amount)
    {
        class Interest
        {
            private int loan;
            private double interest;
            private double totalRepayment;

            public Interest(int loan)
            {
                this.loan = loan;
                
            }
            
            public void getInterset()
            {
                this.interest = this.loan*0.1; 
               
            }

            public void getTotalRepayment(){
                this.totalRepayment = this.loan + this.interest;
               
            }
            public void display()
            {
                System.out.println("Loan Amount: "+this.loan);
                System.out.println("Interest: "+this.interest);
                System.out.println("Total Repayment: "+this.totalRepayment);
                
            }
        }
        
        Interest a = new Interest(amount);
        a.getInterset();
        a.getTotalRepayment();
        a.display();
    }
}

class BankDemo
{
    public static void main(String[] args) 
    {

       Bank bank = new Bank();
       bank.calculateLoan(10000);
    }
}
