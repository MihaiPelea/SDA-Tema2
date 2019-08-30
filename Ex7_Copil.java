/*
7. OOP - Creati o clasa Copil care sa contina numele acestuia, varsta si numarul de jucarii. Implementati metodele
"bunaZiua", in care sa afiseze mesajul "Buna Ziua", metoda "salut", care primeste ca parametru un nume (de exemplu,
Daniel) si va afisa "Salut, Daniel", precum si o metoda in care acesta poate primi o noua jucarie (o data sau de mai
multe ori) in care sa actualizati numarul curent de jucarii. Creati o clasa Main in care sa demonstrati
functionalitatile create.
*/

public class Ex7_Copil {
    String numeCopil;
    int varstaCopil;
    int numarInitialJucarii;

    void bunaZiua() {
        System.out.println("Buna Ziua");
    }

    void salut() {
        System.out.println("Salut, " + numeCopil);
    }

    int jucarieNoua (int jucariiNoi) {
        for(int a = 1; a <= jucariiNoi; a++){
            numarInitialJucarii++;
        }
        return numarInitialJucarii;
    }

}
