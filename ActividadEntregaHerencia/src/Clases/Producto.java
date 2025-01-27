package Clases;

public abstract class Producto {
	protected double Precio;
	protected int cantidad;
	protected String nombre;
	protected String proveedor;
	public Producto(double precio, int cantidad, String nombre, String proveedor) {
		super();
		Precio = precio;
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.proveedor = proveedor;
	}
	
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	/**
	 * calcula el precio con los impuestos
	 * @return double
	 */
	public abstract double calcularImpuestos();
	/**
	 * te dice si el producto es apto para todo el mundo
	 */
	public abstract void todoElPublico();
	@Override
	public String toString() {
		return "Producto [Precio=" + Precio +", Precio final="+calcularImpuestos()+ ", cantidad=" + cantidad + ", nombre=" + nombre + ", proveedor="
				+ proveedor + "]";
	}
	

}
