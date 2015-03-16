package funcionesgraficas.practica8.pai;
/**
 * 
 * @author Sabato Ceruso
 * mail: sab7093@gmail.com
 * ProgramaciÃ³n de aplicaciones interactivas.
 * Universiad de La Laguna, Santa Cruz de Tenerife, EspaÃ±a.
 */
public abstract class Function {
	
	private Integer leftSide;	// Limite izquierdo del dominio de la función, será -infinito si es null
	private Integer rightSide;	// Limite derecho del dominio de la función, será infinito si es null
	
	/**
	 * Crea una función con dominio en R.
	 */
	public Function() {
		leftSide = null;
		rightSide = null;
	}
	/**
	 * Crea una función con dominio limitado entre left y right.
	 * @param left
	 * @param right
	 */
	public Function(Integer left, Integer right) {
		leftSide = left;
		rightSide = right;
	}
	public Integer getLeftSide() {
		return leftSide;
	}
	public void setLeftSide(Integer leftSide) {
		this.leftSide = leftSide;
	}
	public Integer getRightSide() {
		return rightSide;
	}
	public void setRightSide(Integer rightSide) {
		this.rightSide = rightSide;
	}
	/**
	 * 
	 * @param x Coordenada x en la que evaluar la funciÃ³n.
	 * @return Valor de la y para un determinado x.
	 */
	public abstract double f(double x);
}
