package Principal;

import Clases.comestible;
import Clases.noComestible;
import Clases.tienda;

public class Principal {

	public static void main(String[] args) {
		tienda tienda = new tienda();

		comestible c1 = new comestible(10.5, 3, "patatitas", "Grefusa", false, false, false, "21-12-24", false);
		comestible c2 = new comestible(3.5, 8, "cerveza", "Mahou", false, true, false, "21-12-25", true);
		comestible c3 = new comestible(1.5, 6, "Coca-cola", "Coca-cola company", false, true, true, "21-12-25", true);
		noComestible nc4 = new noComestible(3.0, 100, "Tabaco", "Malboro", true);
		noComestible nc5 = new noComestible(5, 3, "SuperPop", "PANINI", false);
		noComestible nc6 = new noComestible(9, 6, "tabaco", "Pueblo", true);

		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(nc4.toString());
		System.out.println(nc5.toString());
		System.out.println(nc6.toString());

		tienda.añadirProducto(c1);
		tienda.añadirProducto(c2);
		tienda.añadirProducto(c3);
		tienda.añadirProducto(nc4);
		tienda.añadirProducto(nc5);
		tienda.añadirProducto(nc6);

		System.out.println(
				"***********************************************************************************************************");

		tienda.mostrarTienda();
		
		System.out.println(
				"***********************************************************************************************************");
		
		c1.necesitafrio();
		c2.necesitafrio();

		tienda.eliminarProducto("tabaco");

		System.out.println(
				"***********************************************************************************************************");

		tienda.mostrarTienda();

		System.out.println(
				"***********************************************************************************************************");

		System.out.println(tienda.buscar("Coca-cola"));

		tienda.modificar("patatitas", "patatas");

		System.out.println(
				"***********************************************************************************************************");

		tienda.mostrarTienda();

		System.out.println(
				"***********************************************************************************************************");
		//Aqui probamos si esta bien el calcular impuestos otra vez, el cual aparece en el mostrar.
		System.out.println(c2.calcularImpuestos());
		System.out.println(c3.calcularImpuestos());

		System.out.println(
				"***********************************************************************************************************");

		System.out.println(nc4.calcularImpuestos());
		System.out.println(nc5.calcularImpuestos());
		System.out.println(nc6.calcularImpuestos());

		System.out.println(
				"***********************************************************************************************************");

		c2.todoElPublico();
		c3.todoElPublico();
		nc4.todoElPublico();
		nc5.todoElPublico();
		nc6.todoElPublico();

	}

}
