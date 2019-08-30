/*
5. Declarati si initializati o variabila de tip int. Utilizand while, afisati ultima cifra a numarului initial, atat
timp cat, utima cifra a numarului care urmeaza sa fie trunchiat rand pe rand este divizibila cu 3. ( ex: 235693 -
afisam 333   ->3,9,6 divizibile cu 3)
 */

public class Ex5 {
    public static void main(String[] Args) {
        int numar = 235693;
        int contor = 0;
        int copie = numar;

        while ((numar % 10) % 3 == 0) {
            System.out.print(3);
            numar /= 10;
            contor++;
        }

        while (contor != 0) {
            System.out.print(" ");
            contor--;
        }

        if ((copie % 10) % 3 == 0) {
            System.out.print("->");
            System.out.print(copie % 10);
            copie /= 10;
            while ((copie % 10) % 3 == 0) {
                System.out.print("," + (copie % 10));
                copie /= 10;
            }
            System.out.println(" divizibile cu 3");
        }
    }
}
