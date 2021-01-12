package vehiculo;

public class Moto extends Vehiculo {
	private int cc;
	
	public Moto() {
		
	}
	
	public Moto(String marca, String modelo, int cc, float precio){
		super(marca, modelo, precio);
		this.cc = cc;
	}
		
	public int getCc() {
		return cc;
	}

	public String toString() {
		return "Marca: " + this.getMarca() + " // " 
		   	+ "Modelo: " + this.getModelo() + " // "
			+ "Cilindrada: " + this.getCc() + "cc" + " // "
			+ "Precio: " + this.mostrarPrecioConFormato();
	}	
}
