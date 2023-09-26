package colecciones;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HSPersona {
	
	public static void main(String[] args){
		
		
		Persona pj1 = new Persona ((String)"Pepita", (byte)55);
		Persona pj2 = new Persona ((String)"Juan", (byte)77);
		Persona pj3 = new Persona ((String)"Lucas", (byte)25);
		Persona pj4 = new Persona ((String)"Pepe", (byte)25);
		Persona pj5 = new Persona ((String)"Lucas", (byte)35);
		Persona pj6 = new Persona ("Pepe",(byte)25);

		HashSet <Persona> hs = new HashSet <Persona> ();
		
		hs.add(pj1);
		hs.add(pj2);
		hs.add(pj3);
		hs.add(pj4);
		hs.add(pj5);
		hs.add(pj6);
		hs.add(pj6);
		hs.add(new Persona("Paco",(byte)44));
		hs.add(new Persona("Paco",(byte)44));
		
		impColeccion(hs);
		
	}
	// Usamos collection para que el método para todo tipo de colecciones,
	// a pesar de que tendremos un warning
	@SuppressWarnings("rawtypes")
	public static void impColeccion(Collection al) {
		Iterator it = al.iterator();
		if (al.isEmpty())
			System.out.println("la colección está vacía");
		else
			do {
				System.out.println(it.next());
			}while (it.hasNext());
	}
	
	/*Para imprimir cualquier Collection podriamos dejarlo
	 * public static void impCollection(Collection al) {
		Iterator it = al.iterator();
		if (al.isEmpty())
			System.out.println("la colección está vacía");
		else
			do {
				System.out.println(it.next());
			}while (it.hasNext());
	}
	 */
}
