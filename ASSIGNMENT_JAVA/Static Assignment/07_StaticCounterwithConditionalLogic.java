class TicketBooking {

    private int ticketId;
    static int startId = 1001;

    public TicketBooking() 
    {
        while (startId % 5 == 0) {
            startId++;
        }
        this.ticketId = startId++;
    }

    

    public static void main(String[] args) {    

        int totalTickets = 10;

        TicketBooking [] ticket = new TicketBooking[totalTickets];
        
        for (int i = 0; i < totalTickets; i++) {
            ticket[i] = new TicketBooking();
            System.out.println("Ticket ID: " + ticket[i].ticketId);
        }


    }
}
