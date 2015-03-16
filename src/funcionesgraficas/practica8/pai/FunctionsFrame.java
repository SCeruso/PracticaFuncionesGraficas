package funcionesgraficas.practica8.pai;
import java.util.ArrayList;

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
	private ArrayList<Function> functions;
	
	public FunctionsFrame() {
		functions = new ArrayList<Function>();
		functionsPanel = new GraphicFunctions();
		
		this.add(functionsPanel);
	}
	
	public void addFunction(Function newFunction) {
		functions.add(newFunction);
		functionsPanel.setFunctions(functions);
	}
}
