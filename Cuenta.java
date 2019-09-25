
public abstract class Cuenta {

	protected Cliente cliente;
	protected Integer cbu;
	protected Double saldo;

	public Cuenta(Cliente cliente, Integer cbu, Double saldo) {
		this.cliente = cliente;
		this.cbu = cbu;
		this.saldo = saldo;
	}

	public Cuenta(Integer cbu, Double saldo, String nombre, String apellido, Integer dni) {
		this.cbu = cbu;
		this.saldo = saldo;
		Cliente cliente1 = new Cliente(dni, nombre, apellido);

	}

	public abstract void extraerSaldo(Double i);

	public abstract void agregarSaldo(Double i);

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Integer getCbu() {
		return cbu;
	}

	public void setCbu(int cbu) {
		this.cbu = cbu;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}
