package specification.memory;

import specification.computer.Computer;
import specification.computer.Usb;

public class StickMemory extends Computer implements Usb {
    @Override
    public void connect() {
        System.out.println("Bellek bağlanıyor.");
    }

    @Override
    public void disconnect() {
        System.out.println("Bellek bağlantısı kopuyor.");

    }

    @Override
    public String read() {
        System.out.println("Belleğe yazılıyor.");

        return "";
    }

    @Override
    public void write(String data) {
        System.out.println("Veri:" + data);
    }
}
