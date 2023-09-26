package Herencias;

public class Principal
{
    public static void main(String[] args)
    {
        Padre padre = new Padre("Torrente",15);
        System.out.println(padre.getDato1());
        System.out.println(padre);
        Hijo1 hijo=new Hijo1 ("Torrentillo",1,(float)25.5);
        System.out.println(hijo.getDato1());
        System.out.println(hijo);
        Padre.prueba();
        Hijo1.prueba();
        Padre p = new Hijo1 ("Ana",7,(float)15.5); 
        //creamos objeto padre a traves del hijo, al reves no podemos
        System.out.println(p);
        System.out.println(p.getDato1());
        System.out.println(hijo.getDato1());
        p.mostrarMensajePadre();
        //p.mostrarMensajeHijo(); //padre no puede llamar a metodos del hijo
        padre.mostrarMensajePadre();
        //padre.mostrarMensajeHijo();
        hijo.mostrarMensajePadre();
        hijo.mostrarMensajeHijo();
        Nieto nieto = new Nieto ("Alicia",1,3.6F,"Nieta");
        System.out.println(nieto);
        Padre p1 = new Nieto ("Roberto",2,(float)5.56,"Nieto"); 
        System.out.println(p1);
        nieto.mostrarMensajePadre();
        nieto.mostrarMensajeHijo();
    }
}
