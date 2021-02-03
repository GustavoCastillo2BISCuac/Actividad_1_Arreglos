package mes;
import java.util.Scanner;
/** @author GUSTAVO CASTILLO */
public class Mes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      String Mes[]={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
      System.out.println("Gustavo Moisés Castillo Canul, ID: 64758"
              + "\n Arreglo de Meses"
              + "\n --------------------");
      System.out.println("Favor de ingresar un numero del 1 al 12");
      int m= entrada.nextInt();
      if(m >= 1 && m <= 7){System.out.println("El mes es "+Mes[m-1]);
      }
       else{System.out.println("Error, No es un dia de la semana");
      }
    }
}