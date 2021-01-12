package vehiculo;

public class Auto extends Vehiculo {
	private int puertas;
	
	public Auto() {
		
	}
	
	public Auto(String marca, String modelo,  int puertas, float precio){
		super(marca, modelo, precio);
		this.puertas = puertas;			
	}
		
	public int getPuertas() {
		return puertas;
	}

	public String toString() {
		return "Marca: " + this.getMarca() + " // " + 
				"Modelo: " + this.getModelo() + " // " +
				"Puertas: " + this.getPuertas() + " // " +
				"Precio: " + this.mostrarPrecioConFormato();
	}
}
