package sandbox.att;

public abstract class Phone {
    private String model;
    private String brand;
    private String version;
    private String releaseDate;

    public Phone(String model, String brand, String version, String releaseDate) {
        this.model = model;
        this.brand = brand;
        this.version = version;
        this.releaseDate = releaseDate;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
