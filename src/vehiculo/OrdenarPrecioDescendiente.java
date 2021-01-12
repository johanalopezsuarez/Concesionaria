package vehiculo;

import java.util.Comparator;

public class OrdenarPrecioDescendiente implements Comparator<Vehiculo> {
	public int compare (Vehiculo x, Vehiculo y) {
		int compararPrecio = Float.compare(x.getPrecio(), y.getPrecio());
		if(compararPrecio != 0) {
			return -compararPrecio;
		}else{
			int compararMarca = x.getMarca().compareTo(y.getMarca());
			if(compararMarca != 0) {
				return compararMarca;
				}else{
					int compararModelo = x.getModelo().compareTo(y.getModelo());
					return compararModelo;
				}
			}
		}
}
