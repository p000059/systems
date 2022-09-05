/*
    Escreva um código para permitir o acesso com uma Palavra de acesso:
        Entrada > "Digite a palavra de acesso"
        Saída   > "Permissão: ??"
        condições
        se palavra digitada igual a Java-2021 Permissão: aprovada
        se palavra digitada diferente de Java-2021 Permissão: Tente novamente N tentativas
        limitar em 5 tentativas
        use o método equals
* */

package Program;

import javax.swing.*;

public class ManagerUser {
	
	private String user;
	private String password;
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void createUser(String user) {
		
		this.setUser(user);
	}
	
	public void createPassword(String password) {
		
		this.setPassword(password);
	}
	
	public Boolean checkUser(String user) {
		
		return this.getUser().equals(user) ? true : false;
	}
	
	public Boolean checkPassword(String password) {
		
		return this.getPassword().equals(password) ? true : false;
		
	}

	public static void main(String[] args) {

		ManagerUser managerUser = new ManagerUser();
		
		managerUser.createPassword(JOptionPane.showInputDialog("Register a password: "));
		managerUser.createUser(JOptionPane.showInputDialog("Register a User: "));
		
		try {

			String typedPassword = JOptionPane.showInputDialog("Enter the Password: ");

			if (managerUser.checkPassword(typedPassword) == true) {
				
				JOptionPane.showMessageDialog(null, "Access Accepted");
			} else {
				
				JOptionPane.showMessageDialog(null, "Access Denied, try again: ");
				
				for (int i = 1; i < 5; i++) {
					
					if (managerUser.checkPassword(JOptionPane.showInputDialog("Try - " + i + "\nEnter the password: " )) == true) {
																
						JOptionPane.showMessageDialog(null, "Access Accepted");
						break;// Stop loop in true condition.
					}
				}
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}
}
