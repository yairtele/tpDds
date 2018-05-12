package sistemaTest;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import sistema.*;
import org.junit.Assert;

public class SistemaTest {

	private Cliente juan;
	private Domicilio casa1;	
	private Domicilio casa2;
	private Dispositivo pc;
	private Dispositivo tv;
	private Dispositivo lampara;
	private Dispositivo aire;
	private Dispositivo stereo;
	
	
	
	@Test	
	public void testCantidadDeDispositivos() {

		casa1 = new Domicilio("callao");
		
		casa1.altaDispositivo(aire);
		casa1.altaDispositivo(tv);
		casa1.altaDispositivo(stereo);
		
		Assert.assertEquals(casa1.cantTotal(), 3);
	}
	
	@Test
	public void testConsumoTotal() {

		casa1 = new Domicilio("callao");
		aire = new Dispositivo("aire", 40);
		tv = new Dispositivo("tv", 50);
		stereo = new Dispositivo("stereo", 30);
		
		
		casa1.altaDispositivo(aire);
		casa1.altaDispositivo(tv);
		casa1.altaDispositivo(stereo);
		
		Assert.assertEquals(casa1.consumoTotal(), 120);
		
	}

	@Test
	public void testConsumoCliente() {
		juan = new Cliente();
		casa1 = new Domicilio("callao");
		casa2 = new Domicilio("thames");
		pc = new Dispositivo("pc", 80);
		tv = new Dispositivo("tv", 50);
		lampara = new Dispositivo("lampara", 20);
		
		
		juan.altaDomicilio(casa1);
		juan.altaDomicilio(casa2);
		
		casa1.altaDispositivo(pc);
		casa1.altaDispositivo(tv);
		casa2.altaDispositivo(lampara);
		
		Assert.assertTrue(juan.domicilios().contains(casa2));
		Assert.assertTrue(casa1.dispositivos().contains(pc));
		
	}
	
	
	
	
	
	
}
