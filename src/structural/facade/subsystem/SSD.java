package structural.facade.subsystem;

import structural.facade.FacadePattern;

public class SSD {

    public byte[] read(long lba, int size) {
        if (FacadePattern.debug) {
            System.out.println("SSD.read");
            System.out.println("lba = [" + lba + "], size = [" + size + "]");
        }

        return new byte[]{'s', 'a', 'l', 'u', 't'};
    }
}
