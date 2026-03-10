package ud4Estudiar.clases;

public class Sintonizador {
    private double frecuencia;
    private double[] memorias;

    // --- CONSTRUCTORES ---
    
    // Constructor por defecto
    public Sintonizador() {
        this.frecuencia = 80.0;
        this.memorias = new double[3]; // Espacio para 3 emisoras
    }

    // Constructor con parámetro
    public Sintonizador(double frecuenciaInicial) {
        this.memorias = new double[3];
        // Usamos el setter para aprovechar la validación y la excepción
        setFrecuencia(frecuenciaInicial); 
    }

    // --- GETTER, SETTER Y DISPLAY ---

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        // Requisito 4: Generar una excepción
        if (frecuencia < 80.0 || frecuencia > 108.0) {
            throw new IllegalArgumentException("Error: La frecuencia " + frecuencia + " está fuera del rango permitido (80 - 108 MHz).");
        }
        this.frecuencia = frecuencia;
    }

    public void display() {
        System.out.println("Frecuencia sintonizada: " + this.frecuencia + " MHz");
    }

    // --- MÉTODOS DE SINTONIZACIÓN ---

    public void up() {
        modificarFrecuencia(0.5);
    }

    public void down() {
        modificarFrecuencia(-0.5);
    }

    // Requisito 3: Sintonización fina
    public void upFino() {
        modificarFrecuencia(0.1);
    }

    public void downFino() {
        modificarFrecuencia(-0.1);
    }

    // Método centralizado para evitar repetir código (Requisito 2)
    private void modificarFrecuencia(double salto) {
        this.frecuencia += salto;
        
        // Redondeamos a 1 decimal para evitar errores de precisión de punto flotante en Java 
        // (por ejemplo, que 80.0 + 0.1 acabe siendo 80.0999999999)
        this.frecuencia = Math.round(this.frecuencia * 10.0) / 10.0;

        // Comprobación de límites (extremo contrario)
        if (this.frecuencia > 108.0) {
            this.frecuencia = 80.0;
        } else if (this.frecuencia < 80.0) {
            this.frecuencia = 108.0;
        }
    }

    // --- GESTIÓN DE MEMORIAS (Requisito 1) ---

    // Guarda la frecuencia actual en el canal indicado (1, 2 o 3)
    public void guardarMemoria(int canal) {
        if (canal >= 1 && canal <= 3) {
            memorias[canal - 1] = this.frecuencia;
            System.out.println("-> Frecuencia " + this.frecuencia + " guardada en el canal " + canal);
        } else {
            System.out.println("Canal no válido. Debe ser 1, 2 o 3.");
        }
    }

    // Recupera y sintoniza la frecuencia del canal indicado
    public void recuperarMemoria(int canal) {
        if (canal >= 1 && canal <= 3) {
            double frecGuardada = memorias[canal - 1];
            if (frecGuardada >= 80.0 && frecGuardada <= 108.0) {
                this.frecuencia = frecGuardada;
                System.out.println("-> Canal " + canal + " recuperado.");
            } else {
                System.out.println("El canal " + canal + " está vacío.");
            }
        } else {
            System.out.println("Canal no válido. Debe ser 1, 2 o 3.");
        }
    }
}