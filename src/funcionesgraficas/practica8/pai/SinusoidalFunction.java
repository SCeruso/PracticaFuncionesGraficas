package funcionesgraficas.practica8.pai;
/**
 * 
 * @author Sabato Ceruso
 * mail: sab7093@gmail.com
 * Programación de aplicaciones interactivas.
 * Universiad de La Laguna, Santa Cruz de Tenerife, España.
 */
public class SinusoidalFunction extends Function {
	private double a;		// Amplitud
	private double w;		// Velocidad angular
	private double phi;		// Fase
	
	public SinusoidalFunction(double ampl, double omega, double phase) {
		super();
		a = ampl;
		w = omega;
		phi = phase;
	}
	
	public SinusoidalFunction(double ampl, double omega, double phase, Integer left, Integer right) {
		super(left, right);
		a = ampl;
		w = omega;
		phi = phase;
	}
	@Override
	public double f(double x) {
		return a * Math.sin(Math.toRadians((w * x + phi)));
	}

}
