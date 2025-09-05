public class logicalOperations {
    public static void main(String[] args) {
        boolean one = true;
        boolean two = true;

        if(one == two && two == one ){
            System.out.println("AND Operation");
        }
        if(one == two || two == one){
            System.out.println("OR Operation");
        }
        if(one != two)   {
            System.out.println("NOT Operator");
        }  
    }
}
