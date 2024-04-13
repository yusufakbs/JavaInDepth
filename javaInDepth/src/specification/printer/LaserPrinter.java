package specification.printer;

import specification.computer.Usb;

public class LaserPrinter extends Printer implements Usb {
    @Override
    public void connect() {
        System.out.println("Yazıcıya bağlanılıyor.");
    }

    @Override
    public void disconnect() {
        System.out.println("Yazıcıdan bağlantı kesiliyor.");

    }

    @Override
    public String read() {
        System.out.println("Yazıcıdan veri okunuyor..");

        return "READY";
    }

    @Override
    public void write(String data) {
        System.out.println("Yazıcıya veri yazılıyor");
        System.out.println("Veri:" + data);
    }
}
