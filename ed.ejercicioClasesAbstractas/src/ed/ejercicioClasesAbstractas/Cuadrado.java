package ed.ejercicioClasesAbstractas;

public class Cuadrado extends Figura{

	//Atributos 
	private int base;
	
	//Constructor
	public Cuadrado(String tipo, int base) {
		super(tipo);
		this.base=base;
	}

	//Propiedades getter & setter
	public int getLado() {
		return base;
	}
	public void setLado(int base) {
		this.base = base;
	}

	//Métodos
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.base*this.base;
	}		
}
