package producto;

public class consumidor extends Producto {

	public consumidor(String nombre, Double precio) {
		super(nombre, precio);
	}

	public static void main(String[] args) {
		Producto Producto = new Producto ("Cojin", 500.0);
		Producto.imprimirInfo();
		Producto.aplicarDto(20.0);
	}

}