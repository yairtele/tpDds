package sistemaTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import ddsCalculadora.Calculadora;


public class SistemaTest {

	private Cliente juan;
	private Domicilio casa1("callao");
	private Dispositivo aire("aire acondicionado", 50);
	private Dispositivo tv("lcd 40", 40);
	private Dispositivo stereo("stereo", 30);
	
	
	@Test
	public void testLogueo() {
		aire = new Dispositivo ("aire acondicionado", 50);
		tv = new Dispositivo ("lcd 40", 40);
		stereo = new Dispositivo ("stereo", 30);
		
		assertTrue(juan.loguearse());		
	}
}
