package seminar_6;

import java.util.ArrayList;

public class MyCat {
    private String name;
    private String color;
    private String poroda;
    private int age;
    private String doctor;
    private String owner;
    private ArrayList<String> history;

    public MyCat(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public MyCat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public MyCat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ArrayList<String> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<String> history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return name + " " + color + " " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        MyCat cat = (MyCat) obj;
        if (this.name.equals(cat.name) && this.owner.equals(cat.owner)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 13 * owner.hashCode();
    }

}
