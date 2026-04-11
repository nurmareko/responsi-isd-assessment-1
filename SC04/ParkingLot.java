import java.util.Stack;

public class ParkingLot {

    private Stack<String> stack;
    private int numberOfItem;

    public ParkingLot() {
        stack = new Stack<>();
        numberOfItem = 0;
    }

    public void push(String numberPlate) {
        stack.push(numberPlate);
        numberOfItem++;
    }

    public void pop() {
        if (numberOfItem == 0) {
            System.out.println("Parkiran kosong");
            return;
        }

        String popped = stack.pop();
        String next =
            numberOfItem == 1
                ? "Parkiran kosong"
                : "Selanjutnya: " + stack.peek();

        System.out.println("Keluar: " + popped);
        System.out.println(next);
        System.out.println();
        numberOfItem--;
    }

    public void show() {
        int n = 1;
        System.out.println("Daftar Parkir:");
        for (String plate : stack) {
            System.out.println(n + ". " + plate);
            n++;
        }
        System.out.println();
    }
}
