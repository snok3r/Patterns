package structural.facade;

import structural.facade.subsystem.CPU;
import structural.facade.subsystem.Memory;
import structural.facade.subsystem.SSD;

public class Computer {

    private CPU cpu;
    private Memory memory;
    private SSD ssd;

    public Computer() {
        cpu = new CPU();
        memory = new Memory();
        ssd = new SSD();
    }

    public void start() {
        cpu.freeze();
        memory.load(60287471352l, ssd.read(144l, 120));
        cpu.jump(60287471352l);
        cpu.execute();

        System.out.println("Computer started");
    }
}
