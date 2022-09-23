package Interfaces;

public interface IVehicle {

    void run();
    void Break();
    void makeCurves(int position);
    void carryPassengers(int quantityPassengers);
    
    default String readSituation(){
        String msg = "Valid Situation";
        return msg;
    }
    
    static String readMsg(){
        String msg = "Static Method Interface";
        return msg;
    }
}
