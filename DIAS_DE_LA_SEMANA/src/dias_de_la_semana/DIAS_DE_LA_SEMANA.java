package dias_de_la_semana;
import java.util.Scanner;
/** @author GUSTAVO CASTILLO */
public class DIAS_DE_LA_SEMANA {
static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
      String Dia[]={"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
      System.out.println("Gustavo Moisés Castillo Canul, ID: 64758"
              + "\n Arreglo de posiciones"
              + "\n --------------------");
      System.out.println("Favor de ingresar un numero del 1 al 7");
      int m= entrada.nextInt();
      if(m >= 1 && m <= 7){System.out.println("El dia "+m+" es "+Dia[m-1]);
      }
      else{System.out.println("Error, No es un dia de la semana");
      }
    }
}