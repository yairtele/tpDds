package sistema;

public class Dispositivo {
	private String nombre;
	private int consumoDispositivo;
	private boolean estado;
	private float horasEncendido;

	public Dispositivo(String nombre, int consumo) {
		nombre = nombre;
		consumoDispositivo = consumo;
	}
	
	public int consumo() {
		return consumoDispositivo;
	}
	
	public boolean estaEncendido() {
		return estado;
	}

}
