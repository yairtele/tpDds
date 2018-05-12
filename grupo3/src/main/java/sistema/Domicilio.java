package sistema;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Domicilio {
	private String nombre;
	private int id;
	private int consumoAcumulado;
	private int fechaAlta;
	private Categoria categoria;
	private List<Dispositivo> dispositivos = new ArrayList<Dispositivo>();

	public Domicilio(String domicilio) {
		nombre = domicilio;
	}

	public List<Dispositivo> dispositivos() {
		return dispositivos;
	}
	
	public boolean algunDispositivoEncendido() {
		Iterator<Dispositivo> dispositivo = dispositivos.iterator();
		while(dispositivo.hasNext()) {
			if(dispositivo.next().estaEncendido()) return true;
		}
		return false;
	}

	public int cantEncendidos() {
		Iterator<Dispositivo> dispositivo = dispositivos.iterator();
		int contador=0;
		while(dispositivo.hasNext()) {
			if(dispositivo.next().estaEncendido()) contador++;
		}
		return contador;
	}

	public int cantApagados() {
		return this.cantTotal() - this.cantEncendidos();
	}

	public int cantTotal() {
		return dispositivos.size();
	}
	
	public int consumoTotal() {
		Iterator<Dispositivo> dispositivo = dispositivos.iterator();
		int consumo = 0;
		while(dispositivo.hasNext()) {
		consumo += dispositivo.next().consumo();
		}
		return consumo;
	}
	
	public void altaDispositivo(Dispositivo dispositivo) {
		dispositivos.add(dispositivo);
	}
	
	public void modificarDispositivos() {
		
	}

}
