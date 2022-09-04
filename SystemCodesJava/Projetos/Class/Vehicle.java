package Class;

public class Vehicle {

    //Declaração dos atributos da classe;
    private String vehicle;
    private String model;
    private String color;
    private String label;
    private String status;

    //Declaração do métodos get e set
    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    //Declaração dos construtores da classe.
    public Vehicle() {
    }

    public Vehicle(String vehicle, String model, String color, String label, String status) {
        this.vehicle = vehicle;
        this.model = model;
        this.color = color;
        this.label = label;
        this.status = status;
    }

    public Vehicle(String vehicle, String model, String color, String label) {
        this.vehicle = vehicle;
        this.model = model;
        this.color = color;
        this.label = label;
    }
    
    public Vehicle(String vehicle, String model, String color) {
        this.vehicle = vehicle;
        this.model = model;
        this.color = color;
    }

    public Vehicle(String vehicle, String model) {
        this.vehicle = vehicle;
        this.model = model;
    }
        
    public Vehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return this.getModel() 
             + this.getVehicle()
             + this.getColor()
             + this.getLabel()
             + this.getStatus();
    }
    
    
}
