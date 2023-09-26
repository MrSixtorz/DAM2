package colecciones;

import java.util.Collection;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.SortedSet;

/*SortedSet
 * Objeto first()
 * Objeto last ()
 * SortedSet headSet(objeto) elementos menores a este objeto no inclusive
 * SortedSet tailSet(objeto) objetos mayores al objeto, inclusive
 * SortedSet subSet (objeto1, objeto2) objetos >= objeto1 y < objeto2
 */

public class ColeccionesSortedSet {
	
	public static void main (String[] args){

		// Lo creamos SortedSet para poder guardarlo como nueva coleccion
		TreeSet <Integer> ts = new TreeSet <Integer> ();
		SortedSet <Integer> ts1 = new TreeSet <Integer> ();
		
		ts.add(1);
		ts.add(7);
		ts.add(23);
		ts.add(14);
		ts.add(5);
		ts.add(66);
		ts.add(17);
		ts.add(38);
		ts.add(29);
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println("-------------");
		
		impColeccion(ts);
		
		System.out.println("-------------");
		System.out.println(ts.remove(1));
		System.out.println(ts.remove(11));
		impColeccion(ts);
		
		System.out.println("-------------");
		
		System.out.println(ts.headSet(15));
		
		ts1=ts.tailSet(22);
		System.out.println(ts1);

		
		
	}
	// Usamos collection para que el método para todo tipo de colecciones,
	// a pesar de que tendremos un warning
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

