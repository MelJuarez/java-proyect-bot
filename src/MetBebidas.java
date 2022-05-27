import java.security.PublicKey;
import java.util.Arrays;
import java.util.Scanner;

public class MetBebidas {

    /*****************************MOSTAR MENÚ BEBIDAS*****************************/

    //--------------------------FRIO Y CALIENTE-------------------------------------
    public static void tempfc (String data) {
        String [][] tempfc1 ={
                {"    FRIAS❄           "},
                {"    CALIENTES♨       "}
        };
        //Recorrer matriz
        for(int i = 0; i<tempfc1[0].length;i++){
            for (int j=0; j<tempfc1.length; j++){
                System.out.print(tempfc1[j][i]+" ");
            }
            System.out.println(" ");
        }

    }

    //------------------------------OPCIONES DE FRIAS Y CALIENTES-----------------------
    public static void BopcionesP (String data){
        String [][] BopcionesP1 ={
                {"Frappes \uD83E\uDD64        "},{"Café ☕ \n"},
                {"Té frio \uD83C\uDF75        "},{"Té  \uD83C\uDF75 \n"},
                {"Café_frio \uD83C\uDF75      "},{"Chocolate \uD83C\uDF6B \n"}

        };
        //Recorrer matriz
        System.out.println("Numero según sección que elijas :) ");
        System.out.println(" ");
        System.out.print(" ");
        for(int i = 0; i<BopcionesP1.length;i++){
            for (int j=0; j<BopcionesP1[0].length; j++){
                System.out.print("["+i+"]"+BopcionesP1[i][j]);

            }
            System.out.print(" ");
        }

    }

    /**------------------------------FRAPPES Y CAFES---------------------------------**/
    //------------------------------Matriz y menú----------------------------------
    public static void BFC (String data){

        String [][] BFC1 ={
            {"   Frappes \uD83E\uDD64      "},{"   Cafés ☕"},
        };

        //Recorrer matriz
        System.out.println(" ");
        for(int i = 0; i<BFC1[0].length;i++){
            for (int j=0; j<BFC1.length; j++){

                System.out.print(BFC1[j][i]+" ");
            }
            System.out.println(" ");
        }
    }

    public static void Frap_Caf (String data){

            String [][] Fraps_Cafs_M = {
            {"Chocolate       "," Affogato"},
            {"Café            "," Americano"},
            {"Frutos de Bosque"," Latte"},
            {"Mango           "," Capuccino"},
            {"Oreo            "," Espresso"},
            {"Piña            "," Hawaino"},
            };

         //Recorrer matriz
        for (int i = 0; i <Fraps_Cafs_M.length; i++) {
            for (int j = 0; j <Fraps_Cafs_M[0].length; j++) {
                System.out.print ("["+i+"]"+Fraps_Cafs_M[i][j]+" ");

            }
            System.out.println( );
        }

    }
    //------------------------------CAFES FRIOS Y TE----------------------------------

    public static void BCT (String data){

        String [][] BCT1 ={
                {"   Café Frio ☕        "},{"Té \uD83C\uDF75"},
        };
        //Recorrer matriz
        for(int i = 0; i<BCT1[0].length;i++){
            for (int j=0; j<BCT1.length; j++){
                System.out.print(BCT1[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void Caff_Te (String data){

        String [][] Caff_Te_M = {
                {"Cinnamon        "," Chai "},
                {"Caribeño        "," Floral"},
                {"Frapuccino      "," Lavanda"},
                {"Hawaiano        "," Limon"},
                {"Latte           "," Matcha"},
                {"Moka Helado     "," Hawaino"},
                {"Clásico         "," Verde"}
        };

        //Recorrer matriz
        for (int i = 0; i <Caff_Te_M.length; i++) {
            for (int j = 0; j <Caff_Te_M[0].length; j++) {
                System.out.print ("["+i+"]"+Caff_Te_M[i][j]+" ");

            }
            System.out.println( );
        }

    }

    //-----------------------------TE FRIO Y CHOCOLATE--------------------------
    public static void BTFC (String data){

        String [][] BTFC1 ={
                {"   Té Frio ❄     "},{"   Chocolate \uD83C\uDF6B    "}
        };

        //Recorrer matriz
        for(int i = 0; i<BTFC1[0].length;i++){
            for (int j=0; j<BTFC1.length; j++){
                System.out.print(BTFC1[j][i]+" ");
            }
            System.out.println(" ");
        }
    }

    public static void Tef_Cho (String data){

        String [][] Tef_Cho_M ={
                {"Chai            ","Chocolate Clásico"},
                {"Floral          ","Chocolate blanco y canela"},
                {"Lavanda         ","Chocolate con malvaviscos"},
                {"Limón           ","Chocolate con especias"},
                {"Matcha          ","Chocolate con leche"},
                {"Menta           ","Chocolate amargo"},
                {"Verde           ","Chocolate pepermint"}
        };
        //Recorrer matriz
        for (int i = 0; i <Tef_Cho_M.length; i++) {
            for (int j = 0; j <Tef_Cho_M[0].length; j++) {
                System.out.print ("["+i+"]"+Tef_Cho_M[i][j]+" ");

            }
            System.out.println( );
        }
    }

    //****************************FIN MATRICES***************************************



    //---------------------------FRAPPES--------------------------------------
    public static void Frappes (String data){
        System.out.print(" Haz elegido Frappes \uD83E\uDD64");

        System.out.println(" ");
        Scanner SaborFrap = new Scanner(System.in);
        System.out.print(" Elige un sabor: ");
        int Opsab1 = SaborFrap.nextInt();
        System.out.println(" ");

        /**Frappe Chocolate***/
        if (Opsab1 == 0){
            System.out.println("Haz elegido Frappe de Chocolate");
            MetBebidas.CantTam("");

        }
        /**Frappe Cafe****/
        if (Opsab1 == 1){
            System.out.println("Haz elegido Frappe de Café");
            MetBebidas.CantTam(" ");
        }
        /**Frappe Frutos de Bosque*/
        if (Opsab1 == 2){
            System.out.println("Haz elegido Frappe de Frutos del Bosque");
            MetBebidas.CantTam(" ");
        }
        /**Frappe Mango*/
        if (Opsab1 ==3){
            System.out.println("Haz elegido Frappe de Mango");
            MetBebidas.CantTam(" ");
        }
        /**Frappe Oreo */
        if (Opsab1 ==4){
            System.out.println("Haz elegido Frappe de Oreo");
            MetBebidas.CantTam(" ");
        }
        /**Frappe Piña */
        if (Opsab1 ==5){
            System.out.println("Haz elegido Frappe de Piña");
            MetBebidas.CantTam("");
        }

    }


    //-----------------------------CAFE CALIENTE-----------------------------
    public static void CafeCaliente (String data){
        System.out.print(" Haz elegido Cafés ♨");

        System.out.println(" ");
        Scanner SaborFrap = new Scanner(System.in);
        System.out.print(" Elige el tipo: ");
        int Opsab1 = SaborFrap.nextInt();
        System.out.println(" ");

        /**Affogato*/
        if (Opsab1 ==0){
            System.out.println("Haz elegido Café Affogato");
            MetBebidas.CantTam("");
        }
        /**Americano*/
        if (Opsab1==1){
            System.out.println("Haz elegido Café Americano");
            MetBebidas.CantTam("");
        }
        /**Latte*/
        if (Opsab1==2){
            System.out.println("Haz elegido Café Latte");
            MetBebidas.CantTam("");
        }
        /**Capuccino*/
        if (Opsab1==3){
            System.out.println("Haz elegido Café Capuccino");
            MetBebidas.CantTam("");
        }
        /**Espresso*/
        if (Opsab1==4){
            System.out.println("Haz elegido Café Espresso");
            MetBebidas.CantTam("");
        }
        /**Hawaiano*/
        if (Opsab1==5){
            System.out.println("Haz elegido Café Hawaiano");
            MetBebidas.CantTam("");
        }
    }
//----------------------------CAFE FRIO-----------------------------------
    public static void CafeFrio (String data){
        System.out.print(" Haz elegido Cafés Frio ❄");

        System.out.println(" ");
        Scanner Sabor_tipo = new Scanner(System.in);
        System.out.print(" Elige el tipo: ");
        int Opsab1 = Sabor_tipo.nextInt();
        System.out.println(" ");

        /**Cinnamon*/
        if (Opsab1==0){
            System.out.println("Haz elegido Café Cinnamon");
            MetBebidas.CantTam("");
        }
        /**Caribeño*/
        if (Opsab1==1){
            System.out.println("Haz elegido Café Caribeño");
            MetBebidas.CantTam("");
        }
        /**Frapuccino*/
        if (Opsab1==2){
            System.out.println("Haz elegido Frapuccino");
            MetBebidas.CantTam("");
        }
        /**Hawaiano*/
        if (Opsab1==3){
            System.out.println("Haz elegido Café Hawaiano");
            MetBebidas.CantTam("");
        }
        /**Latte*/
        if (Opsab1==4){
            System.out.println("Haz elegido Café Latte");
            MetBebidas.CantTam("");
        }
        /**Moka Helado*/
        if (Opsab1==5){
            System.out.println("Haz elegido Café Moka Helado");
            MetBebidas.CantTam("");
        }
        /**Clásico*/
        if (Opsab1==6){
            System.out.println("Haz elegido Café Clásico");
            MetBebidas.CantTam("");
        }
    }
/*-------------------------TÉ -------------------------------------------------*/
    public static void TéCaliente (String data){
        System.out.print(" Haz elegido Té Caliente ♨");

        System.out.println(" ");
        Scanner Sabor_tipo = new Scanner(System.in);
        System.out.print(" Elige el tipo: ");
        int Opsab1 = Sabor_tipo.nextInt();
        System.out.println(" ");

        /**Chai*/
        if (Opsab1==0){
            System.out.println("Haz elegido Té Chai");
            MetBebidas.CantTam("");
        }
        /**Floral*/
        if (Opsab1==1){
            System.out.println("Haz elegido Té Floral");
            MetBebidas.CantTam("");
        }
        /**Lavanda*/
        if (Opsab1==2){
            System.out.println("Haz elegido Té Lavanda");
            MetBebidas.CantTam("");
        }
        /**Limon*/
        if (Opsab1==3){
            System.out.println("Haz elegido Té Limóm");
            MetBebidas.CantTam("");
        }
        /**Matcha*/
        if (Opsab1==4){
            System.out.println("Haz elegido Té Matcha");
            MetBebidas.CantTam("");
        }
        /**Mentq*/
        if (Opsab1==5){
            System.out.println("Haz elegido Té de Menta");
            MetBebidas.CantTam("");
        }
        /**Verde*/
        if (Opsab1==6){
            System.out.println("Haz elegido Té Verde");
            MetBebidas.CantTam("");
        }
    }

//-----------------------------TE FRIO----------------------------------------------/
        public static void TeFrio (String data){

            System.out.print(" Haz elegido Té Frio ❄");

            System.out.println(" ");
            Scanner Sabor_tipo = new Scanner(System.in);
            System.out.print(" Elige el tipo: ");
            int Opsab1 = Sabor_tipo.nextInt();
            System.out.println(" ");

            /**Chai*/
            if (Opsab1==0){
                System.out.println("Haz elegido Té Chai");
                MetBebidas.CantTam("");
            }
            /**Floral*/
            if (Opsab1==1){
                System.out.println("Haz elegido Té Floral");
                MetBebidas.CantTam("");
            }
            /**Lavanda*/
            if (Opsab1==2){
                System.out.println("Haz elegido Té Lavanda");
                MetBebidas.CantTam("");
            }
            /**Limon*/
            if (Opsab1==3){
                System.out.println("Haz elegido Té Limóm");
                MetBebidas.CantTam("");
            }
            /**Matcha*/
            if (Opsab1==4){
                System.out.println("Haz elegido Té Matcha");
                MetBebidas.CantTam("");
            }
            /**Mentq*/
            if (Opsab1==5){
                System.out.println("Haz elegido Té de Menta");
                MetBebidas.CantTam("");
            }
            /**Verde*/
            if (Opsab1==6){
                System.out.println("Haz elegido Té Verde");
                MetBebidas.CantTam("");
            }
        }
//------------------------------CHOCOLATE-------------------------------------
    public static void Chocolate (String data){
        System.out.println(" Haz elegido Chocolate");
        System.out.println("Se utiliza Chocolate semiamargo");

        System.out.println(" ");
        Scanner Sabor_tipo = new Scanner(System.in);
        System.out.print(" Elige el tipo: ");
        int Opsab1 = Sabor_tipo.nextInt();
        System.out.println(" ");

        /**Clásico*/
        if (Opsab1==0){
            System.out.println("Haz elegido Chocolate Clásico");
            MetBebidas.CantTam("");
        }
        /**Blanco y Canela*/
        if (Opsab1==1){
            System.out.println("Haz elegido Chocolate Blanco y Canela");
            MetBebidas.CantTam("");
        }
        /**Con Malvaviscos*/
        if (Opsab1==2){
            System.out.println("Haz elegido Chocolate con Malvaviscos");
            MetBebidas.CantTam("");
        }
        /**Con Especias*/
        if (Opsab1==3){
            System.out.println("Haz elegido Chocolate con Especias");
            MetBebidas.CantTam("");
        }
        /**Con Leche*/
        if (Opsab1==4){
            System.out.println("Haz elegido Chocolate con Leche");
            MetBebidas.CantTam("");
        }
        /**Amargo*/
        if (Opsab1==5){
            System.out.println("Haz elegido Chocolate Amargo");
            MetBebidas.CantTam("");
        }
        /**Peppermint*/
        if (Opsab1==6){
            System.out.println("Haz elegido Chocolate Peppermint");
            MetBebidas.CantTam("");
        }



    }


    //***********************CANTIDAD DE COMPRA y TAMAÑO*****************************
    //Tamaño se llamó como método
    // mostrar_tam es el  nombre que contiene los tamaños

    public static void  CantTam (String data){
        MetBebidas.mostrar_tam("");

        //ingresa cantidad
        System.out.println(" ");
        Scanner NumProd = new Scanner(System.in);
        System.out.print("¿Cuántos Deseas comprar? : ");
        int cant_prod = NumProd.nextInt();

        //ingresa tamamño
        System.out.println(" ");
        Scanner Tamprod = new Scanner(System.in);
        System.out.print("¿De tamaño(s)? : ");
        int Tam_prod = Tamprod.nextInt();


        //Matriz de precios bebidas es Estandar
        int [] precios_tamaño  ={20,15,10};

        //Tamaño Grande  - multiplica la cantidad por el precio
        if (Tam_prod==0){
            int total = cant_prod * precios_tamaño [0];
            System.out.print("Tienes un total de: Q");
            System.out.print(total+".00 Quetzales \n");
            mensajes.agradecimiento();
            Main.FIN("");

        }
        //Tamaño Mediano  - multiplica la cantidad por el precio
        if (Tam_prod==1){
            int total = cant_prod * precios_tamaño [1];
            System.out.print("Tienes un total de: Q");
            System.out.print(total+".00 Quetzales \n");
            mensajes.agradecimiento();
            Main.FIN(" ");
        }

        //Tamaño Pequeño - multiplica la cantidad por el precio
        if (Tam_prod==2){
            int total = cant_prod * precios_tamaño[2];
            System.out.print("Tienes un total de: ");
            System.out.print("Q"+total+".00 Quetzales \n ");
            mensajes.agradecimiento();
            Main.FIN(" ");
        }



    }
    //TAMAÑO BEBIDA Mostrar****************************************************

    public static void mostrar_tam (String data){
        System.out.println(" ");
        String [] tamaño  = {      //NO PRINT
                "Grande (360ml)   - Q20.00",
                "Mediano (240ml)  - Q15.00",
                "Pequeño (180 ml) - Q10.00"
        };

        for (int i = 0; i<3; i++){
            System.out.println("["+i+"] "+tamaño [i]);
        }

    }




}
