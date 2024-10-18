package cinemajava;

public class Asiento {
    private int fila;
    private char columna;
    private boolean estado;

    public Asiento(int fila, char columna) {
        this.fila = fila;
        this.columna = columna;
        this.estado = false;
    }
    
    public boolean estaOcupado(){
        return estado;
    }
    public String etiqueta(){
        return fila + "" + columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        this.columna = columna;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
