package funcionesgraficas.practica8.pai;
/**
 * 
 * @author Sabato Ceruso
 * mail: sab7093@gmail.com
 * Programación de aplicaciones interactivas.
 * Universiad de La Laguna, Santa Cruz de Tenerife, España.
 */
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SinusoidalFunctionTest {
	
	@Test
	/**
	 * Probamos el correcto funcionamiento de la función sinusoidal.
	 */
	public void testF() {
		SinusoidalFunction f = new SinusoidalFunction(1, 1, 0);
		
		assertEquals(f.f(0), 0, 0.01);
		assertEquals(f.f(90), 1, 0.01);
		assertEquals(f.f(45), Math.sqrt(2) / 2, 0.01);
		
		f = new SinusoidalFunction(1, 2, 0);
		
		assertEquals(f.f(0), 0, 0.01);
		assertEquals(f.f(90), 0, 0.01);
		assertEquals(f.f(45), 1, 0.01);
	}

}
