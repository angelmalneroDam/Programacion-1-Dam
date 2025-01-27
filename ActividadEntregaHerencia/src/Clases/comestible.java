package Clases;

public class comestible extends Producto {
	protected boolean azucarado;
	protected boolean alcohol;
	protected boolean bebida;
	protected String fechaCaduc;
	protected boolean Frio;

	public comestible(double precio, int cantidad, String nombre, String proveedor, boolean azucarado, boolean alcohol,
			boolean bebida, String fechaCaduc, boolean Frio) {
		super(precio, cantidad, nombre, proveedor);
		this.azucarado = azucarado;
		this.alcohol = alcohol;
		this.bebida = bebida;
		this.fechaCaduc = fechaCaduc;
		this.Frio = Frio;
	}

	@Override
	public double calcularImpuestos() {
		double impEsp = 0.144;
		double impAzu = 0.0396;
		double iva = 0.21;

		if (alcohol == true) {
			return (Precio + impEsp) * (1 + iva);
		} else if (azucarado == true) {
			return (Precio + impAzu) * (1 + iva);
		}

		return Precio * (1 + iva);

	}

	@Override
	public void todoElPublico() {
		if (alcohol == true) {
			System.out.println("Esto no es para mayores de edad");

		} else {
			System.out.println("Esto lo puede comprar cualquiera");
		}

	}

	public void necesitafrio() {
		if (Frio == true) {
			System.out.println("El producto necesita frio, metelo a la nevera");
		} else {
			System.out.println("El producto puede mantenerse fuera");
		}
	}

	@Override
	public String toString() {
		return "comestible" + super.toString() + "[azucarado=" + azucarado + ", alcohol=" + alcohol + ", bebida="
				+ bebida + "Fecha caducidad=" + fechaCaduc +"]";
	}

}
