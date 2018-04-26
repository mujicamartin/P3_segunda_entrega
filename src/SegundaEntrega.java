
public class SegundaEntrega {

	/*
	 * Se deberá entregar el ejercicio número 6)
	 * Implemente la clase ArbolBinario para búsquedas.
	 * con los métodos void insert(Object) y boolean hasElem(Object).
	 * 
	*/
	public static void main(String[] args) {
		Arbol a1 = new Arbol ();
		
		a1.insert(10);
		a1.insert(5);
		a1.insert(3);
		a1.insert(4);
		a1.insert(15);
		a1.insert(12);
		a1.insert(18);
		a1.insert(20);
		a1.insert(2);
		
		System.out.println("Nodos del Arbol en Orden");
		a1.imprimirEnOrden();
		System.out.println();

		int x = 10;
		System.out.println("Existe el "+x+" ? "+a1.hasElem(x));
		x = 1;
		System.out.println("Existe el "+x+" ? "+a1.hasElem(x));
		x = 25;
		System.out.println("Existe el "+x+" ? "+a1.hasElem(x));
		x = 2;
		System.out.println("Existe el "+x+" ? "+a1.hasElem(x));
		x = 14;
		System.out.println("Existe el "+x+" ? "+a1.hasElem(x));
	}
	
}
