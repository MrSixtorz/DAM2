package colecciones;

import java.util.ArrayList;
import java.util.Collections;

import utilidades.Utilidades;


public class Colections {
	
		public static void main(String[] args) {
			
			ArrayList <Integer> al = new ArrayList <Integer> ();
			//ArrayList <Boolean> al = new ArrayList <Boolean> ();
			//para declarar coleccion de un tipo
			
			al.add(1);
			al.add(20);
			al.add(30);
			al.add(12);
			al.add(23);
			al.add(33);
			al.add(11);
			al.add(777);
			
			System.out.println(al.size());
			
			System.out.println(al.remove(true));
			
			System.out.println(al.size());
			
			System.out.println(al.remove(true));
			
			System.out.println(al.size());
			
			System.out.println(al.get(4));
			

			System.out.println("\n----------------------");
			System.out.println("Hash "+al.get(1).hashCode());
			System.out.println("Hash "+al.get(4).hashCode());
			System.out.println("Hash "+al.get(5).hashCode());
			Utilidades.impColeccion(al);

			System.out.println("\n----------------------");
			Collections.sort(al);
			Utilidades.impColeccion(al);
			System.out.println("\n----------------------");
			
			ArrayList <Persona> alP = new ArrayList <Persona> ();
			alP.add(new Persona ("Pepe",(byte)30));
			alP.add(new Persona ("Pablo",(byte)20));
			alP.add(new Persona ("Marco",(byte)19));
			alP.add(new Persona ("Emilio",(byte)22));
			alP.add(new Persona ("Ana",(byte)23));
			alP.add(new Persona ("Emilio",(byte)16));
			
			Utilidades.impColeccion(alP);
			System.out.println("\n----------------------");
			Collections.sort(alP);
			Utilidades.impColeccion(alP);
			
			System.out.println("\n----------------------");
			Collections.reverse(alP);
			Utilidades.impColeccion(alP);
			

		}


}
