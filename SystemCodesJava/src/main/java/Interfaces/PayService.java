package Interfaces;

public class PayService {
    
    //Essa classe PayService tem uma dependência com o IDeductionService mas não sabe qual será a implementação se, MG ou SP.
    private IDeductionService iDeductionService;

    //Mas para saber qual a implementação se MG ou SP, é necessário um construtor recebendo um tipo de IDeductionService, que pode ser SP ou MG.
    public PayService(IDeductionService iDeductionService){

        //Aqui é atribuído a esta iDeductionService declarada nesta classe o valor iDeductionService enviado pela classe principal que controla quem vem se, SP ou MG.
        this.iDeductionService = iDeductionService;
    }

    public double tax(double amount){
        
        //Ambas a classes MG e SP possuem o método deduction pois estas implementam a interface IDeductionService,
        //pois de trata de um mesmo cálculo mas com valores de deduções diferentes de cada estado.
        amount = amount - iDeductionService.deduction(amount);
        return amount * 0.2;
    }
}
