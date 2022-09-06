package Interfaces;

public class SPDeductionService implements IDeductionService {
    
    //A notação @Overrride indica que a classe SPDeductionService está implementando um método da interface IDeductionService.
    @Override
    public double deduction(double amount){
        return amount * 0.1; //A dedução específica de SP é de 10%
    }
}
