class Table 
{
    public void printTable(int n)
    {
        class Multiply
        {
            private int num;
            
            public Multiply(int num) {
                this.num = num;
            }
            
            public void display()
            {
                for(int i=1; i<=10; i++)
                {
                    System.out.println(this.num+" x "+i+" = "+(this.num*i));
                }
            }
        }
        Multiply m = new Multiply(n);
        m.display();
    }
}
class TableDemo {
    public static void main(String[] args) {
        Table t = new Table();
        t.printTable(5);
    }
}
