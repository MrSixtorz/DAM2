package colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HSPers {

public static void main(String[] args){
		
		
		Pers pj1 = new Pers ((String)"Pepita", (byte)55);
		Pers pj2 = new Pers ((String)"Juan", (byte)77);
		Pers pj3 = new Pers ((String)"Lucas", (byte)25);
		Pers pj4 = new Pers ((String)"Pepe", (byte)25);
		Pers pj5 = new Pers ((String)"Lucas", (byte)35);
		Pers pj6 = new Pers ((String)"Pepe", (byte)25);

		HashSet<Pers> hs = new HashSet <Pers> ();
		
		hs.add(pj1);
		hs.add(pj2);
		hs.add(pj3);
		hs.add(pj4);
		hs.add(pj5);
		hs.add(pj6);
		hs.add(pj6);
		
		impCollection(hs);
		
	}
	public static void impCollection(Set hs) {
		Iterator it = hs.iterator();
		if (hs.isEmpty())
			System.out.println("la colección está vacía");
		else
			do {
				System.out.println(it.next());
			}while (it.hasNext());
	}
	
	
	public class Pers {
		private String nombre="";
		private byte edad=0;
		
		Pers (String nombre, byte i){
			this.nombre=nombre;
			this.edad=i;
		}
		public String toString() {
			return nombre+" --- "+edad;
		}
	}
}
