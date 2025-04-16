package Hafta2.OOP.Composition;

public class Computer {

    private Case aCase;
    private GPU gpu;
    private Monitor monitor;

    public Computer(Case aCase, GPU gpu, Monitor monitor) {
        this.aCase = aCase;
        this.gpu = gpu;
        this.monitor = monitor;
    }

    public Case getaCase() {
        return aCase;
    }

    public void setaCase(Case aCase) {
        this.aCase = aCase;
    }

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
