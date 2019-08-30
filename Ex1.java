/*
1. Declarati si initializati 2 variabile de tip int. Declarati si initializati unei variabile numita "operatie"
unul dintre urmatoarele simboluri: +, -, /, *, %, |, &. Folosind instructiunile de control ale flow-ului invatate,
afisati rezultatul corespunzator operatiei dintre cele 2 numere in functie de valoarea pe care o are variabila
"operatie" -> in cazul in care e +, afisati suma celor 2 numere; in cazul in care e -, diferenta, etc. (rezolvati
problema in 2 moduri, unul in care folositi instructiunea IF, si altul in care folositi SWITCH)
*/

public class Ex1 {
    public static void main(String[] Args) {
        int a = 20;
        int b = 5;
        char operatie = '+';

        if (operatie == '+') {
            System.out.println(a + b);
        } else if (operatie == '-') {
            System.out.println(a - b);
        } else if (operatie == '/') {
            System.out.println(a / b);
        } else if (operatie == '*') {
            System.out.println(a * b);
        } else if (operatie == '%') {
            System.out.println(a % b);
        } else if (operatie == '|') {
            System.out.println(a | b);
        } else if (operatie == '&') {
            System.out.println(a & b);
        } else {
            System.out.println("Introdu alt operator");
        }

        switch (operatie) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            case '|':
                System.out.println(a | b);
                break;
            case '&':
                System.out.println(a & b);
                break;
            default:
                System.out.println("Introdu alt operator");
        }

    }

}
