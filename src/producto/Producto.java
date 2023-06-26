package producto;

public class Producto {

	public String nombre;
	public Double precio;
	
	public Producto (String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public void imprimirInfo() {
		System.out.printf("El nombre del producto: %s%n"
				+ "El precio es %.2f", this.nombre, this.precio);
	}
	
	public void aplicarDto(Double descuento) {
		Double dto = precio * (descuento/100);
		 System.out.println("El descuento es de: " + descuento + " % \nEl precio del producto con descuento es: $" + 			(precio-dto) + " MXN");
	}
}