public class Computer {
    private Printer printer = new Printer();

    public void printDocument(String message) {
        printer.print(message);
        printer.print();
    }
}
