package suma_edades_compañeros;
/** @author GUSTAVO CASTILLO */
public class SUMA_EDADES_COMPAÑEROS {

    public static void main(String[] args) {
        // TODO code application logic here
         //Arreglo de nombres    
    String[] nombre = {"GREGORIO", "Darlin", "ESTEFANIA", "JORGE", "LUIS"};
    //Cambio de nombres
    nombre[0] = "CECILIA";
    nombre[2] = "EDUARDO";
    nombre[4] = "VICTORIA";
    //Arreglo de edades 
    int[] edad;
    edad = new int[5];
    edad[0] = 20;
    edad[1] = 21;
    edad[2] = 22;
    edad[3] = 23;
    edad[4] = 24;
    //Cambio de edades
    edad[0] = 22;
    edad[2] = 19;
    edad[4] = 20;

    System.out.println("Gustavo Moisés Castillo Canul, ID: 64758"
            + "\n Arreglo de nombres y edades");

    System.out.println("Nombre del compañero 1:" + nombre[0]);
    System.out.println("Edad:" + edad[0]);
    System.out.println("-----------");

    System.out.println("Nombre del compañero 2:" + nombre[1]);
    System.out.println("Edad:" + edad[1]);
    System.out.println("-----------");

    System.out.println("Nombre del compañero 3:" + nombre[2]);
    System.out.println("Edad: " + edad[2]);
    System.out.println("-----------");

    System.out.println("Nombre del compañero 4:" + nombre[3]);
    System.out.println("Edad:" + edad[3]);
    System.out.println("-----------");

    System.out.println("Nombre del compañero 5:" + nombre[4]);
    System.out.println("Edad: " + edad[4]);
    System.out.println("-----------"); 
    
    System.out.println("SUMA DE LAS EDADES: ");
    int suma=0;
    for(int contador=0;contador<edad.length;contador++){
    suma = suma + edad[contador];
    }
    System.out.println("La suma de las edades es igual a : " + suma);
    System.out.println("-----------"); 
    System.out.println("PROMEDIO : ");
    float promedio = 0;
    promedio = suma / 5;
    System.out.println("El promedio de las edades es igual a : " + promedio);
    }
    
}
