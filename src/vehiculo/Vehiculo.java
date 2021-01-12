package vehiculo;

public class Vehiculo {
	private String marca;
	private String modelo;
	private float precio; 
	
	public Vehiculo() {
		
	}
	public Vehiculo(String marca, String modelo, float precio){
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public float getPrecio() {
		return precio;
	}
		
	public String mostrarPrecioConFormato() {
		return "$" + String.format(java.util.Locale.ITALY, "%,.2f", this.getPrecio());
	}
	
	
	public String toString() {
		return "Marca: " + this.getMarca() + " // " 
			 + "Modelo: " + this.getModelo() + " // "
			 + "Precio: " + this.mostrarPrecioConFormato();
	}	
}
