package Persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

//Essa classe terá seus métodos estáticos, pois se o projeto a ler duas vezes, dará erro de dupla conexão.
public class HibernateUtil {

	//Essa interface(EntityManagerFactory) servirá para instanciar a interface EntityManager.
	public static EntityManagerFactory factory = null;
	
	//Sempre que for chamado a classe HibernateUtil, o método initRead() será chamado, assim evita-se que o projeto chame duas vezes o método initRead.
	//Qualquer método colocado dentro desse bloco estático poderá ser chamado em qualquer lugar do projeto sem que haja a instanciação da classe HibernateUtil.
	static {
		initRead();
	}
	
	private static void initRead() {
		
		try {
			//Essa condição estabelece que se o factory for igual a null, ele receberá a configurações contidas no arquivo persistence.xml.
			//Se a condição for falsa, o método initRead() não executada nada.
			if(factory == null) {
				
				//O factory vai receber pela classe Persistence do método estático createEntityManagerFactory() parâmetro "enployee-system", 
				//vindo do arquivo persistence.xml da tag <persistence-unit>
				factory = Persistence.createEntityManagerFactory("employee-system");
				JOptionPane.showMessageDialog(null, "Conectado!");
			}
		} 
		catch (Exception e) {
			e.getMessage();
		}
	}
	 
	//Esse método vai retornar o valor de factory recebido do método initRead().
	public static EntityManager getEntityManager() {
		//A instância factory da interface EntityManagerFactory, vai executar o método createEntityManager() desta interface.
		return factory.createEntityManager();
	}
}
