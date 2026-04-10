public class Main {

    public static void main(String[] args) {
        Orders dimsumOrders = new Orders();

        dimsumOrders.add("Siomay Ayam");
        dimsumOrders.add("Hakau Udang");
        dimsumOrders.add("Lumpia Kulit Tahu");

        dimsumOrders.remove("Hakau Udang");

        dimsumOrders.add("Bakpao Telur Asin");
        dimsumOrders.removeLast();

        dimsumOrders.show();
    }
}
