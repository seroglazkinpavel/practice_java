package practice_7;

public class Laptop {
    private Integer ram;
    private Integer hardDrive;
    private String operatingSystem;
    private String color;

    public Laptop(Integer ram, Integer hardDrive, String operatingSystem, String color) {
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public Laptop(int ram, Integer hardDrive) {
        this.ram = ram;
        this.hardDrive = hardDrive;
    }

    public Laptop() {

    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Integer getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(Integer hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Laptop [ram = " + ram + ", hardDrive = " + hardDrive + ", operatingSystem = " + operatingSystem
                + ", color = "
                + color + "]";
    }
}
