package Herencias;
public class Padre
{
    private String dato1="";
    public int dato2=0;
    
    Padre (String dato1, int dato2){
        this.dato1=dato1;
        this.dato2=dato2;
    }
    Padre (String dato1){
        this.dato1=dato1;
    }
    Padre (int dato2){
        this.dato2=dato2;
    }
    public String getDato1(){
        return dato1;
    }
    public void setDato1(String dato1){
        this.dato1=dato1;
    }
    public Integer getDato2(){
        return dato2;
    }
    public void setDato2(Integer dato2){
        this.dato2=dato2;
    }
    public String toString(){
        return dato1+" - "+dato2;
    }
    public static void prueba(){
        System.out.println("Prueba Padre");
    }
    // public final String toString() - Si usamos final no podemos redifinirlo
    // en sus hijos
    //public static String toString() - Si usamos static tampoco nos dejará
    //redifinirlo a no estático, porque es un metodo de clase
    public void mostrarMensajePadre(){
        System.out.println("Mensaje Padre");
    }
}
