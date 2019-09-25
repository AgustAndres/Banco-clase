import java.util.Iterator;
import java.util.LinkedList;

public class Banco {

	private String nombre;
	private LinkedList<CajaDeAhorro> cajaDeAhorros;
	private LinkedList<Cuenta> cuenta;
	
	
	public Banco(String nombre) {
		this.nombre=nombre;
		cajaDeAhorros=new LinkedList<CajaDeAhorro>();
		cuenta=new LinkedList<Cuenta>();
	}


	public void agregarCuenta(CajaDeAhorro miCuenta) {
		if(!cajaDeAhorros.contains(miCuenta)) {
		cajaDeAhorros.add(miCuenta);
		}
	}


	public void transferirSaldo(CajaDeAhorro miCuenta, CajaDeAhorro miCuenta2, Double i) {
		
		if(miCuenta.getSaldo()>i) {
			miCuenta.extraerSaldo(i); 
			miCuenta2.agregarSaldo(i);
		}
		
	}
	public Boolean eliminarCuentaPorId(Integer id) {
		Boolean exito = false;
		
		Iterator<CajaDeAhorro> it=cajaDeAhorros.iterator();
		while(it.hasNext()) {
			CajaDeAhorro cajaDeAhorro = it.next();
			if(cajaDeAhorro.getCbu().equals(id)) {
				it.remove();
				exito=true;
			}
		}
		return exito;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LinkedList<CajaDeAhorro> getCuentas() {
		return cajaDeAhorros;
	}


	public void setCuentas(LinkedList<CajaDeAhorro> cajaDeAhorros) {
		this.cajaDeAhorros = cajaDeAhorros;
	}


	public CajaDeAhorro buscarCuentaId(Integer iD) {	
		for (CajaDeAhorro cajaDeAhorro : cajaDeAhorros) {
			if(cajaDeAhorro.getCbu()==iD) {
				return cajaDeAhorro;
			} 
		}
		return null;
	}


	

}
