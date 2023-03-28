package ed.ejercicioClasesAbstractas;

public abstract class Figura {
	//Atributo
    private String tipo;  

    //Constructor
    public Figura(String tipo) {
          this.tipo = tipo; 
    } 
    
    //Propiedades getter & setter
    public String getTipo() {
		return tipo;
	}   
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	//Método abstracto calculo area que tendran que sobreescribir las clases derivadas
	public abstract double area(); 
}

