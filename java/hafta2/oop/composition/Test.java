package hafta2.oop.composition;

public class Test {
    public static void main(String[] args) {

        Resolution resolution = new Resolution("1920","1080");
        Case aCase = new Case("U-2000","Asus","Tempered Glass");
        GPU gpu = new GPU("B760","GIGABYTE","2","Windows");
        Monitor monitor = new Monitor("S-2000","Samsung",resolution);
        Computer computer = new Computer(aCase,gpu,monitor);

        computer.getGpu().installOperatingSystem("Ubuntu");
    }



}
