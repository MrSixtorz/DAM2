package colecciones;

import java.util.Objects;

public class Persona implements Comparable <Persona>{
	private String nombre="";
	private byte edad=0;
	
	Persona (String nombre, byte i){
		this.nombre=nombre;
		this.edad=i;
	}
	public String toString() {
		return nombre+" --- "+edad;
	}
	/* Si consideramos ambos campos iguales, objeto igual
	// Redifinimos el método equals para que interprete si coincide
	// la edad y el nombre, Java considere que el objeto está duplicado
	@Override
	public boolean equals (Object obj) {
		Persona p=(Persona) obj;
		if (edad==p.edad && nombre.equals(p.nombre))
			return true;
		else
			return false;
		//También se podría usar
		//return (edad==p.edad && nombre.equals(p.nombre));
	}
	// Redifinimos hashCode para que nos de un número igual cuando ambos atributos
	// sean iguales
	@Override
	public int hashCode() {
		return nombre.hashCode()+edad*1000;
	}

		// Redifinimos el método equals para que interprete si coincide
		// el nombre Java considere que el objeto está duplicado
		@Override
		public boolean equals (Object obj) {
			Persona p=(Persona) obj;
			return (nombre.equals(p.nombre));
			
		}
		
		
		// Redifinimos hashCode para que nos de un número igual cuando los nombre son iguales
		@Override
		public int hashCode() {
			return Objects.hash(nombre);
		}
	 	*/
	
	// Redifinimos el método equals para que interprete si coincide
		// la edad Java considere que el objeto está duplicado
			@Override
			public boolean equals (Object obj) {
				Persona p=(Persona) obj;
				return (edad==p.edad);
				
			}
			
			
			// Redifinimos hashCode para que nos de un número igual cuando los nombre son iguales
			@Override
			public int hashCode() {
				return Objects.hash(edad);
			}
	
		/*
		// Ordenar objeto Persona por Nombre
		@Override
		public int compareTo (Persona obj) {
			
			int res=0;
			
			res=nombre.compareTo(obj.nombre);
			
			return res; //podríamos retornar solo: return nombre.compareTo(obj.nombre)
		}
		*/
		
		// Ordenar objeto Persona por Nombre y Edad
				@Override
				public int compareTo (Persona obj) {
					
					int res=0;
					
					res=nombre.compareTo(obj.nombre);
					if (res==0)
						res=edad - obj.edad;
					
					return res; //podríamos retornar solo: return nombre.compareTo(obj.nombre)
				}
	
}
