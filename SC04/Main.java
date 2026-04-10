public class Main {

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();

        parkingLot.push("B 1234 ABC");
        parkingLot.push("D 5678 DEF");
        parkingLot.push("F 9012 GHI");

        parkingLot.show();

        parkingLot.pop();
        parkingLot.pop();
        parkingLot.pop();
        // parkingLot.pop();
    }
}
