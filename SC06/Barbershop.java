public class Barbershop {

    private int regularInCount;
    private int regularOutCount;
    private int premiumInCount;
    private int premiumOutCount;

    public Barbershop() {
        regularInCount = 0;
        regularOutCount = 0;
        premiumInCount = 0;
        premiumOutCount = 0;
    }

    public void getTicket(Ticket ticket) {
        if (ticket == Ticket.REGULAR) {
            regularInCount++;
            System.out.printf("Tiketmu adalah: R%03d\n", regularInCount);
            int waiting = (regularInCount - 1) - regularOutCount;
            String message =
                waiting == 0
                    ? "tidak menunggu"
                    : "kamu menunggu " + waiting + " orang";
            System.out.println(message);
            System.out.println();
        } else {
            premiumInCount++;
            System.out.printf("Tiketmu adalah: P%03d\n", premiumInCount);
            int waiting = (premiumInCount - 1) - premiumOutCount;
            String message =
                waiting == 0
                    ? "tidak menunggu"
                    : "kamu menunggu " + waiting + " orang";
            System.out.println(message);
            System.out.println();
        }
    }

    public void call(Ticket ticket) {
        if (ticket == Ticket.REGULAR) {
            if (regularOutCount >= regularInCount) {
                System.out.println("Antrean Regular kosong!");
                return;
            }

            regularOutCount++;
            System.out.printf(
                "tiket R%03d -> menuju kursi 1\n",
                regularOutCount
            );
        } else {
            if (premiumOutCount >= premiumInCount) {
                System.out.println("Antrean Premium kosong!");
                return;
            }

            premiumOutCount++;
            System.out.printf(
                "tiket P%03d -> menuju kursi 2\n",
                premiumOutCount
            );
        }
    }

    public void reset() {
        regularInCount = 0;
        regularOutCount = 0;
        premiumInCount = 0;
        premiumOutCount = 0;
        System.out.println("Semua antrian telah direset kembali ke 0.");
        System.out.println();
    }
}
