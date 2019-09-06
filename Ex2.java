/*
2. Declarati si initializati 2 variabile de tip String. Afisati care dintre acestea are suma valorilor caracterelor in
codul ASCII mai mare (ex: AAB mai mic decat zz    -> "AAB" = 65+65+66 = 196 "zz" = 122+122 = 244  -> 196 < 244).
*/

public class Ex2 {
    public static void main(String[] Args) {
        String string1 = "AAB";
        String string2 = "zz";
        if (sumaCaractere(string1) < sumaCaractere(string2)) {
            System.out.println(string1 + " mai mic decat " + string2);
        } else if (sumaCaractere(string1) > sumaCaractere(string2)) {
            System.out.println(string1 + " mai mare decat " + string2);
        } else if (sumaCaractere(string1) == sumaCaractere(string2)) {
            System.out.println(string1 + " este egal cu " + string2);
        }
    }

    private static int sumaCaractere(String sirCaractere) {
        int sumaAscii = 0;
        for (int i = 0; i < sirCaractere.length(); i++) {
            sumaAscii += sirCaractere.charAt(i);
        }
        System.out.println(sirCaractere + " = " + sumaAscii);
        return sumaAscii;
    }
}



