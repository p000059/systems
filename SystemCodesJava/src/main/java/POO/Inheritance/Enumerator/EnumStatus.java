package POO.Inheritance.Enumerator;

public enum EnumStatus {

	ACTIVE("Ativo"), 
	INACTIVE("Inativo"), 
	EMPTY("Vazio");

	private String valueStatus;

	EnumStatus(String valueStatus) {
		
		this.valueStatus = valueStatus;
	}

	public String getValue() {
		return this.valueStatus;
	}
}
