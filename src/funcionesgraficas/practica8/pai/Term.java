package funcionesgraficas.practica8.pai;
/**
 * 
 * @author Sabato Ceruso
 * mail: sab7093@gmail.com
 * Programación de aplicaciones interactivas.
 * Universiad de La Laguna, Santa Cruz de Tenerife, España.
 */
public class Term {
	private int grade;				// Grado del término.
	private double coefficient;	// Coeficiente del término.
	
	public Term(double newCoef, int newGrade) {
		grade = newGrade;
		coefficient = newCoef;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public double getCoef() {
		return coefficient;
	}
}
