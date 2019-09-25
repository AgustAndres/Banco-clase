
public class CajaDeAhorro extends Cuenta {
	
	public CajaDeAhorro(Cliente cliente, Integer cbu, Double saldo) {
		super(cliente, cbu, saldo);
		
	}
	
	@Override
	public void extraerSaldo(Double i) {
		if (this.saldo >= i && i > 0) {
			this.saldo=(this.saldo - i);
		}
	}
	
	@Override
	public void agregarSaldo(Double i) {
		if (i > 0) {
			this.setSaldo(this.saldo + i);
		}
	}
}
