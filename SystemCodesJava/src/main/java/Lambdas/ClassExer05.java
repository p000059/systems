package Lambdas;
import javax.swing.JOptionPane;

public class ClassExer05 {


	//Declaração da variável membro da classe que vai receber o valor a ser fatorado.
	private int number;

	//Métodos get e set
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		if(number > 0) {
			this.number = number;
		}
	}

	public void insertNumber() {
		
		this.setNumber(Integer.parseInt(JOptionPane.showInputDialog("Digite um número para o fatorial ou 0(zero) para sair: ")));
		
		//O JOptionPane vai mostrar o resultado do número fatorado chamando o método fatorialNumber().
		JOptionPane.showMessageDialog(null, this.getNumber() + "! => " + this.fatorialNumber());
	}
	
	//Método que vai fatorar o número digitado pelo usuário.
	public int fatorialNumber(){

		int fatorial = 1;
		//A condição estabelece que o número digitado pelo usuário será menor ou igual a i, quando o laço incrementar i até chegar ao número digitado, o laço de repetição vai parar.
		for(int i = 1; i <= this.getNumber() ; i++){
			fatorial = fatorial * i; //O valor fatorial e multiplicado pelo valor atual de i, onde a cada volta, o valor fatorial é multiplicado.
		}

		return fatorial; //retorna o valor total do número fatorado.

	}
}
