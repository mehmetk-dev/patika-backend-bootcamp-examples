package hafta2.oop.composition;

public class Case {

    private String model;
    private String brand;
    private String material;

    public Case(String model, String brand, String material) {
        this.model = model;
        this.brand = brand;
        this.material = material;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
