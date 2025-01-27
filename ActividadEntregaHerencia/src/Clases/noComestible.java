package Clases;

public class noComestible extends Producto {
	protected boolean tabaco;

	public noComestible(double precio, int cantidad, String nombre, String proveedor, boolean tabaco) {
		super(precio, cantidad, nombre, proveedor);
		this.tabaco = tabaco;
	}

	@Override
	public double calcularImpuestos() {
		double impAdValoren = 1.53;
		double impEsp = 0.45;
		double iva = 0.21;

		if (tabaco == true) {
			double precioBaseIva = Precio * (1 + iva);
			return precioBaseIva + impAdValoren + impEsp;
		}

		return Precio * (1 + iva);
	}

	@Override
	public void todoElPublico() {
		if (tabaco == true) {
			System.out.println("Esto no es para mayores de edad");

		} else {
			System.out.println("Esto lo puede comprar cualquiera");
		}
		

	}

	@Override
	public String toString() {
		return "noComestible"+super.toString()+"[tabaco=" + tabaco + "]";
	}

}
