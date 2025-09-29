class MonthDays {

    private static final int[] days_in_month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public void getDayInMonth(int month)
    {
        if(month < 1 || month > 12) 
        {
            System.out.println("Invalid month");
        }
        else
        {
            System.out.println("Number of days in month " + month + ": " + days_in_month[month - 1]);
        }
    }

    public static void main(String[] args) {
        MonthDays md = new MonthDays();
        md.getDayInMonth(2);
        md.getDayInMonth(13);

        //md.days_in_month[1] = 29;
    }

}
