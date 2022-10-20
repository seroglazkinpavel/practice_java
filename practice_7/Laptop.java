package practice_7;

public class Laptop {
    private String ram;
    private String hardDrive;
    private String operatingSystem;
    private String color;

    public Laptop(String ram, String hardDrive, String operatingSystem, String color) {
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public Laptop(String ram, String hardDrive) {
        this.ram = ram;
        this.hardDrive = hardDrive;
    }

    public Laptop() {

    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
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
