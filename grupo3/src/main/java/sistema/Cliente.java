package sistema;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nombre;
	private String tipoDni;
	private int nroDni;
	private int telefono;
	private int fechaServicio;
	private List<Domicilio> domicilios = new ArrayList<Domicilio>();
	
	public List<Domicilio> domicilios() {
		return domicilios;
	}
	
	public boolean algunDispositivoEncendido(Domicilio domi){
		return domi.algunDispositivoEncendido();
	}
	
	public int cantEncendidos(Domicilio domi) {
		return domi.cantEncendidos();
	}
	
	public int cantApagados(Domicilio domi) {
		return domi.cantApagados();
	}
	
	public int cantTotal(Domicilio domi) {
		return domi.cantTotal();
	}
	
	public void altaDomicilio(Domicilio domicilio) {
		domicilios.add(domicilio);
	}
	
	public void eliminarDomicilio(Domicilio domi) {
		domicilios.remove(domi);
	}
	
	public void modificarDispositivo() {
		
	}
	
	
}
