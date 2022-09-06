package Interfaces;

public class MGDeductionService implements IDeductionService {
    
    //A notação @Overrride indica que a classe MGDeductionService está implementando um método da interface IDeductionService.
    @Override
    public double deduction(double amount){
        return amount * 0.12; //A dedução específica de MG é de 12%
    }

}
