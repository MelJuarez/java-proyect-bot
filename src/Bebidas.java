import java.util.Scanner;

public class Bebidas {


    public static void Menu_Bebida() {
/****************************** BEBIDAS MENÚ ************************************/
        //BEBIDAS MENÚ

        /*Se muestra todo el menu de Bebidas*/

        MetBebidas.tempfc("");   //temperatura
        System.out.println(" ");
        MetBebidas.BopcionesP("");

        MetBebidas.BFC(" ");      //incio bebibas first frappes y cafe subtitulo
        System.out.println(" ");
        MetBebidas.Frap_Caf(""); //lista de frappes y cafes
        System.out.println(" ");

        MetBebidas.BCT("");  //Bebidas cafe frio y te subtitulo
        System.out.println(" ");
        MetBebidas.Caff_Te(" ");
        System.out.println(" ");

        MetBebidas.BTFC(""); //Bebidas Té frio y chocolate subtitulo
        System.out.println(" ");
        MetBebidas.Tef_Cho(" "); //muestra Opciones té frio y chocolate
        System.out.println(" ");


        //Ingresa dato de subtitulo que elija
        System.out.println(" ");
        Scanner option_B = new Scanner(System.in);
        System.out.print("Escribe la opción aquí: ");
        int opcion_b1 = option_B.nextInt();
        System.out.println(" ");

/**-------------------------- FRAPPES ------------------------------------------**/
        if (opcion_b1 == 0) {
            MetBebidas.Frappes(" ");
        }
/**-------------------------- CAFÉ CALIENTE ----------------------------*/
        if (opcion_b1 == 1){
            MetBebidas.CafeCaliente("");
        }
/**---------------------------CAFÉ FRIO--------------------------------*/
        if (opcion_b1==2){
            MetBebidas.CafeFrio(" ");
        }
/**----------------------------TÉ CALIENTE---------------------------*/
        if (opcion_b1==3){
            MetBebidas.TéCaliente("");
        }
/**-----------------------------TÉ FRIO--------------------------------*/
        if (opcion_b1==4){
            MetBebidas.TeFrio("");
        }
/**--------------------------- CHOCOLATE ----------------------------*--*/
        if (opcion_b1==5){
            MetBebidas.Chocolate("");
        }

        //  FIN BEBIDAS

    }
}
