import org.junit.jupiter.api.Test;

import DAL.DAOgeneric;
import Model.Class.Phone;

public class SavePhone {

	@Test
	public void create() {
		
		Phone phone = new Phone();
		DAOgeneric<Phone> daoPhone = new DAOgeneric<>();
		
		try {
			
			phone = Phone
					.builder()
					.typePhone("Cel")
					.numberPhone("61999988533")
					.build();
			
			daoPhone.create(phone);
			
		} catch (Exception e) {
			
			System.out.println("\n\nError -> " + e.getMessage() + "\n\n");
		}
	}
}
