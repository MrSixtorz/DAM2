package colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("unused")
public class HS {
	
	public static void main(String[] args) {
		
		HashSet <String> hs = new HashSet <String> ();
		
		hs.add("Hola");
		hs.add("Hola");
		hs.add("Buenas");
		hs.add("Adios");
		hs.add("Buenas");
		hs.add("Buenas");
		hs.add("Buenas");
		hs.add("Adios");
		hs.add("Adios");
		hs.add("Fin");
		
		impArrayList(hs);
	}
	
	public static void impArrayList(Collection<String> al) {
		Iterator <String> it = al.iterator();
		if (al.isEmpty())
			System.out.println("la colección está vacía");
		else
			do {
				System.out.println(it.next()+" "+it.hashCode());
			}while (it.hasNext());
	}
	
	
}
