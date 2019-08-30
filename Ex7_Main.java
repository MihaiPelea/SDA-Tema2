/*
7. OOP - Creati o clasa Copil care sa contina numele acestuia, varsta si numarul de jucarii. Implementati metodele
"bunaZiua", in care sa afiseze mesajul "Buna Ziua", metoda "salut", care primeste ca parametru un nume (de exemplu,
Daniel) si va afisa "Salut, Daniel", precum si o metoda in care acesta poate primi o noua jucarie (o data sau de mai
multe ori) in care sa actualizati numarul curent de jucarii. Creati o clasa Main in care sa demonstrati
functionalitatile create.
*/

public class Ex7_Main {
    public static void main(String[] Args) {
        Ex7_Copil copilNou = new Ex7_Copil();
        copilNou.numeCopil = "Daniel";
        copilNou.numarInitialJucarii = 3;
        int jucariiPrimite = 2;

        copilNou.bunaZiua();
        copilNou.salut();
        System.out.println("Numar curent de jucarii: " + copilNou.jucarieNoua(jucariiPrimite));
    }
}
