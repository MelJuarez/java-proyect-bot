import java.util.Scanner;

public class Sandwiches {

    public static void Menu_Sandwiches(){
/*************************MENU SANDWICHES**************************/

        //Se muestra todo el menu de Sandiwiches

        System.out.println("Téo\uD83C\uDF31,\uD83C\uDF43 : Te mostratré el menú de Sándwiches :) ");

        //mostrar menu Sándwiches
        MetSandwiches.OpSandwiches("");

        //Solicita cual entrada elige el cliente
        System.out.println(" ");
        Scanner option_E = new Scanner(System.in);
        System.out.print("Escribe la opción aquí: ");
        int opcion_E1 = option_E.nextInt();
        System.out.println(" ");

        /**-----------------------CHIPOTLE---------------------------*/
        if (opcion_E1==0){
            MetSandwiches.Chipotle("");
        }
        /**-----------------------CUBANO---------------------------*/
        if (opcion_E1==1){
            MetSandwiches.Cubano("");
        }
        /**-----------------------CUERNOS---------------------------*/
        if (opcion_E1==2){
            MetSandwiches.Cuernos("");
        }
        /**-----------------------POLLO Y AGUCATE---------------------------*/
        if (opcion_E1==3){
            MetSandwiches.Poll_Avo("");
        }
        /**-----------------------QUESOS---------------------------*/
        if (opcion_E1==4){
            MetSandwiches.Quesos("");
        }
        /**-----------------------RES---------------------------*/
        if (opcion_E1==5){
            MetSandwiches.Res("");
        }
        /**-----------------------TOCINO QUESO---------------------------*/
        if (opcion_E1==6){
            MetSandwiches.To_Queso("");
        }

    }
}
