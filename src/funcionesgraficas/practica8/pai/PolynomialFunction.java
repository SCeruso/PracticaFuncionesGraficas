package funcionesgraficas.practica8.pai;

import java.util.ArrayList;

/**
 * 
 * @author Sabato Ceruso
 * mail: sab7093@gmail.com
 * Programación de aplicaciones interactivas.
 * Universiad de La Laguna, Santa Cruz de Tenerife, España.
 */
public class PolynomialFunction extends Function{
	
	private ArrayList<Term> polynom;	// Polinomio que defina a la función.
	
	public PolynomialFunction() {
		super();
		polynom = new ArrayList<Term>();
	}
	
	public PolynomialFunction(Integer left, Integer right) {
		super(left, right);
		polynom = new ArrayList<Term>();
	}
	
	public void addTerm(Term term) {
		polynom.add(term);
	}
	
	@Override
	public double f(double x) {
		double res = 0;
		Term aux;
		for (int i = 0; i < polynom.size(); i++) {
			aux = polynom.get(i);
			res += aux.getCoef() * Math.pow(x, aux.getGrade());
		}
		return res;
	}
}
