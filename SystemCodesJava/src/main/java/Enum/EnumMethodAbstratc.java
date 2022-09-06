//Esse enum possui métodos abstratos que definem uma categoria para o veículo em cada enumeração.

package Enum;

public enum EnumMethodAbstratc {

    CAR(1, "Car"){
        @Override
        public String geraCategory(){
            return "Light";
        }
    },
    TRUCK(2, "Truck"){
        @Override
        public String geraCategory(){
            return "Heavy";
        }
    },
    BUS(3, "Bus"){
        @Override
        public String geraCategory(){
            return "Heavy to Passengers";
        }
    },
    BIKE(4, "Bike"){
        @Override
        public String geraCategory(){
            return "Light";
        }
    };

    private int codVehicle;
    private String descriptionVehicle;

    //Chama-se o contrutor de forma automatica passando o valor contido nas lista de enum.
    EnumMethodAbstratc(int codVehicle, String descriptionVehicle) {
        this.codVehicle = codVehicle;
        this.descriptionVehicle = descriptionVehicle;
    }

    public int getCodVehicle() {
        return codVehicle;
    }

    public String getDescriptionVehicle() {
        return descriptionVehicle;
    }

    //Método que vai definir a categoria do veículo em cada enumerador que vão possuir métodos sobrescritos que retornam uma String.
    public abstract String geraCategory();
}
