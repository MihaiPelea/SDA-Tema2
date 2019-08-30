/*
2. Declarati si initializati 2 variabile de tip String. Afisati care dintre acestea are suma valorilor caracterelor in
codul ASCII mai mare (ex: AAB mai mic decat zz    -> "AAB" = 65+65+66 = 196 "zz" = 122+122 = 244  -> 196 < 244).
*/

public class Ex2 {
    public static void main(String[] Args) {
        String string1 = "AAB";
        String string2 = "zz";

        byte[] ascii1 = string1.getBytes();
        int sumaAscii1 = 0;
        for (int a = 0; a < string1.length(); a++) {
            sumaAscii1 += ascii1[a];
        }

        byte[] ascii2 = string2.getBytes();
        int sumaAscii2 = 0;
        for (int a = 0; a < string2.length(); a++) {
            sumaAscii2 += ascii2[a];
        }

        boolean sumaCaractere = (sumaAscii1 > sumaAscii2);
        if (sumaCaractere) {
            System.out.println(string1 + " mai mare decat " + string2);
        } else {
            System.out.println(string1 + " mai mic decat " + string2);
        }

    }
}
