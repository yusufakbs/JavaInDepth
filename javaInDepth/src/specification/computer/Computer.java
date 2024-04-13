package specification.computer;

import specification.printer.LaserPrinter;

import java.util.ArrayList;

public class Computer {
    private ArrayList<Usb> usbList = new ArrayList<Usb>();

    public ArrayList<Usb> getUsbList() {
        return usbList;
    }

    public void setUsbList(ArrayList<Usb> usbList) {
        this.usbList = usbList;
    }

    public void addUsb(Usb usb){
        System.out.println("\r\n USB Ekleniyor.");
        usbList.add(usb);
        testUsb(usb);
    }

    public void testUsbList(){
        System.out.println("\r\nTüm usb aygıtları sınanıyor.");
        for (Usb usb : usbList){
            testUsb(usb);
        }
    }

    public void testUsb(Usb usb){
        System.out.println("\r\nSINANIYOR");

        usb.connect();
        String data = usb.read();
        System.out.println("Usb'den okunan veri:" + data);
        usb.write("Bir veri");
        usb.disconnect();


    }

}
