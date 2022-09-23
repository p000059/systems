package Enum;

public class AppEnumMethod {

    public static void main(String[] args) {

        Car car = new Car();

        car.setNameVehicle("Corolla");
        car.setTypeVehicle(EnumMethodAbstratc.CAR.geraCategory());

        System.out.println("Name Car: " + car.getNameVehicle() + "\nType Car: " + car.getTypeVehicle());
    }
}
