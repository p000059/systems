package Class;

public class Client {
    
    private Long id;
    private String cliente;

    public Client() {
    }

    public Client(Long id, String cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    
}
