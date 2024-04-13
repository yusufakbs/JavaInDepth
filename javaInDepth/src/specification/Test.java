package specification;

import specification.computer.Computer;
import specification.memory.StickMemory;
import specification.mouse.AdvancedMouse;
import specification.printer.LaserPrinter;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        AdvancedMouse mouse = new AdvancedMouse();
        computer.addUsb(mouse);

        LaserPrinter laserPrinter = new LaserPrinter();
        computer.addUsb(laserPrinter);

        StickMemory stickMemory = new StickMemory();
        computer.addUsb(stickMemory);


        computer.testUsbList();

    }
}
