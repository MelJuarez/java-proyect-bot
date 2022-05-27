import java.util.Scanner;

public class Reposteria {

    public static void Menu_Reposteria (){

/****************************** REPOSTERIA MENÚ ************************************/

        /*Se muestra todo el menu de Entradas*/
        MetReposteria.RepOpciones(""); //opciones en reposteria

        MetReposteria.EBC(""); //subtitulo brownies y cupcakes
        MetReposteria.Brow_Cup(""); //listado Brownies y cupcakes

        MetReposteria.EDP(""); //subtitulo donas y pasteles
        MetReposteria.Don_Pas("");// su listado

        MetReposteria.PIES("");
        MetReposteria.piesOp("");

        //Ingresa dato de subtitulo que elija
        System.out.println(" ");
        Scanner option_R = new Scanner(System.in);
        System.out.print("Escribe la opción aquí: ");
        int opcion_r1 = option_R.nextInt();
        System.out.println(" ");

/**-------------------------- BROWNIES ------------------------------------------**/
        if (opcion_r1==0){
            MetReposteria.Brownies("");
        }
/**-------------------------- CUPCAKES ------------------------------------------**/
        if (opcion_r1==1){
            MetReposteria.Cupcakes("");
        }
/**-------------------------- DONAS ------------------------------------------**/
        if (opcion_r1==2){
            MetReposteria.Donas("");
        }
/**-------------------------- PASTELES ------------------------------------------**/
        if (opcion_r1==3){
            MetReposteria.Pasteles("");
        }
/**-------------------------- PIES ------------------------------------------**/
        if (opcion_r1==4){
            MetReposteria.Todos_pies("");
        }



    }
}
