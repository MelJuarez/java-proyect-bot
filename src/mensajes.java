import java.util.Scanner;

public class mensajes {

    public static String categorias [] ={
            "Bebidas",
            "Entradas",
            "Repostería",
            "Panadería",
            "Sandwiches"
    };

    public static void mostrarDatos (String data){

        for (int i = 0; i<5; i++){
            System.out.println("["+i+"] "+mensajes.categorias [i]);
        }
    }

    public static void bienvenida(){
        System.out.println("HOLA! soy  \uD83C\uDF43 Téo \uD83C\uDF31, el asistente virtual del Café, te guiaré en tu orden el día de Hoy  \n" +
                "¿Qué te gustaría pedir?\n" +
                "Marca el número correspondiente \n"+
                "");
    }
    public static void agradecimiento(){
        System.out.println("\n \uD83C\uDF43 Téo \uD83C\uDF31 : MUCHAS GRACIAS POR TU COMPRA, espero haberte ayudado :)");
    }

}
