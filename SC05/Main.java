public class Main {

    public static void main(String[] args) {
        PrinterQueue labPrinter = new PrinterQueue();

        labPrinter.add("laporan1.pdf");
        labPrinter.add("Tugas_struktur_data.docx");
        labPrinter.add("revisi_final.pdf");

        labPrinter.show();
        System.out.println();

        labPrinter.print();
        System.out.println();

        labPrinter.showFront();
        labPrinter.print();
    }
}
