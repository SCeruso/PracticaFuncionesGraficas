package funcionesgraficas.practica8.pai;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

import javax.swing.JPanel;

/**
 * 
 * @author Sabato Ceruso
 * mail: sab7093@gmail.com
 * Programación de aplicaciones interactivas.
 * Universiad de La Laguna, Santa Cruz de Tenerife, España.
 */
public class GraphicFunctions  extends JPanel{
	private Polygon graphicFunction;			// Polígono utilizado para pintar funciones.
	private ArrayList<Function> functions;		// Lista de funciones que serán pintadas.
	private int cXcoord;						// Coordenada x del centro de ejes.
	private int cYcoord;						// Coordenada y del centro de ejes.
	private int left;							// Parte izquierda desde donde se empieza a evaluar las funciones.
	private int right;							// Parte derecha hasta donde se evaluan las funciones.
	public final double POINT_DISTANCE = 1;		// Distancia entre puntos en pixeles.
	public final double SCALE = 50;				// Escala.
	
	public GraphicFunctions() {
		graphicFunction = new Polygon();
		functions = new ArrayList<Function>();
	}
	public GraphicFunctions(Function f) {
		graphicFunction = new Polygon();
		functions = new ArrayList<Function>();
		functions.add(f);
	}
	
	public void addFunction (Function f) {
		functions.add(f);
		repaint();
	}
	
	public int getLeft() {
		setLeft();
		return left;
	}
	
	public int getRight() {
		setRight();
		return right;
	}
	
	public void setLeft() {
		left = (int) ((-this.getWidth() / 2) * 0.8);
	}
	
	public void setRight() {
		right =  (int) ((this.getWidth() / 2) * 0.8);
	}
	/**
	 * Obtiene la coordenada x del centro de ejes luego de recalcular su posición.
	 * @return
	 */
	public int getCxCoord() {
		setCoords();
		return cXcoord;
		
	}
	public void setCxCoord(int coord) {
		cXcoord = coord;
	}
	/**
	 * Obtiene la coordenada y del centro de ejes luego de recalcular su posición.
	 * @return
	 */
	public int getCyCoord() {
		setCoords();
		return cYcoord;
		
	}
	
	public void setCyCoord(int coord) {
		cYcoord = coord;
	}
	
	private void setCoords() {
		setCxCoord(getWidth() / 2);
		setCyCoord(getHeight() / 2);
	}
	
	public ArrayList<Function> getFunctions() {
		return functions;
	}
	public void setFunctions(ArrayList<Function> functions) {
		this.functions = functions;
	}
	
	
	/**
	 * Dibuja la función indexada por el índice indxFunction.
	 * @param indxFunction	Función a dibujar.
	 */
	public void drawFunction(int indxFunction) {
		graphicFunction = new Polygon();
		int left;
		int right;
		
		if (functions.get(indxFunction).getLeftSide() != null && functions.get(indxFunction).getLeftSide() > getLeft())
			left = functions.get(indxFunction).getLeftSide();
		else
			left = getLeft();
		
		if (functions.get(indxFunction).getRightSide() != null && functions.get(indxFunction).getRightSide() < getRight())
			right = functions.get(indxFunction).getRightSide();
		else
			right = getRight();
		
		for (int i = left; i <= right; i += POINT_DISTANCE) {
			
			if (functions.size() != 0)
				graphicFunction.addPoint((int) (i + getCxCoord()), (int) (getCyCoord() - functions.get(indxFunction).f(i) * SCALE));
		}
	}
	
	/**
	 * Pinta ambos ejes de coordenadas.
	 * @param g
	 */
	private void drawAxis(Graphics g) {
		Polygon arrow1 = new Polygon();
		Polygon arrow2 = new Polygon();
		
		g.drawLine((int)(this.getWidth() * 0.05), getCyCoord(), (int)(this.getWidth() * 0.95), getCyCoord() );
		g.drawLine(getCxCoord() , (int)(this.getHeight() * 0.05), getCxCoord(), (int)(this.getHeight() * 0.95));
			
		arrow1.addPoint((int)(this.getWidth() * 0.96), getCyCoord());
		arrow1.addPoint((int)(this.getWidth() * 0.95), (int) (getCyCoord() * 0.99));
		arrow1.addPoint((int)(this.getWidth() * 0.95), (int) (getCyCoord() * 1.01));
		
		arrow2.addPoint(getCxCoord(), (int)(this.getHeight() * 0.04));
		arrow2.addPoint((int) (getCxCoord() * 0.99), (int)(this.getHeight() * 0.05));
		arrow2.addPoint((int) (getCxCoord() * 1.01), (int)(this.getHeight() * 0.05));
	
		g.fillPolygon(arrow1);
		g.fillPolygon(arrow2);
		
		g.drawString("x", (int)(this.getWidth() * 0.96), (int)(getCyCoord() * 1.05));
		g.drawString("y", (int)(getCxCoord() * 1.04), (int)(this.getHeight() * 0.04));
	}
	protected void paintComponent(Graphics g) {
		
		super.paintComponents(g);
		g.setColor(Color.BLACK);
		drawAxis(g);
		g.setColor(Color.RED);
		
		for(int i = 0; i < functions.size(); i++) {
			drawFunction(i);
			g.drawPolyline(graphicFunction.xpoints, graphicFunction.ypoints, graphicFunction.npoints);
		}
		
	}
}
