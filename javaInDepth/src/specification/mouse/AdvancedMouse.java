package specification.mouse;

import specification.computer.Usb;

public class AdvancedMouse extends Mouse implements Usb{
    @Override
    public void connect() {
        System.out.println("Fareye Bağlanılıyor.");
    }

    @Override
    public void disconnect() {
        System.out.println("Fareye bağlantısı kesilidi..");

    }

    @Override
    public String read() {
        System.out.println("Fareden okunuyor.");

        return "345,654";
    }

    @Override
    public void write(String data) {
        System.out.println("Fareye yazılıyor.");
        System.out.println("Veri:" + data);
    }
}
