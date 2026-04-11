import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueue {

    private Queue<String> documents;

    public PrinterQueue() {
        documents = new LinkedList<>();
    }

    public void add(String document) {
        documents.offer(document);
    }

    public void print() {
        String printed = documents.poll();
        System.out.println("Print -> " + printed);
    }

    public void showFront() {
        System.out.println("Depan -> " + documents.peek());
    }

    public void show() {
        System.out.println("Antrian: ");
        int n = 1;
        for (String document : documents) {
            System.out.println(n + ". " + document);
            n++;
        }
    }
}
