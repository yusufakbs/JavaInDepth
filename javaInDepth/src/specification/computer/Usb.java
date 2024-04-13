package specification.computer;

public interface Usb {
    void connect();
    void disconnect();
    String read();
    void write(String data);
}
