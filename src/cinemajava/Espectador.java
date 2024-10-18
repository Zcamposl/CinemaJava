package cinemajava;

public class Espectador {
    
    private String nombreEspectador;
    private int edadEspectador;
    private double dineroEspectador;

    public Espectador(String nombreEspectador, int edadEspectador, double dineroEspectador) {
        this.nombreEspectador = nombreEspectador;
        this.edadEspectador = edadEspectador;
        this.dineroEspectador = dineroEspectador;
    }

    public String getNombreEspectador() {
        return nombreEspectador;
    }

    public void setNombreEspectador(String nombreEspectador) {
        this.nombreEspectador = nombreEspectador;
    }

    public int getEdadEspectador() {
        return edadEspectador;
    }

    public void setEdadEspectador(int edadEspectador) {
        this.edadEspectador = edadEspectador;
    }

    public double getDineroEspectador() {
        return dineroEspectador;
    }

    public void setDineroEspectador(double dineroEspectador) {
        this.dineroEspectador = dineroEspectador;
    }
    
}
