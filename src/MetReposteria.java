import java.util.Scanner;

public class MetReposteria {

    //*************************CANTIDAD COMPRA Y TAMAÑO****************
    //Tamaño se llamó como método
    // mostrar_tam es el  nombre que contiene los tamaños

    public static void CantTam(String data) {
        MetReposteria.mostar_tam("");

                //ingresa cantidad
        System.out.println(" ");
        Scanner NumProd = new Scanner(System.in);
        System.out.print("¿Cuántos Deseas comprar? : ");
        int cant_prod = NumProd.nextInt();

        //ingresa tamamño
        System.out.println(" ");
        Scanner Tamprod = new Scanner(System.in);
        System.out.print("¿De acuerdo con la porción? \n indica el numero 0 : ");
        int Tam_prod = Tamprod.nextInt();

        //Matriz de precios Reposteria
        int[] precios_tamaño = {7};

        //Tamaño Unico  - multiplica la cantidad por el precio
        if (Tam_prod == 0) {
            int total = cant_prod * precios_tamaño[0];
            System.out.print("Tienes un total de: Q");
            System.out.print(total + ".00 Quetzales \n");
            mensajes.agradecimiento();
            Main.FIN("");

        }
    }

    //*************************MOSTAR TAMAÑO y precio***************************
    public static void mostar_tam (String data){
        String [] tamaño  = {      //NO PRINT
                "Unidad (Según lo que ordenste) - Q7.00",
        };
        for (int i = 0; i<tamaño.length; i++){
            System.out.println("["+i+"] "+tamaño [i]);
        }
    }
    //-----------------------------OPCIONES REPOSTERIA-------------------------------
    public static void RepOpciones (String data){
        String [][] RepOpciones1 ={
                {"Brownies \uD83E\uDDC1"},{"Cupcakes rellenos \uD83E\uDDC1 \n"},
                {"Donas \uD83C\uDF69   "},{" Pastel \uD83C\uDF70 \n"},
                {"Pies \uD83E\uDD6E \n "}
        };

        //Recorrido de matriz
        System.out.println("Numero según sección que elijas :) ");
        System.out.println(" ");
        System.out.print(" ");
        for(int i = 0; i<RepOpciones1.length;i++){
            for (int j=0; j<RepOpciones1[0].length; j++){
                System.out.print("["+i+"]"+RepOpciones1[i][j]);
            }
            System.out.print(" ");
        }
    }

/**-------------------------------BROWNIES Y CUPCAKES---------------------------*/
                               //Matriz y menu
    public static void EBC (String data) {
        String[][] EBC1 = {
                {"   Brownies \uD83E\uDDC1"}, {"             Cupcakes rellenos \uD83E\uDDC1"},
        };

        //Recorrido de matriz
        System.out.println(" ");
        for (int i = 0; i < EBC1[0].length; i++) {
            for (int j = 0; j < EBC1.length; j++) {

                System.out.print(EBC1[j][i] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void Brow_Cup (String data){

        String [][] Brow_Cup_M ={
           {"Mazana y Limón       ","Chocolate"},
           {"Mandarina y Almendra ","Vainilla"},
           {"Banano               ","Queso"},
           {"Calabaza             ","Red Velvet"},
           {"Chocolate            ","Cookie"},
           {"Chocolate y nueces   ","Café"}
        };
        //Recorrer matriz
        for (int i = 0; i <Brow_Cup_M.length; i++) {
            for (int j = 0; j <Brow_Cup_M[0].length; j++) {
                System.out.print ("["+i+"]"+Brow_Cup_M[i][j]+" ");
            }
            System.out.println( );
        }
    }

/**---------------------------------DONAS Y PASTEL----------------------*/
    public static void EDP (String data){
        String [][] EDP1 ={
                {"   Donas \uD83C\uDF69 "},{"             Pastel \uD83C\uDF70"},
        };
        //Recorrer matriz
        System.out.println(" ");
        for(int i = 0; i<EDP1[0].length;i++){
            for (int j=0; j<EDP1.length; j++){

                System.out.print(EDP1[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void Don_Pas (String data){
        String [][] Don_Pas_M ={
                {"Rellenas de Manjar ","Fresas con Crema"},
                {"Chocolate          ","Red Velvet"},
                {"Chocolate Blanco   ","Tres Leches"},
                {"Glaseadas          ","Vainilla"},
                {"Azúcar glass       ","Chocolate"},
        };
        //Recorrer matriz
        for (int i = 0; i <Don_Pas_M.length; i++) {
            for (int j = 0; j <Don_Pas_M[0].length; j++) {
                System.out.print ("["+i+"]"+Don_Pas_M[i][j]+" ");

            }
            System.out.println( );
        }
    }
/**------------------------------PIES------------------------------------*/
    public static void PIES (String data){
        String [] PIES1= {"   Pies \uD83E\uDD6E"};

        //Recorrer matriz
        System.out.println(" ");
        for (int i= 0; i<PIES1.length;i++){
            System.out.println(PIES1[i]+" ");
        }
    }
    public static void piesOp (String data){
        String [] piesOp_M ={
                "Fresa \n",
                "Limón \n",
                "Mango \n",
                "Mazana \n",
                "Maracuyá \n",
                "Queso \n",
                "Queso y Frambuesa\n",
        };
        //Recorrer matriz
        for (int i = 0; i <piesOp_M.length; i++) {
                System.out.print ("["+i+"]"+piesOp_M[i]+" ");
        }
        System.out.println( );
    }

//***************************FIN MATRICES***********************************/

    //-------------------------BROWNIES------------------------------
    public static void Brownies (String data){
        System.out.print(" Haz elegido Brownies \uD83E\uDDC1");

        System.out.println(" ");
        Scanner Sabor_tipo = new Scanner(System.in);
        System.out.print(" Elige el tipo: ");
        int Opsab1 = Sabor_tipo.nextInt();
        System.out.println(" ");

        /**Manzana limón*/
        if (Opsab1 ==0){
            System.out.println("Haz elegido Brownies deManzana Limón");
            MetReposteria.CantTam("");
        }
        /**Mandarina almond*/
        if (Opsab1==1){
            System.out.println("Haz elegido Brownies de Mandarina Almendra");
            MetReposteria.CantTam("");
        }
        /**Banano*/
        if (Opsab1==2){
            System.out.println("Haz elegido Brownies de Banano");
            MetReposteria.CantTam("");
        }
        /**Calabaza*/
        if (Opsab1==3){
            System.out.println("Haz elegido Brownies de Calabaza");
            MetReposteria.CantTam("");
        }
        /**Chocolate*/
        if (Opsab1==4){
            System.out.println("Haz elegido Brownies de Chocolate");
            MetReposteria.CantTam("");
        }
        /**Choc nueces*/
        if (Opsab1==5){
            System.out.println("Haz elegido Brownies de Chocolate y nueces");
            MetReposteria.CantTam("");
        }
    }
    //-------------------------CUPCAKES------------------------------
    public static void Cupcakes (String data){
        System.out.print(" Haz elegido  Cupcakes rellenos \uD83E\uDDC1");

        System.out.println(" ");
        Scanner Sabor_tipo = new Scanner(System.in);
        System.out.print(" Elige el tipo: ");
        int Opsab1 = Sabor_tipo.nextInt();
        System.out.println(" ");

        /**Chocolate*/
        if (Opsab1==0){
            System.out.println("Haz elegido Cupcakes de Chocolate");
            MetReposteria.CantTam("");
        }
        /**Vainilla*/
        if (Opsab1==1){
            System.out.println("Haz elegido Cupcakes de Vainilla");
            MetReposteria.CantTam("");
        }
        /**Queso*/
        if (Opsab1==2){
            System.out.println("Haz elegido Cupcakes de Queso");
            MetReposteria.CantTam("");
        }
        /**Red Velvet*/
        if (Opsab1==3){
            System.out.println("Haz elegido Cupcakes de Red Velvet");
            MetReposteria.CantTam("");
        }
        /**cookie*/
        if (Opsab1==4){
            System.out.println("Haz elegido Cupcakes Cookie");
            MetReposteria.CantTam("");
        }
        /**CAfé*/
        if (Opsab1==5){
            System.out.println("Haz elegido Cupcakes de Café");
            MetReposteria.CantTam("");
        }
    }

//----------------------------DONAS-------------------------------------
    public static void Donas (String data){
        System.out.print(" Haz elegido  Donas \uD83C\uDF69");

        System.out.println(" ");
        Scanner Sabor_tipo = new Scanner(System.in);
        System.out.print(" Elige el tipo: ");
        int Opsab1 = Sabor_tipo.nextInt();
        System.out.println(" ");

        /**Manjar*/
        if (Opsab1==0){
            System.out.println("Haz elegido Dona Rellena de Manjar");
            MetReposteria.CantTam("");
        }
        /**Chocolate*/
        if (Opsab1==1){
            System.out.println("Haz elegido Dona Rellena de Chocolate");
            MetReposteria.CantTam("");
        }
        /**Chocolate blanco*/
        if (Opsab1==2){
            System.out.println("Haz elegido Dona de Chocolate Blanco");
            MetReposteria.CantTam("");
        }
        /**Glaseada*/
        if (Opsab1==3){
            System.out.println("Haz elegido Dona Glaseada");
            MetReposteria.CantTam("");
        }
        /**Azúcar*/
        if (Opsab1==4){
            System.out.println("Haz elegido Dona cubierta con Azúcar Glass ");
            MetReposteria.CantTam("");
        }

    }
//----------------------------PASTELES-------------------------------------
    public static void Pasteles (String data){
        System.out.print(" Haz elegido Pasteles \uD83C\uDF70");

        System.out.println(" ");
        Scanner Sabor_tipo = new Scanner(System.in);
        System.out.print(" Elige el tipo: ");
        int Opsab1 = Sabor_tipo.nextInt();
        System.out.println(" ");

        /**Fresa Crema*/
        if (Opsab1==0){
            System.out.println("Haz elegido Pastel de Fresas con Crema");
            MetReposteria.CantTam("");
        }
        /**Red Velvet*/
        if (Opsab1==1){
            System.out.println("Haz elegido Pastel de Red Velvet");
            MetReposteria.CantTam("");
        }
        /**3 leches*/
        if (Opsab1==2){
            System.out.println("Haz elegido Pastel de Tres Leches");
            MetReposteria.CantTam("");
        }
        /**Vainilla*/
        if (Opsab1==3){
            System.out.println("Haz elegido Pastel de Vainilla");
            MetReposteria.CantTam("");
        }
        /**Chocolate*/
        if (Opsab1==4){
            System.out.println("Haz elegido Pastel de Chocolate");
            MetReposteria.CantTam("");
        }
    }
    //----------------------------PIES-------------------------------------
    public static void Todos_pies (String data){
        System.out.print(" Haz elegido Pies \uD83E\uDD6E");

        System.out.println(" ");
        Scanner Sabor_tipo = new Scanner(System.in);
        System.out.print(" Elige el tipo: ");
        int Opsab1 = Sabor_tipo.nextInt();
        System.out.println(" ");

        /**Fresa*/
        if (Opsab1==0){
            System.out.println("Haz elegido Pie de Fresa");
            MetReposteria.CantTam("");
        }
        /**Limon*/
        if (Opsab1==1){
            System.out.println("Haz elegido Pie de Limóm");
            MetReposteria.CantTam("");
        }
        /**Mango*/
        if (Opsab1==2){
            System.out.println("Haz elegido Pie de Mango");
            MetReposteria.CantTam("");
        }
        /**Manzana*/
        if (Opsab1==3){
            System.out.println("Haz elegido Pie de Manzana");
            MetReposteria.CantTam("");
        }
        /**Maracuyá*/
        if (Opsab1==4){
            System.out.println("Haz elegido Pie de Maracuyá");
            MetReposteria.CantTam("");
        }
        /**Queso*/
        if (Opsab1==5){
            System.out.println("Haz elegido Pie de Queso");
            MetReposteria.CantTam("");
        }
        /**Queso Fram*/
        if (Opsab1==6){
            System.out.println("Haz elegido Pie de Queso y Frambuesas");
            MetReposteria.CantTam("");
        }
    }




}
