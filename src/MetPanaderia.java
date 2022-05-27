import java.util.Scanner;

public class MetPanaderia {
    //TAMAÑO PANADERIA MOSTRAR********************************************
    public static void mostrar_tam (String data){
        System.out.println(" ");
        String [] tamaño ={
                "Porción (250 g) - Q8.00"
        };
        for (int i = 0; i<tamaño.length; i++){
            System.out.println("["+i+"]"+tamaño [i]);
        }
    }

    //********************CANTIDAD PRECIO Y PRINT TAMAÑO**********************
    public static void CanTam (String data){
    MetPanaderia.mostrar_tam("");

        //ingresa cantidad
        System.out.println(" ");
        Scanner NumProd = new Scanner(System.in);
        System.out.print("¿Cuántos Deseas comprar? : ");
        int cant_prod = NumProd.nextInt();

        //ingresa tamamño
        System.out.println(" ");
        Scanner Tamprod = new Scanner(System.in);
        System.out.print("¿De acuerdo con la porción? \n indica numero 0: ");
        int Tam_prod = Tamprod.nextInt();

        //Matriz de precios bebidas es Estandar
        int [] precios_tamaño  ={8};

        //PORCION  - multiplica la cantidad por el precio
        if (Tam_prod==0) {
            int total = cant_prod * precios_tamaño[0];
            System.out.print("Tienes un total de: Q");
            System.out.print(total + ".00 Quetzales \n");
            mensajes.agradecimiento();
            Main.FIN("");
        }
    }

/**************************** MENU PANADERIA *****************************/
    public static void OpPanaderia (String data){
        //matriz menu
        String [] OpPanaderia_M =
                {"Buñuelos \uD83C\uDF5E \n",
                 "Croissant de Jamón \uD83E\uDD50 \n",
                 "Pan de ajo y queso \uD83E\uDDC0\uD83E\uDDC4 \n",
                 "Pan de Banano y avena \uD83C\uDF4C \n",
                 "Pan de Coco \uD83E\uDD65 \n",
                 "Pan de maíz \uD83C\uDF3D \n",
                 "Bagels \uD83E\uDD6F \n"
                };
        //Recorrer matriz
        System.out.println("Numero según sección que elijas :) ");
        System.out.println(" ");
        for(int i = 0; i<OpPanaderia_M.length;i++) {
            System.out.print("[" + i + "]" + OpPanaderia_M[i]);
        }
    }

    //---------------------Buñuelos-----------------------------------
    public static void Buñuelos (String data){
        System.out.println( "Haz elgido Buñuelos \uD83C\uDF5E");
        MetPanaderia.CanTam("");
    }
    //----------------------Croissant de Jamon---------------------------
    public static void Cros_Jam (String data){
        System.out.println(" Haz elegido Croissant de Jamón \uD83E\uDD50");
        MetPanaderia.CanTam("");
    }
    //-------------------------Pan ajo Queso-------------------------------
    public static void Ajo_Q (String data){
        System.out.println(" Haz elegido Pan de ajo y queso \uD83E\uDDC0\uD83E\uDDC4 ");
        MetPanaderia.CanTam("");
    }
    //-------------------------Pan Banano avena------------------------------
    public static void Banano (String data){
        System.out.println(" Haz elegido Pan de Banano y avena \uD83C\uDF4C");
        MetPanaderia.CanTam("");
    }
    //-------------------------Pan de coco--------------------------------------
    public static void Pcoco (String data){
        System.out.println(" Haz elegido Pan de Coco \uD83E\uDD65");
        MetPanaderia.CanTam("");
    }
    //--------------------------Pan de Maíz--------------------------------------
    public static void Pmaiz (String data){
        System.out.println(" Haz elgido Pan de maíz \uD83C\uDF3D");
        MetPanaderia.CanTam("");
    }
    //--------------------------Bagels-----------------------------------
    public static void Bagels (String data){
        System.out.println(" Haz elegido Bagels \uD83E\uDD6F");
        MetPanaderia.CanTam("");
    }
}
