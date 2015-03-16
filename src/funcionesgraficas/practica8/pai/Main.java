package funcionesgraficas.practica8.pai;
/**
 * 
 * @author Sabato Ceruso
 * mail: sab7093@gmail.com
 * Programación de aplicaciones interactivas.
 * Universiad de La Laguna, Santa Cruz de Tenerife, España.
 */
import javax.swing.JFrame;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 FunctionsFrame frame = new FunctionsFrame();
		 frame.setTitle("Funciones");
		 frame.setSize(500, 500);
	 	 frame.setLocationRelativeTo(null); // Center the frame
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
		    
	     frame.addFunction(new SinusoidalFunction(4, 1, 0, -180, 180));
		 frame.addFunction(new SinusoidalFunction(2, 0.5, -90, 180, null));
		 frame.addFunction(new SinusoidalFunction(3, 2, -180, null, -180));
		 frame.addFunction(new SinusoidalFunction(4, 0.2, 45));

	}

}
