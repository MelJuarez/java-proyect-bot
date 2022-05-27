import java.util.Scanner;

public class Entradas {

    public static void Menu_Entradas(){
/******************************MENU ENTRADAS****************************************/

       //Se muestra todo el Menu Entradas

        System.out.println("Téo\uD83C\uDF31,\uD83C\uDF43 : Te mostratré el menú de Entradas :) ");

        //mostrar menu entradas
        MetEntradas.OpEntradas("");

        //Solicita cual entrada elige el cliente
        System.out.println(" ");
        Scanner option_E = new Scanner(System.in);
        System.out.print("Escribe la opción aquí: ");
        int opcion_E1 = option_E.nextInt();
        System.out.println(" ");

    /**--------------------BOLITAS QUESO----------------------------------*/
        if (opcion_E1==0){
            MetEntradas.bolitas_queso("");
        }
    /**--------------------CHIPS PAPA----------------------------------*/
        if (opcion_E1==1){
            MetEntradas.Chips_papa(" ");
        }
    /**---------------------GAZPACHO----------------------------------*/
        if (opcion_E1==2){
            MetEntradas.Gazpacho(" ");
        }
    /**--------------------GRISINES----------------------------------*/
        if (opcion_E1==3){
            MetEntradas.Grsines("");
        }
    /**--------------------HOJALDRE----------------------------------*/
        if (opcion_E1==4){
            MetEntradas.Hojaldre(" ");
        }
    //FIN ENTRADAS


    }
}
