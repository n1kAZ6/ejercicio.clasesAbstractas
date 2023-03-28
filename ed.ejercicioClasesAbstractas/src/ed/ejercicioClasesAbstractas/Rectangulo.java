package ed.ejercicioClasesAbstractas;

public class Rectangulo extends Figura{

	//Atributos
	private int base;
	private int altura;
	
	//Constructor
	public Rectangulo(String tipo, int base, int altura) {
		super(tipo);
		this.base=base;
		this.altura=altura;
	}

	
	//Propiedades getter & setter
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}

	//Métodos
	@Override
	public double area() {
		return this.base * this.altura;
	}

}
