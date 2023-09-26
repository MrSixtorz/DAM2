package Interface;
public class Principal
{
    public static void main (){
        //No se puede instanciar
        //InterfaceA iA = new InterfaceA();
        InterfaceA iA = new Clase();
        Clase c = new Clase();
        iA.mostrarMensajeA();
        c.mostrarMensajeA();
        c.mostrarMensajeB();
        //iA no podría ejecutar iA.mostrarMensajeB();
    }
}
