/*
3. Declarati si initializati o variabila de tip String. Afisati mesajul *-*-* de atatea ori echivalent cu numarul de
caractere al string-ului citit. Mesajele se afiseaza pe cate o linie noua.
*/

public class Ex3 {
    public static void main(String[] Args) {
        String cuvant = "Mihai";

        for (int a = 0; a < cuvant.length(); a++) {
            System.out.println("*-*-*");
        }
    }
}
