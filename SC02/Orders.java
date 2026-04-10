import java.util.LinkedList;

public class Orders {

    LinkedList<String> orders;

    public Orders() {
        orders = new LinkedList<>();
    }

    public void add(String order) {
        orders.add(order);
    }

    public void remove(String order) {
        boolean success = orders.remove(order);

        if (!success) {
            System.out.println("gagal menghapus");
        }
    }

    public void removeLast() {
        if (orders.size() == 0) {
            System.out.println("tidak ada pesanan");
            return;
        }

        orders.removeLast();
    }

    public void show() {
        System.out.println("Riwayat pesanan:");
        int n = 1;
        for (String order : orders) {
            System.out.println(n + ". " + order);
            n++;
        }
        System.out.println();
    }
}
