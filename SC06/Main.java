public class Main {

    public static void main(String[] args) {
        Barbershop rafiBarbershop = new Barbershop();

        rafiBarbershop.getTicket(Ticket.REGULAR);
        rafiBarbershop.getTicket(Ticket.REGULAR);

        rafiBarbershop.getTicket(Ticket.PREMIUM);

        rafiBarbershop.call(Ticket.REGULAR);
        rafiBarbershop.call(Ticket.REGULAR);
        rafiBarbershop.call(Ticket.PREMIUM);
        rafiBarbershop.call(Ticket.PREMIUM);
        System.out.println();

        rafiBarbershop.getTicket(Ticket.REGULAR);
        rafiBarbershop.getTicket(Ticket.PREMIUM);

        rafiBarbershop.reset();
        rafiBarbershop.getTicket(Ticket.REGULAR);
        rafiBarbershop.getTicket(Ticket.PREMIUM);
    }
}
