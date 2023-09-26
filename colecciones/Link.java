package colecciones;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Link {
	
	public static void main(String[] args) {
		
		LinkedList <Integer> al = new LinkedList <Integer> ();
		
		al.add(2);
		al.addFirst(1);
		al.add(3);
		al.addLast(5);
		al.add(3,4);
		
		impArrayList2(al);
	}
	
	public static void impArrayList2(List<Integer> al) {
		Iterator <Integer> it = al.iterator();
		if (al.isEmpty())
			System.out.println("la colección está vacía");
		else
			do {
				System.out.println(it.next());
			}while (it.hasNext());
	}
	

}
