package colecciones;

import java.util.ArrayList;

/*
boolean add(objeto)
boolean remove(objeto)
int size()
boolean contains(objeto)
void clear()
boolean addAll(coleccion)
boolean removeAll(coleccion)
boolean retainAll(collection)
boolean containsAll(coleccion)
Object[] toArray()
boolean isEmpty()
Iterator iterator
*/

/*
 INTERFACE LIST
 Object get(indice)
 void remove(indice)
 Object set(indice,objeto)
 void add(indice,objeto)
 int indexOf(objeto)
 int lastindexOf(Objeto)
 void addAll(indice,coleccion)
 List subList(indice,indice)
 ListIterator listIterator() Empieza por 0
 ListIterator listIterator(indice) Empieza por indice
 */

/* ITERATOR
Object next() Siguiente objeto de la coleccion
boolean hasNext() hay un elemento más
void remove() borra el último elemento devuelto por un next
Object previous() Objeto previo de la coleccion
boolean hasPrevious() Mira si hay un elemento previo
 */

/* LINKEDLIST
getFirst() Da el primer elemento de la lista
getLast() Da el último elemento de la lista
addFirst(objeto) Añade objeto como 1 de la lista
addLast(objeto) Añade objeto como ultimo de la lista
removeFirst() Borra 1 objeto
removeLast() Borra último objeto
 */

/* LinkedHashSet -> HashSet
No permiten duplicados, Cuando hay un duplicado lo pone en la misma "celda" del objeto duplicado.
Pero cuando recorre la colección solo recorre la primera "columna".
Cada Hash es único, con números es igual al número: 1 -> Hash 1.
En Strings, por ejemplo, hay un algoritmo que calcula el número de Hash que le asigna.
HashCode es el metodo para obtener el hash de un elemento de la coleccion.
No respeta el orden de introducción.
 */

/* TREESET
 ordena
 */

public class Colecciones {
	
		@SuppressWarnings("unchecked")
		public static void main(String[] args) {
			
			@SuppressWarnings("rawtypes")
			ArrayList al = new ArrayList();
			//ArrayList <Boolean> al = new ArrayList <Boolean> ();
			//para declarar coleccion de un tipo
			
			al.add(1);
			al.add(20);
			al.add(30.55);
			al.add(true);
			al.add(true);
			al.add(true);
			al.add('a');
			al.add("cadena");
			
			System.out.println(al.size());
			
			System.out.println(al.remove(true));
			
			System.out.println(al.size());
			
			System.out.println(al.remove(true));
			
			System.out.println(al.size());
			
			System.out.println(al.get(4));
			
			if ((boolean) al.get(3))
				System.out.println("Correcto");
			
			System.out.println("Hash "+al.get(1).hashCode());
			System.out.println("Hash "+al.get(4).hashCode());
			System.out.println("Hash "+al.get(5).hashCode());
			
			
		}

}
