package ud4Estudiar.herencia;

public class Main {
    public static void main(String[] args) {
        Persona[] gente = new Persona[5];
        gente[0] = new Persona("Javi", (byte) 19, 1.7);
        gente[1] = new Empleado("Javi", (byte) 19, 1.7, 1000);
        gente[2] = new Estudiante("Maria", (byte) 14, 1.4, 2, 5, 8);
        for (int i = 0; i < gente.length; i++) {
            System.out.println(gente[i]);

        }

        System.out.println(gente[0].equals(gente[1])); // true

        Object a1 = "Luis"; // Un objeto String referenciado por una variable Object
        System.out.println(a1.getClass()); // class java.lang.String
        System.out.println(a1.getClass().getName()); // String (Nombre cualificado)

        HoraExacta h1 = new HoraExacta(1, 10, 45);
        HoraExacta h2 = new HoraExacta(1, 10, 46);
       
        System.out.println(h1.equals(h2));
    }
}
