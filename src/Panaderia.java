import java.util.Scanner;

public class Panaderia {

    public static void Menu_Panaderia(){
/****************************** MENU PANADERIA *******************************/

        //Se muestra todo el Menu de Panaderia

        //mostrar menu Panaderia
        MetPanaderia.OpPanaderia("");

        //Solicita cual entrada elige el cliente
        System.out.println(" ");
        Scanner option_P = new Scanner(System.in);
        System.out.print("Escribe la opción aquí: ");
        int opcion_P1 = option_P.nextInt();
        System.out.println(" ");

        /**--------------------------BUÑUELOS--------------------------*/
        if (opcion_P1==0){
            MetPanaderia.Buñuelos("");
        }
        /**--------------------------CROISSANT JAMON--------------------------*/
        if (opcion_P1==1){
            MetPanaderia.Cros_Jam("");
        }
        /**------------------------PAN AJO QUESO--------------------------*/
        if (opcion_P1==2){
            MetPanaderia.Ajo_Q("");
        }
        /**------------------------PAN BANANO AVENA--------------------------*/
        if (opcion_P1==3){
            MetPanaderia.Banano("");
        }
        /**--------------------------PAN COCO--------------------------*/
        if (opcion_P1==4){
            MetPanaderia.Pcoco("");
        }

        /**--------------------------PAN MAIZ--------------------------*/
        if (opcion_P1==5){
            MetPanaderia.Pmaiz("");
        }
        /**--------------------------BAGELS--------------------------*/
        if (opcion_P1==6){
            MetPanaderia.Bagels("");
        }

    }

}
