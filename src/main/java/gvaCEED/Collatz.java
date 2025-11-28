package gvaCEED;
import java.util.Scanner;
public class Collatz {
    public static void main(String[] args) {

        // declarar scanner i variables
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        int passos = 0;
        String sequencia = "";

        // llegir número
        while (numero <= 0) {
            System.out.print("Introdueix un nombre positiu: ");
            numero = scan.nextInt();
        }

        // mostrar missatge
        System.out.println("Seqüència de Collatz per al nombre: " + numero);

        // calcular la seqüència
        sequencia = sequencia + numero;
        while (numero != 1) {
            if (numero % 2 == 0) {
                numero = numero / 2;
            } else {
                numero = (numero * 3) + 1;
            }
            sequencia = sequencia + " --> " + numero;
            passos++;
        }
        
        // mostrar seqüència completa i número de passos
        System.out.println(sequencia);
        System.out.println("Nombre total de passos: " + passos);

        // tancar scanner
        scan.close();
    }      
}

