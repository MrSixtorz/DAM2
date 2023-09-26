package Herencias;
public class Nieto extends Hijo1
{
    private String dato4="";
    
    public Nieto (String dato1, int dato2, float dato3, String dato4){
        super(dato1,dato2,dato3);
        this.dato4=dato4;
    }
    public String toString(){
        return super.toString()+" - "+dato4;
    }
}
