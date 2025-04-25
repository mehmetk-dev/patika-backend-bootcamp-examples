package hafta2.oop.composition;

public class GPU {

    private String model;
    private String brand;
    private String numOfSlot;
    private String operatingSystem;

    public GPU(String model, String brand, String numOfSlot, String operatingSystem) {
        this.model = model;
        this.brand = brand;
        this.numOfSlot = numOfSlot;
        this.operatingSystem = operatingSystem;
    }

    public void installOperatingSystem(String operatingSystem){
        this.operatingSystem = operatingSystem;
        System.out.println("New operating system is install "+ operatingSystem);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNumOfSlot() {
        return numOfSlot;
    }

    public void setNumOfSlot(String numOfSlot) {
        this.numOfSlot = numOfSlot;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
