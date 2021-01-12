package vehiculo;

import java.util.ArrayList;
import java.util.Collections;

public class Concesionaria {
	private static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	private static ArrayList<Vehiculo> listaOrdenada;
	
	public static void main(String[] args) {
		int aux;
		
		cargarVehiculo();
		mostrarVehiculos();
		separador();
		
		MostrarMasCaro(masCaro());
		MostrarMasBarato(masBarato());
		aux = PrimeroContieneLetraY("Y");
		if(aux != -1) {
			MostrarPrimeroContieneLetraY('Y', vehiculos.get(aux));
		}
		separador();
		
		listaOrdenada = new ArrayList<Vehiculo>(vehiculos);
		Collections.sort(listaOrdenada, new OrdenarPrecioDescendiente());
		MostrarOrdenadoPrecioDescendente(listaOrdenada);
	}

	
	public static void cargarVehiculo() {
		vehiculos.add(new Auto("Peugeot", "206", 4, 200000));
		vehiculos.add(new Moto("Honda", "Titan", 125, 60000));
		vehiculos.add(new Auto("Peugeot", "208", 5, 250000));
		vehiculos.add(new Moto("Yamaha", "YBR", 160, 80500.50f));
	}
	
	
	public static Vehiculo masCaro(){
		Vehiculo max = vehiculos.get(0);
		for (Vehiculo elemento : vehiculos) {
			if(elemento.getPrecio() > max.getPrecio()) {
				max = elemento;
			}
		}
		return max; 
	}
	
	public static Vehiculo masBarato() {
		Vehiculo min = vehiculos.get(0);
		for (Vehiculo elemento : vehiculos) {
			if(elemento.getPrecio() < min.getPrecio()) {
				min = elemento;
			}
		}
		return min;
	}
	
	public static int PrimeroContieneLetraY(CharSequence letra) {
		for (Vehiculo elemento : vehiculos) {
			if (elemento.getModelo().contains(letra)) {
				return vehiculos.indexOf(elemento);
			}
		}
		return -1;
	}
	
	public static void separador() {
		System.out.println("==============================");
	}
	
	public static void mostrarVehiculos() {
		for (Vehiculo elemento : vehiculos) {
			System.out.println(elemento);
		}
	}
		
	public static void MostrarMasCaro(Vehiculo vehiculo) {
		System.out.println("Vehiculo más caro: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
	}
	
	public static void MostrarMasBarato(Vehiculo vehiculo) {
		System.out.println("Vehiculo más barato: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
	}
	
	public static void MostrarPrimeroContieneLetraY(char letra, Vehiculo vehiculo) {
		System.out.println("Vehiculo que contiene en el modelo la letra: '" + letra + "': " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " " + vehiculo.mostrarPrecioConFormato());
	}
	
	public static void MostrarOrdenadoPrecioDescendente(ArrayList<Vehiculo> listaOrdenada) {
		System.out.println("Vehiculos ordenados por precio de mayor a menor: ");
		for(int i= 0; i < listaOrdenada.size(); i++) {
			System.out.println(listaOrdenada.get(i).getMarca() + " " + listaOrdenada.get(i).getModelo());
		}
	}
}
