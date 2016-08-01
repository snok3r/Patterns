package structural.facade.subsystem;

import structural.facade.FacadePattern;

public class Memory {

    public void load(long position, byte[] data) {
        if (FacadePattern.debug) {
            System.out.println("Memory.load");
            System.out.println("position = [" + position + "], data = [" + data + "]");
        }
    }
}
