package Try;
public class ErroException extends Exception {
    
    private int num;
    private int dem;

    public ErroException(int num, int dem) {
        super();
        this.num = num;
        this.dem = dem;
    }

    @Override
    public String toString() {
        return "Resultado de " + dem + " / " + num + " não é um inteiro.";
    }

    
    
}
