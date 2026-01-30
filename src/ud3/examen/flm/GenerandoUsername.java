package ud3.examen.flm;

/**
 * @author Fran
 */
public class GenerandoUsername {
    public static void main(String[] args) {
        System.out.println(getUsername("María", "Souto", "Souto"));
        System.out.println(getUsername("Óscar", "Graña", "Müller"));
        System.out.println(getUsername("Ángel", "Cos", "de la Torre"));
    }

    static String getUsername(String nombre, String ap1, String ap2) {
        String usuario = "";
        nombre = nombre.toLowerCase();
        ap1 = ap1.toLowerCase();
        ap2 = ap2.toLowerCase();

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
        int tamaño1 = ap1.length();
        int tamaño2 = ap2.length();
        if (tamaño1 > 3) {
            tamaño1 = 4;
        } else {
            tamaño1 = ap1.length();
        }
        if (tamaño2 > 3) {
            tamaño2 = 4;
        } else {
            tamaño2 = ap2.length();
        }
        for (int i = 0; i < tamaño1; i++) {
            if (ap1.charAt(i) == 'ñ' || ap1.charAt(i) == 'á' || ap1.charAt(i) == 'é' || ap1.charAt(i) == 'í'
                    || ap1.charAt(i) == 'ó' || ap1.charAt(i) == 'ú' || ap1.charAt(i) == 'ü') {
                switch (ap1.charAt(i)) {
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

            } else if (Character.isWhitespace(ap2.charAt(i))) {
                break;
            } else {
                usuario += ap1.charAt(i);
            }

        }
        for (int i = 0; i < tamaño2; i++) {
            if (ap2.charAt(i) == 'ñ' || ap2.charAt(i) == 'á' || ap2.charAt(i) == 'é' || ap2.charAt(i) == 'í'
                    || ap2.charAt(i) == 'ó' || ap2.charAt(i) == 'ú' || ap2.charAt(i) == 'ü') {
                switch (ap2.charAt(i)) {
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

            } else if (Character.isWhitespace(ap2.charAt(i))) {
                break;
            } else {
                usuario += ap2.charAt(i);
            }

        }

        return usuario;

    }
}