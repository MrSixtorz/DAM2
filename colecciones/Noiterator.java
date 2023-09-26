package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Noiterator {
	public static void main (String[] args) {
		ArrayList <Integer> al = new ArrayList <Integer> ();
		al.add(3);
		al.add(13);
		al.add(23);
		al.add(33);
		al.add(43);
		for (Integer i:al)
			System.out.println(i);
		impArrayList2(al);
		impArrayList1(al);
		impArrayList3(al);
		
		
	}
	public static void impArrayList1(ArrayList <Integer> al) {
		Integer contador=0;
		if (al.isEmpty())
			System.out.println("la colección está vacía");
		else
			do {
				System.out.println(al.get(contador));
				contador=contador+1;
			}while (contador<al.size());
	}

	public static void impArrayList2(ArrayList <Integer> al) {
		Iterator <Integer> it = al.iterator();
		if (al.isEmpty())
			System.out.println("la colección está vacía");
		else
			do {
				System.out.println(it.next());
			}while (it.hasNext());
	}
	
	public static void impArrayList3(ArrayList <Integer> al) {
		ListIterator <Integer> it = al.listIterator(2);
		if (al.isEmpty())
			System.out.println("la colección está vacía");
		else
			do {
				System.out.println(it.next());
			}while (it.hasNext());
	}


}
