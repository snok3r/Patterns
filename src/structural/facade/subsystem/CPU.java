package structural.facade.subsystem;

import structural.facade.FacadePattern;

public class CPU {

    public void freeze() {
        if (FacadePattern.debug)
            System.out.println("CPU.freeze");
    }

    public void jump(long position) {
        if (FacadePattern.debug) {
            System.out.println("CPU.jump");
            System.out.println("position = [" + position + "]");
        }
    }

    public void execute() {
        if (FacadePattern.debug)
            System.out.println("CPU.execute");
    }
}
