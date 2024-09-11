package decorator;

import java.io.PrintWriter;

public class FilePrinter extends PrinterDecorator{
    private PrintWriter writer;
    public FilePrinter(Printer printer) {
        super(printer);
        try{
            this.writer = new PrintWriter("log.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print(String message) {
        super.print("Printing to file: " + message);
        writer.println(message);
    }
}
