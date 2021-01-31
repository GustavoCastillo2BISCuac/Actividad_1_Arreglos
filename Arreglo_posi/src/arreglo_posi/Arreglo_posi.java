package arreglo_posi;
/** @author GUSTAVO CASTILLO */
public class Arreglo_posi {

    /** @param args the command line arguments*/
    public static void main(String[] args) {
        // TODO code application logic here
        int[] Nums;
        Nums = new int[10];
        Nums[0]= 1;
        Nums[1]= 2;
        Nums[2]= 3;
        Nums[3]= 4;
        Nums[4]= 5;
        Nums[5]= 6;
        Nums[6]= 7;
        Nums[7]= 8;
        Nums[8]= 9;
        Nums[9]= 10;
            
    System.out.println("Gustavo Moisés Castillo Canul, ID: 64758"
            + "\n Arreglo de posiciones");
    //Imprimir las diez posiciones
    for(int contador=0; contador<Nums.length;contador++){
      System.out.println(Nums[contador]);
    }
    //Calcular Suma
    int suma = 0;
    for(int contador=0;contador<10;contador++){
    suma = suma + Nums[contador];
    }
    System.out.println("La suma de las primeras diez posiciones es : " + suma);
    //Calcular Promedio o media aritmetica
    float promedio = suma / 10;
    System.out.println("El promedio de las primeras diez posiciones es : " + promedio);
 }
}