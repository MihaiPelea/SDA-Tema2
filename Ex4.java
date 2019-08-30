/*
4. Declarati si initializati 2 variabile de tip int - numar, adaos. Contorizati de cate ori trebuie adunat adaos-ul
numarului citit pentru ca acesta sa fie divizibil cu 13. Afisati si numar divizibil cu 13 la care s-a ajuns prin
adunarile succesive ale adaos-ului la numarul initial.
*/

public class Ex4 {
    public static void main(String[] Args) {
        int numar = 9;
        int adaos = 11;
        int contor = 0;

        while (numar % 13 != 0) {
            numar += adaos;
            contor++;
        }
        System.out.println("Adaos-ul a fost adunat numar-ului de " + contor + " ori.");
        System.out.println("Numarul divizibil cu 13 la care s-a ajuns este " + numar);
    }
}
