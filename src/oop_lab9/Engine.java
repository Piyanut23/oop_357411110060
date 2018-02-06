package oop_lab9;

public class Engine {
    private String size;
    private String type;
    //constructot

    public Engine(String size, String type) {
        this.size = size;
        this.type = type;
    }
    //getter and setter methods

    @Override
    public String toString() {
        return "Engine{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

