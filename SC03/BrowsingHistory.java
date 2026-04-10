import java.util.Stack;

public class BrowsingHistory {

    Stack<String> backHistory;
    Stack<String> forwardHistory;

    public BrowsingHistory() {
        backHistory = new Stack<>();
        forwardHistory = new Stack<>();
    }

    public void visit(String link) {
        backHistory.push(link);
        forwardHistory.clear();
        System.out.println("halaman saat ini: " + link);
    }

    public void back() {
        if (backHistory.size() == 0) {
            System.out.println("Back -> Tidak ada halaman");
            return;
        }

        String topElement = backHistory.pop();
        forwardHistory.push(topElement);

        System.out.println("Back -> " + backHistory.peek());
    }

    public void forward() {
        if (forwardHistory.size() == 0) {
            System.out.println("Forward -> Tidak ada halaman");
            return;
        }

        String topElement = forwardHistory.pop();
        backHistory.push(topElement);

        System.out.println("forward -> " + backHistory.peek());
    }

    public void show() {
        for (String link : backHistory) {
            System.out.println(link);
        }
    }
}
