package colecciones;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class TS {

public static void main(String[] args) {
		
		TreeSet <String> ts = new TreeSet <String> ();
		
		ts.add("Hola");
		ts.add("Hola");
		ts.add("Buenas");
		ts.add("Adios");
		ts.add("Buenas");
		ts.add("Buenas");
		ts.add("Buenas");
		ts.add("Adios");
		ts.add("Adios");
		ts.add("Fin");
		
		impArrayList(ts);
	}
	
	public static void impArrayList(Collection <String> al) {
		Iterator <String> it = al.iterator();
		if (al.isEmpty())
			System.out.println("la colección está vacía");
		else
			do {
				String var = it.next();
				System.out.println(var+" "+var.hashCode());
			}while (it.hasNext());
	}
	
	
}

