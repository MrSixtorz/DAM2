package utilidades;

import java.util.Collection;
import java.util.Iterator;

public class Utilidades {

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
