package cinemajava;

public class Cine {
    
     private Peliculas pelicula;
    private int vEntrada;
    private Asiento[][] asiento;

    public void mensajeCine() {
        System.out.println("********************");
        System.out.println("*Bienvenido Cuevana*");
        System.out.println("********************");
        System.out.println("");
    }

    public Cine(Peliculas pelicula, int vEntrada) {
        this.pelicula = pelicula;
        this.vEntrada = vEntrada;
        this.asiento = new Asiento[8][9];
        for (int i = 0; i < asiento.length; i++) {
            for (int j = 0; j < asiento[i].length; j++) {
                this.asiento[i][j] = new Asiento(8 - i, (char) ('A' + j));
            }
        }
    }

    public void asignarAsiento(Espectador espectador) {
        if (espectador.getEdadEspectador() >= pelicula.getEdadMin() &&
                espectador.getDineroEspectador() >= vEntrada) {
            boolean asientoAsignado = false;
            while (!asientoAsignado) {
                int fila = (int) (Math.random() * asiento.length);
                int columna = (int) (Math.random() * asiento[0].length);
                
                Asiento asientos = asiento[fila][columna];

                if (!asientos.estaOcupado()) {
                    asientos.setEstado(true);
                    System.out.println("Asiento asignado a " +
                            espectador.getNombreEspectador() + ": " +
                            asiento[fila][columna].getFila() +
                            asiento[fila][columna].getColumna());
                    asientoAsignado = true;
                }
            }
            if (!asientoAsignado) {
                System.out.println("No hay asientos libres disponibles");
            }
        } else {
            System.out.println("No cumple con las condiciones para sentarse");
        }
    }

    public void mostrarAsientos() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                if (asiento[i][j].estaOcupado()) {
                    System.out.print("[" + asiento[i][j].getFila() + "," + asiento[i][j].getColumna() + "] red ");
                } else {
                    System.out.print("[" + asiento[i][j].getFila() + "," + asiento[i][j].getColumna() + "] gris ");
                }
            }
            System.out.println();
        }
    }

    public Peliculas getPelicula() {
        return pelicula;
    }

    public void setPelicula(Peliculas pelicula) {
        this.pelicula = pelicula;
    }

    public int getvEntrada() {
        return vEntrada;
    }

    public void setvEntrada(int vEntrada) {
        this.vEntrada = vEntrada;
    }

    public Asiento[][] getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento[][] asiento) {
        this.asiento = asiento;
    }
    
}
