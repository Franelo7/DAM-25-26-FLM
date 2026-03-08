package ud4Estudiar.alumnado;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class AlumnoLeerMostrarCSV {
    public static ArrayList<Alumno> leerCSV(String fichero) {

        ArrayList<Alumno> alumnos = new ArrayList<>();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {

            BufferedReader br = new BufferedReader(new FileReader(fichero));

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                Alumno a = new Alumno();

                a.nombre = datos[0];
                a.apellido1 = datos[1];
                a.apellido2 = datos[2];
                a.fechaNacimiento = LocalDate.parse(datos[3], formato);
                a.notaProgramacion = Double.parseDouble(datos[4]);
                a.notaContornos = Double.parseDouble(datos[5]);

                alumnos.add(a);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error leyendo el archivo");
        }

        return alumnos;
    }

    public static void alumnoMostrar(ArrayList<Alumno> alumnos) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (Alumno a : alumnos) {

            System.out.println("================== DATOS ALUMNO ==================");
            System.out.println("Nombre: " + a.nombre);
            System.out.println("Apellido 1: " + a.apellido1);
            System.out.println("Apellido 2: " + a.apellido2);
            System.out.println("Fecha de Nacimiento: " + a.fechaNacimiento.format(formato));
            System.out.println("Nota Prog: " + a.notaProgramacion);
            System.out.println("Nota Contornos: " + a.notaContornos);
        }

    }

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = leerCSV("DATOS - Alumnos.csv");
        alumnoMostrar(alumnos);

    }
}
