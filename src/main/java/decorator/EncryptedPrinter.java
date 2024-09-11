package decorator;

import java.util.Base64;

public class EncryptedPrinter extends PrinterDecorator{
    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        super.print(encryptMessage(message));

    }

    private String encryptMessage(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
