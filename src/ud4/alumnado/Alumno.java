package ud4.alumnado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Alumno {
    String nombre;
    String apellido1;
    String apellido2;
    LocalDate fechaNacimiento;
    double notaProgramacion;
    double notaContornos;

    public void mostrar() {
        System.out.println("Ficha de Alumno/a");
        System.out.println("=================");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido1: " + apellido1);
        System.out.println("Apellido2: " + apellido2);
        System.out.println("Nombre de usuari@: " + getUsername());
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento.format(formato));
        System.out.println("Nota Programación: " + notaProgramacion);
        System.out.println("Nota Contornos: " + notaContornos);
        System.out.println("Nota media: " + ((notaProgramacion + notaContornos) / 2));
    }

    public String getUsername() {
        String usuario = "";
        nombre = nombre.toLowerCase();
        apellido1 = apellido1.toLowerCase();
        apellido2 = apellido2.toLowerCase();

        if (nombre.charAt(0) == 'ñ' || nombre.charAt(0) == 'á' || nombre.charAt(0) == 'é' || nombre.charAt(0) == 'í'
                || nombre.charAt(0) == 'ó' || nombre.charAt(0) == 'ú' || nombre.charAt(0) == 'ü') {
            switch (nombre.charAt(0)) {
                case 'ñ':
                    usuario += 'n';
                    break;
                case 'á':
                    usuario += 'a';
                    break;
                case 'é':
                    usuario += 'é';
                    break;
                case 'í':
                    usuario += 'í';
                    break;
                case 'ó':
                    usuario += 'o';
                    break;
                case 'ú':
                    usuario += 'u';
                    break;
                case 'ü':
                    usuario += 'u';
                    break;
                default:
                    break;
            }
        } else {
            usuario += nombre.charAt(0);
        }
        int tamaño1 = apellido1.length();
        int tamaño2 = apellido2.length();
        if (tamaño1 > 3) {
            tamaño1 = 4;
        } else {
            tamaño1 = apellido1.length();
        }
        if (tamaño2 > 3) {
            tamaño2 = 4;
        } else {
            tamaño2 = apellido2.length();
        }
        for (int i = 0; i < tamaño1; i++) {
            if (apellido1.charAt(i) == 'ñ' || apellido1.charAt(i) == 'á' || apellido1.charAt(i) == 'é'
                    || apellido1.charAt(i) == 'í'
                    || apellido1.charAt(i) == 'ó' || apellido1.charAt(i) == 'ú' || apellido1.charAt(i) == 'ü') {
                switch (apellido1.charAt(i)) {
                    case 'ñ':
                        usuario += 'n';
                        break;
                    case 'á':
                        usuario += 'a';
                        break;
                    case 'é':
                        usuario += 'é';
                        break;
                    case 'í':
                        usuario += 'í';
                        break;
                    case 'ó':
                        usuario += 'o';
                        break;
                    case 'ú':
                        usuario += 'u';
                        break;
                    case 'ü':
                        usuario += 'u';
                        break;
                    default:
                        break;
                }

            } else if (Character.isWhitespace(apellido2.charAt(i))) {
                break;
            } else {
                usuario += apellido1.charAt(i);
            }

        }
        for (int i = 0; i < tamaño2; i++) {
            if (apellido2.charAt(i) == 'ñ' || apellido2.charAt(i) == 'á' || apellido2.charAt(i) == 'é'
                    || apellido2.charAt(i) == 'í'
                    || apellido2.charAt(i) == 'ó' || apellido2.charAt(i) == 'ú' || apellido2.charAt(i) == 'ü') {
                switch (apellido2.charAt(i)) {
                    case 'ñ':
                        usuario += 'n';
                        break;
                    case 'á':
                        usuario += 'a';
                        break;
                    case 'é':
                        usuario += 'é';
                        break;
                    case 'í':
                        usuario += 'í';
                        break;
                    case 'ó':
                        usuario += 'o';
                        break;
                    case 'ú':
                        usuario += 'u';
                        break;
                    case 'ü':
                        usuario += 'u';
                        break;
                    default:
                        break;
                }

            } else if (Character.isWhitespace(apellido2.charAt(i))) {
                break;
            } else {
                usuario += apellido2.charAt(i);
            }

        }

        return usuario;

    }
}
