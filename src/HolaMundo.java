import java.util.Scanner;
public class HolaMundo {
String valoradar;
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        String valoraux;
        Scanner valorEntrada = new Scanner(System.in);
        valoraux = valorEntrada.nextLine();
        visordemensaje(valoraux);
    }

    private static void visordemensaje(String valor) {
        System.out.println("Ingrese un valor");
    }

    public void mostrarnumero(){

    }

    public void mostrarpalabra(){

    }
    public void mensajeNuevo(){
        System.out.println("Esto va en el branch de prueba");
    }
}