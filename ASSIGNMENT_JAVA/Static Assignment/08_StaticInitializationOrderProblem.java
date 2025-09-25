class test {
    
    static int a = 10;

    static void changeA()
    {
        System.out.println(a);
        a = 20;
    }

    static void printA()
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
        
        changeA();

        printA();
    }
}
