package colecciones;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class TSNumero {

public static void main(String[] args) {
		
		TreeSet <Integer> ts = new TreeSet <Integer> ();
		
		ts.add(23);
		ts.add(22);
		ts.add(40);
		ts.add(30);
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(10);
		ts.add(10);
		ts.add(20);
		ts.add(40);
		ts.add(30);
		
		impArrayList(ts);
	}
	
	public static void impArrayList(Collection <Integer> al) {
		Iterator <Integer> it = al.iterator();
		if (al.isEmpty())
			System.out.println("la colección está vacía");
		else
			do {
				Integer var = it.next();
				System.out.println(var+" "+var.hashCode());
			}while (it.hasNext());
	}
	
	
}
