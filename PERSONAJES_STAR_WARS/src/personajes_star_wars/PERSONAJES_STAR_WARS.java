package personajes_star_wars;
/** @author GUSTAVO CASTILLO */
public class PERSONAJES_STAR_WARS {
    public static void main(String[] args) {
        // TODO code application logic here
        String[]personajes;
        personajes = new String[16];
        personajes[0]="Luke Skywalker";
        personajes[1]="R2-D2";
        personajes[2]="C-3PO";
        personajes[3]="Darth Vader";
        personajes[4]="Leia Organa";
        personajes[5]="Owen Lars";
        personajes[6]="Beru Whitesun lars";
        personajes[7]="R5-D4";
        personajes[8]="Biggs Darklighter";
        personajes[9]="Obi-Wan Kenobi";
        personajes[10]="Yoda";
        personajes[11]="Jek Tono Porkins";
        personajes[12]="Jabba Desilijic Tiure";
        personajes[13]="Han Solo";
        personajes[14]="Chewbacca";
        personajes[15]="Anakin Skywalker";
        System.out.println("Gustavo Moisés Castillo Canul, ID: 64758"
                + "\n Personajes de Star Wars"
                + "\n --------------------");
        System.out.println("CICLO FOR I");
        for (int i = 0; i < personajes.length; i++) {
        System.out.println(personajes[i]);
    }
        System.out.println("--------------------");
        System.out.println("CICLO FOR EACH");
        for (String num : personajes) {
        System.out.println(num);
        }
    }
}