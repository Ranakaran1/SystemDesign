package Products;

public class Vehicle {

    int id;
    String number;
    Type type;
    String model;
    int driven;
    public Vehicle(){}
    public Vehicle(int id, String number, Type type, String model, int driven) {
        this.id = id;
        this.number = number;
        this.type = type;
        this.model = model;
        this.driven = driven;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getDriven() {
        return driven;
    }
    public void setDriven(int driven) {
        this.driven = driven;
    }

    

}