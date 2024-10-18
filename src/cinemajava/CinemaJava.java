package cinemajava;
import java.util.Scanner;

public class CinemaJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        int opcCompra;

        // Creación de la película
        Peliculas pelicula1 = new Peliculas("El saltamontes", 90, 15, "James");
        Cine cine1 = new Cine(pelicula1, 5500); 
        Espectador[] espectadores = new Espectador[5];
        
        // Inicialización de los espectadores
        espectadores[0] = new Espectador("James", 14, 5500.0);
        espectadores[1] = new Espectador("Luis", 16, 6000.0);
        espectadores[2] = new Espectador("Sara", 16, 6000.0);
        espectadores[3] = new Espectador("Tatiana", 23, 6000.0);
        espectadores[4] = new Espectador("Zury", 17, 8000.0);
        
        cine1.mensajeCine();
        
        // Menu
        System.out.println("""
                           ¿Qué deseas hacer?
                           1. Mostrar nombre de la película.
                           2. Mostrar los requisitos para ver la película.
                           3. Comprar asientos.
                           4. Salir del programa.
                           ¿Qué opción deseas?
                           """);
        
        opc = sc.nextInt();

        // Ciclo while
        while (opc != 4) {
            switch (opc) {
                case 1:
                    System.out.println("Nombre de la película: " + pelicula1.getTitulo());
                    System.out.println("¿Qué opción deseas ahora?");
                    opc = sc.nextInt();
                    break;

                case 2:
                    System.out.println("Requisitos:");
                    System.out.println("Valor de la entrada: " + cine1.getvEntrada());
                    System.out.println("Edad mínima: " + pelicula1.getEdadMin());
                    System.out.println("¿Qué opción deseas ahora?");
                    opc = sc.nextInt();
                    break;

                case 3:
                    for (Espectador espectador : espectadores) {
                        cine1.mostrarAsientos();
                        System.out.println("");
                        cine1.asignarAsiento(espectador);
                        System.out.println("¿Desea asignar otro asiento?");
                        System.out.println("1. Sí");
                        System.out.println("2. No");
                        opcCompra = sc.nextInt();
                        System.out.println("");
                        if (opcCompra != 1) {
                            System.exit(0);
                        }
                    }
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        }
        
        System.out.println("¡Vuelva pronto!");
        
    }
    
}
