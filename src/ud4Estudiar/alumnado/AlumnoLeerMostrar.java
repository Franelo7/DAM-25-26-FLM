package ud4Estudiar.alumnado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AlumnoLeerMostrar {

    public static Alumno alumnoLeer() {
        Scanner sc = new Scanner(System.in);
        Alumno almn = new Alumno();
        System.out.print("Introduce el nombre del alumno: ");
        almn.nombre = sc.nextLine();
        System.out.print("Introduce el primer apellido del alumno: ");
        almn.apellido1 = sc.nextLine();
        System.out.print("Introduce el segundo apellido del alumno: ");
        almn.apellido2 = sc.nextLine();
        System.out.print("Fecha de Nacimiento (dd/mm/aaaa): ");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        almn.fechaNacimiento = LocalDate.parse(sc.nextLine(), formato);
        System.out.print("Introduce la nota de programación del alumno: ");
        almn.notaProgramacion = sc.nextDouble();
        System.out.print("Introduce la nota de contornos del alumno: ");
        almn.notaContornos = sc.nextDouble();
        return almn;
    }

    public static void alumnoMostrar(Alumno almn) {
        System.out.println("================== DATOS ALUMNO ==================");
        System.out.println("Nombre: " + almn.nombre);
        System.out.println("Apellido 1: " + almn.apellido1);
        System.out.println("Apellido 2: " + almn.apellido2);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Fecha de Nacimiento: " + almn.fechaNacimiento.format(formato));
        System.out.println("Nota Prog: " + almn.notaProgramacion);
        System.out.println("Nota Contornos: " + almn.notaContornos);

    }

    public static void main(String[] args) {
        Alumno p1 = alumnoLeer();
        alumnoMostrar(p1);

    }

}
