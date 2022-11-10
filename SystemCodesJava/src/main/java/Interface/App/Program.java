package Interface.App;

public class Program {
    
    public static void main(String[] args){

        //Nessa linha abaixo há o controle da classe PayService que só vai receber o que essa classe principal decidir enviar por uma instancia no construtor,
        //que pode ser uma instância da classe MGDeductionService() ou SPDeductionService(), 
        //evitando assim a abertura da classe PayService para alterar um código caso precise.
        PayService payService = new PayService(new SPDeductionService());

        //Chama o método de Payservice tax(), passando o valor a ser calculado segundo a instância escolhida na linha anterior se, SP ou MG.
        double tax = payService.tax(1000.0);

        System.out.println();
        System.out.println();
        System.out.print("Tax: " + tax);
        System.out.println();
        System.out.println();
    }
}
