package ud3.strings.practicas;

import java.util.Scanner;

public class Matriculas {
    public static void main(String[] args) {

        System.out.println(esMatriculaValida("3139CBG"));

    }

    boolean siguienteMatricula(String matricula) {
        return esMatriculaValida(matricula);

    }

    static boolean esMatriculaValida(String matricula) {
        if (matricula.length() < 7 || matricula.length() > 7 || matricula == null) {
            return false;
        }
        char[] caracteres = matricula.toCharArray();
        int contadorTrue = 0;
        for (int i = 0; i <= 3; i++) {
            boolean comprobar = Character.isDigit(caracteres[i]);
            if (comprobar) {
                contadorTrue++;
            }
        }
        if (contadorTrue == 4) {
            int contadorTrueLetras = 0;
            String letras = "qñaeiouáéíóú";
            char[] letrasArray = letras.toCharArray();
            for (int i = 4; i <= 6; i++) {
                boolean comprobar = Character.isAlphabetic(caracteres[i]);
                if (comprobar) {
                    contadorTrueLetras++;
                }
                for (int j = 4; j <= 6; j++) {
                    if (caracteres[i] == letrasArray[j]) {
                        contadorTrueLetras = 100;
                    }
                }
            }
            if (contadorTrueLetras == 3) {
                return true;
            }
        }
        return false;
    }
}