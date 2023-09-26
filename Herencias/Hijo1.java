package Herencias;
public class Hijo1 extends Padre //solo puede heredar de 1
{
    private float dato3=0;
    
    Hijo1(String dato1, int dato2, float dato3){
        //this.dato1=dato1; //solo si es público
        //this.dato2=dato2; //solo si es público
        super(dato1,dato2); //super llama al constructor de la clase Padre
        this.dato3=dato3;
    }
    Hijo1(String dato1, float dato3, int dato2){
        //this.dato1=dato1; //solo si es público
        //this.dato2=dato2; //solo si es público
        super(dato1); //super llama al constructor de la clase Padre
        //super siempre debe ser la primera instrucción, si no dará error
        this.dato2=dato2; //si fuera publico
        this.dato3=dato3;
    }
    //Redefinimos toString()
    public String toString(){
        return getDato1()+" - "+getDato2()+" - "+dato3; 
        //nos deja hacerlo por el compilador, poner super para que funcione 100%
        //return super.toString()+"-"+dato3;
        //return super.getDato1()+"-"+dato2+"-"+dato3; 
        //Padre p = new Padre();
        //return p.getDato1()+"-"+dato3;
    }
    public static void prueba(){
        System.out.println("Prueba Hijo");
    }
    public void mostrarMensajeHijo(){
        System.out.println("Mensaje Hijo");
    }
}
