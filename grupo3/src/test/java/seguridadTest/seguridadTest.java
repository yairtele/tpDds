package seguridadTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import ddsCalculadora.Calculadora;


public class Seguridadtest {

	private User juan;
	
	@Test
	public void testLogueo() {
		juan = new User();
		assertTrue(juan.loguearse());		
	}
}
