package funcionesgraficas.practica8.pai;
/**
 * 
 * @author Sabato Ceruso
 * mail: sab7093@gmail.com
 * Programación de aplicaciones interactivas.
 * Universiad de La Laguna, Santa Cruz de Tenerife, España.
 */
import javax.swing.JFrame;

public class FunctionsFrame extends JFrame{
	private GraphicFunctions functionsPanel;
	
	public FunctionsFrame() {
		
		SinusoidalFunction fs1 = new SinusoidalFunction(1, 1, 0);
		SinusoidalFunction fs2 = new SinusoidalFunction(1, 1, 90);
		functionsPanel = new GraphicFunctions(fs1);
		functionsPanel.addFunction(fs2);
		this.add(functionsPanel);
	}
}
