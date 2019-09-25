
public class CuentaCorriente extends Cuenta{
	
	private Double limiteDescubierto;
	private Double interes;
	
	public CuentaCorriente(Cliente cliente, Integer cbu, Double saldo, Double limite) {
		super(cliente, cbu, saldo);
		this.limiteDescubierto = limite;
		interes = 0.1;
	}
	
	public Double getLimiteDescubierto() {
		return limiteDescubierto;
	}

	public void setLimiteDescubierto(Double limiteDescubierto) {
		this.limiteDescubierto = limiteDescubierto;
	}

	public Double getInteres() {
		return interes;
	}

	public void setInteres(Double interes) {
		this.interes = interes;
	}

	public void extraerSaldo(Double i) {
		if (this.saldo + this.limiteDescubierto >= i) {
			if(this.saldo<0) { // si el saldo me quedo negativo le aplico el interes
				this.saldo= this.saldo - calcularInteresPorDescubierto();
			}			
		}
	}
	@Override
	public void agregarSaldo(Double i) {
		if (i > 0) {
			this.setSaldo(this.saldo + i);
		}
	}

	private Double calcularInteresPorDescubierto() {
		
		return this.interes * this.saldo;
	}

	
}
