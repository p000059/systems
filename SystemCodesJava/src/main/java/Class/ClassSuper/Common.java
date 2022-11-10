package Class.ClassSuper;

public abstract class Common{
	
	private Long id;
	private String code;
	private String name;
	private String description;
	private String type;
	private boolean status;
	
	public Common() {
		super();
	}

	public Common(Long id, String code, String name, String description, String type, boolean status) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.description = description;
		this.type = type;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean getStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}