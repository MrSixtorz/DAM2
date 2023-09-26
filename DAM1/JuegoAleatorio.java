package DAM1;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Random;

/**
 * Write a description of class JuegoAleatorio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JuegoAleatorio
{
    public static void main (String [] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num1=0;
        int num2=0;
        int alea=0;
        int vida=0;
        int intento=0;
        int [] numInt;
        byte i=0;
        short cont=0;
        Random aleatorio= new Random();
        
        System.out.print("Introduce el primer número: ");
        String aux=br.readLine();
        num1=Integer.parseInt(aux);
        System.out.print("Introduce el segundo número: ");
        aux=br.readLine();
        num2=Integer.parseInt(aux);
        while (num1>=num2){
            System.out.print("El segundo número tiene que ser mayor que "+num1+": ");
            aux=br.readLine();
            num2=Integer.parseInt(aux);
        }
        System.out.print("Cuantos intentos quieres: ");
        aux=br.readLine();
        vida=Integer.parseInt(aux);
        while (vida<1){
            System.out.print("Los intentos tienen que ser mayores que 0: ");
            aux=br.readLine();
            vida=Integer.parseInt(aux);
        }
        numInt=new int[vida];
        cont=0;

        alea=aleatorio.nextInt(num2-num1+1)+num1;
        do{
            System.out.println("Número inicial: "+num1);
            System.out.println("Número Final: "+num2);
            System.out.println("Intentos: "+vida);
            if (cont>0)
                System.out.print("Números intentados: ");
                for(i=0;i<cont;i++){
                    System.out.print(numInt[i]+" ");
                }
            System.out.print("\nIntenta adivinar el número: ");
            aux=br.readLine();
            intento=Integer.parseInt(aux);
            while (intento<num1 || intento>num2){
                System.out.print("El número tiene que estar entre "+num1+" y "+num2+": ");
                aux=br.readLine();
                intento=Integer.parseInt(aux);
            }
            if (intento>alea){
                vida=vida-1;
                System.out.println("No es correcto.El número es menor. Te queda "+vida+" oportunidad/es\n");
                num2=intento-1;
            }
            else
                if (intento<alea){
                    vida=vida-1;
                System.out.println("No es correcto.El número es mayor. Te queda "+vida+" oportunidad/es\n");
                num1=intento+1;
                }
            numInt[cont]=intento;
            cont++;
        }while(vida>0 && intento!=alea);
        if (intento==alea)
            System.out.println("¡¡¡¡¡Acertaste!!!! ENHORABUENA");
        else
            System.out.println("GAME OVER!!!\nEl número era "+alea+".\nNo te recomiendo ser Adivino,vidente,ni jugar a juegos de azar.");
        
        
        
        return;
    }
}
