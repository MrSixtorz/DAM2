package colecciones;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class TSPersona {

	public static void main(String[] args){
		
		
		Persona pj1 = new Persona ((String)"Pepita", (byte)55);
		Persona pj2 = new Persona ((String)"Juan", (byte)77);
		Persona pj3 = new Persona ((String)"Lucas", (byte)25);
		Persona pj4 = new Persona ((String)"Pepe", (byte)25);
		Persona pj5 = new Persona ((String)"Lucas", (byte)35);
		Persona pj6 = new Persona ("Pepe",(byte)25);

		TreeSet <Persona> tsP = new TreeSet <Persona> ();
		
		tsP.add(pj1);
		tsP.add(pj2);
		tsP.add(pj3);
		tsP.add(pj4);
		tsP.add(pj5);
		tsP.add(pj6);
		tsP.add(pj6);
		tsP.add(new Persona("Paco",(byte)44));
		tsP.add(new Persona("Paco",(byte)44));
		tsP.add(new Persona("Paco",(byte)28));
		
		impColeccion(tsP);
		
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
	
}
