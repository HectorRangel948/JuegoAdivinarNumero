package juegoadivinarnumero;
import java.util.*;

public class JuegoAdivinarNumero {
    private static boolean comparar(int entrada, int encontrar, int oportunidad){
        boolean continuar=true;
        if(entrada==encontrar){
            System.out.print("\nFelicidades, has encontrado el número\n");
            continuar=false;
        }
        else if(entrada>100 || entrada<0){System.out.println("WTF Bro? el número está entre el 0 y el 100");}
        else if(entrada>encontrar && oportunidad>1){System.out.print("\nEl número que estoy pensando es más pequeño");}
        else if(entrada<encontrar && oportunidad>1){System.out.print("\nEl número que estoy pensando es más grande");}
        return continuar;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner console = new Scanner(System.in);
        int encontrar = rand.nextInt(0, 101);
        int entrada = 0;
        int oportunidades = 5;

        System.out.print("\nEstoy pensando en un número entre 0 y 100, cuál es? :D");

        for (int op = oportunidades; op >= 0; op--) {
            if(op>0){
                System.out.println("\nOportunidades: " + op);
                System.out.print("\nCreo que es el ");
                try{
                    entrada=console.nextInt();
                    if(comparar(entrada, encontrar, op)){
                        if(op>1)System.out.println("\nInténtalo de nuevo");
                    }
                    else{break;}
                }catch(Exception e){
                    System.out.println("\nSolo números enteros, lo siento :("); 
                    break;}
                }
            else{System.out.println("\nSe terminaron las oportunidades\nEl número que tenía en mente era el " + encontrar + " :/\n");}
        }
    }
}
