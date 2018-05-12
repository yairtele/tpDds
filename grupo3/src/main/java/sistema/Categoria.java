package sistema;

public class Categoria {
	private float cargoFijo;
	private float cargoVariable;
	private int consumoReferencia;
	
	public float costoMensual(int consumo) {
		return this.cargoFijo + (this.cargoVariable * consumo);
	}

}
