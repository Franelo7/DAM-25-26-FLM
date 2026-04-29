package ud5estudiar;

import java.util.Arrays;

public class ContenedorLista<T> implements Pila<T>, Cola<T> {
    private T[] tabla;

    public ContenedorLista(T[] t) {
        this.tabla = t;
    }

    void insertarAlPrincipio(T nuevo) {
        T[] nuevaTabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, nuevaTabla, 1, tabla.length);
        nuevaTabla[0] = nuevo;
        tabla = nuevaTabla;

    }

    void insertarAlFinal(T nuevo) {
        T[] nuevaTabla = Arrays.copyOf(tabla, tabla.length + 1);
        nuevaTabla[nuevaTabla.length - 1] = nuevo;
        tabla = nuevaTabla;
    }

    T extraerDelPrincipio() {
        T elemento = tabla[0];
        tabla = Arrays.copyOfRange(tabla, 1, tabla.length);
        return elemento;
    }

    T extraerDelFinal() {
        T elemento = tabla[0];
        tabla = Arrays.copyOfRange(tabla, 0, tabla.length - 1);
        return elemento;
    }

    void ordenar() {
        Arrays.sort(tabla);
    }

    @Override
    public String toString() {
        return Arrays.toString(tabla);
    }

    @Override
    public void apilar(T e) {
        insertarAlFinal(e);
    }

    @Override
    public T desapilar() {
        return extraerDelFinal();
    }

    @Override
    public void encolar(T e) {
        insertarAlPrincipio(e);
    }

    @Override
    public T desencolar() {
        return extraerDelPrincipio();
    }

    public static void main(String[] args) {
        ContenedorLista<Integer> lista = new ContenedorLista<>(new Integer[0]);
        lista.insertarAlFinal(7);
        lista.insertarAlFinal(9);
        lista.extraerDelFinal();
        lista.insertarAlFinal(1);
        lista.insertarAlFinal(2);
        lista.ordenar();
        System.out.println(lista);
    }

}
