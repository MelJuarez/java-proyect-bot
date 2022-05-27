import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            //INTRODUCCIÓN Y BIENVENIDA
            mensajes.bienvenida();

            //mostrar categorías
            mensajes.mostrarDatos("");

            //Ingresa dato para categoría
            System.out.println(" ");
            Scanner option_A = new Scanner(System.in);
            System.out.print("Escribe la opción aquí: ");
            int opcion_1a = option_A.nextInt();
            System.out.println(" ");


/************************* SECCION DE BEBIDAS********************************************/
            // Bebidas = opción 0
            //el cliente elige entre las 5 opciones principales
            //SI elige la ocpión 0  es la de bebidas

            if (opcion_1a == 0) { //selecciona entre las categorias principales la de bebidas
                System.out.println(" Téo\uD83C\uDF31,\uD83C\uDF43 : Te mostratré el menú de bebidas :) \n" +
                        "    Todo endulzado con azúcar morena \n" +
                        " ");
                Bebidas.Menu_Bebida(); //Se menú de bebidas
            }
/************************** SECCION ENTRADAS ******************************************/
            // Entradas = opcion 1
        if (opcion_1a==1){
            Entradas.Menu_Entradas();
        }

/************************** SECCION REPOSTERIA ******************************************/
           // Repostería = opcion 2
        if (opcion_1a==2){
            System.out.println(" Téo\uD83C\uDF31,\uD83C\uDF43 : Te mostratré el menú de Repostería :) \n" );
            Reposteria.Menu_Reposteria();
        }
/***************************** SECCION PANADERIA******************************************/
          //Panaderia = opcion 3
        if (opcion_1a==3){
            System.out.println(" Téo\uD83C\uDF31,\uD83C\uDF43 : Te mostratré el menú de Panadería :) \n" );
            Panaderia.Menu_Panaderia();
        }
/***************************** SECCION SÁNDWICHES******************************************/
        //Sandwiches = opcion 4
        if (opcion_1a==4){
            Sandwiches.Menu_Sandwiches();
        }







    }







    /**METODO PARA RETORNAR A MAIN Y FINALIZAR-----------------------------**/


    public static void FIN (String algo){
        System.out.println("\n \n ¿Quieres algo más?: ");

        String[] ocpiones = {"Seguir comprando", "Terminé mi orden"};

        for (int i = 0; i < ocpiones.length; i++) {
            System.out.println("[" + i + "] " + ocpiones[i]);
        }

        //QUE OPCION
        System.out.println(" ");
        Scanner Ped = new Scanner(System.in);
        System.out.print("Dilo aquí: ");
        int D_ped = Ped.nextInt();
        System.out.println(" ");

        if (D_ped == 0) {
        main(null);
        }
        if (D_ped == 1){
            System.out.println("\uD83C\uDF43 Téo \uD83C\uDF31: Muchas gracias por comprar conmigo :)");
        }


    }

    }



