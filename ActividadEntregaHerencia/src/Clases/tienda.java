package Clases;


public class tienda {
	protected static Producto[] productos;

	public tienda() {
		productos = null;
	}

	public tienda(int tama) {
		productos = new Producto[tama];
	}

	public static Producto[] getProductos() {
		return productos;
	}

	public static void setProductos(Producto[] productos) {
		tienda.productos = productos;
	}

	/**
	 * añade un producto a la tienda
	 * 
	 * @param p
	 */
	public void añadirProducto(Producto p) {
		if (productos == null) {
			productos = new Producto[1];
			productos[0] = p;
		} else {
			int tamNuevo = productos.length + 1;
			Producto[] nuevoV = new Producto[tamNuevo];
			for (int i = 0; i < productos.length; i++) {
				nuevoV[i] = productos[i];

			}
			nuevoV[tamNuevo - 1] = p;
			productos = nuevoV;
		}
	}

	/**
	 * elimina un producto
	 * 
	 * @param nombre
	 * @return boolean
	 */
	public boolean eliminarProducto(String nombre) {
		int pos = -1;

		for (int i = 0; i < productos.length; i++) {
			if (productos[i].getNombre().equals(nombre)) {
				pos = i;
			}
		}

		if (pos == -1) {
			return false;
		}

		Producto[] nuevo = new Producto[productos.length - 1];

		for (int i = 0; i < pos; i++) {
			nuevo[i] = productos[i];
		}

		for (int i = pos + 1; i < productos.length; i++) {
			nuevo[i - 1] = productos[i];
		}

		productos = nuevo;

		return true;
	}

	/**
	 * busca un producto
	 * 
	 * @param nombre
	 * @return producto
	 */
	public Producto buscar(String nombre) {
		for (int i = 0; i < productos.length; i++) {
			if (productos[i].getNombre().equals(nombre)) {
				return productos[i];
			}

		}
		return null;
	}

	/**
	 * modifica un producto
	 * 
	 * @param nombre
	 * @param nuevoNombre
	 * @return boolean
	 */
	public boolean modificar(String nombre, String nuevoNombre) {
		Producto p = buscar(nombre);
		if (p == null)
			return false;
		else {
			p.setNombre(nuevoNombre);
			return true;
		}

	}

	/**
	 * muesta la tienda
	 */
	public void mostrarTienda() {
		for (int i = 0; i < productos.length; i++) {
			System.out.println(productos[i].toString());

		}
	}

}
