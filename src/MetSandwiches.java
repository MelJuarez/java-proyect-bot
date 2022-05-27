import java.util.Scanner;

public class MetSandwiches {

    //TAMAÑO SANDWICHES MOSTAR*******************************************
    public static void mostrar_tam(String data) {
        System.out.println(" ");
        String[] tamaño = {
                "Porción Completa (500 g) - Q25.00",
                "Media Porción    (250g ) - Q12.00 "
        };
        for (int i = 0; i < tamaño.length; i++) {
            System.out.println("[" + i + "] " + tamaño[i]);
        }
    }

    //*************************CANTIDAD PRECIO Y TMAMAÑO************************
    public static void CanTam(String data) {
        MetSandwiches.mostrar_tam("");

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
        int[] precios_tamaño = {25, 12};

        //Porción Completa  - multiplica la cantidad por el precio
        if (Tam_prod == 0) {
            int total = cant_prod * precios_tamaño[0];
            System.out.print("Tienes un total de: Q");
            System.out.print(total + ".00 Quetzales \n");
            mensajes.agradecimiento();
            Main.FIN("");
        }

        //Tamaño Mediano  - multiplica la cantidad por el precio
         if (Tam_prod == 1) {
            int total = cant_prod * precios_tamaño[1];
            System.out.print("Tienes un total de : Q");
            System.out.print(total + ".00 Quetzales \n");
            mensajes.agradecimiento();
            Main.FIN(" ");
            }
    }

/******************************* MENU SANDWICHES *********************/
    public static void OpSandwiches (String data){

        String [] OpSandw_M =
                {"Chipotle \uD83C\uDF36 \n",
                 "Cubano \uD83C\uDF56 \n",
                 "Cuernos\uD83E\uDD50 \n",
                 "Pollo y Aguacate \uD83E\uDD51 \n",
                 "Quesos \uD83E\uDDC0 \n",
                 "Res\uD83E\uDD69 \n",
                 "Tocino de pavo y queso \uD83E\uDD53 \n"
        };
        //Recorrer matriz
        System.out.println("Numero según sección que elijas :) ");
        System.out.println(" ");
        for(int i = 0; i<OpSandw_M.length;i++){
            System.out.print("["+i+"]"+OpSandw_M[i]);
    }

    }

    //-------------------- Chipotle---------------------------
    public static void Chipotle (String data){
        System.out.println(" Haz elegido Sándwich de Chipotle \uD83C\uDF36");
        MetSandwiches.CanTam("");
    }
    //-------------------- Cubano---------------------------
    public static void Cubano (String data){
        System.out.println(" Haz elegido Sándwich Cubano \uD83C\uDF56");
        MetSandwiches.CanTam("");
    }
    //-------------------- Cuernos---------------------------
    public static void Cuernos (String data){
        System.out.println(" Haz elegido Sándwich tipo Cuernos \uD83E\uDD50");
        MetSandwiches.CanTam("");
    }
    //-------------------- Pollo y aguacate (Avocado)---------------------------
    public static void Poll_Avo (String data){
        System.out.println(" Haz elegido Sándwich de Pollo y Aguacate \uD83E\uDD51");
        MetSandwiches.CanTam("");
    }
    //-------------------- Quesos---------------------------
    public static void Quesos (String data){
        System.out.println(" Haz elegido Sándwich de varios Quesos \uD83E\uDDC0");
        MetSandwiches.CanTam("");
    }
    //-------------------- RES---------------------------
    public static void Res (String data){
        System.out.println(" Haz elegido Sándwich de Res\uD83E\uDD69");
        MetSandwiches.CanTam("");
    }
    //-------------------- Tocino, pavo queso---------------------------
    public static void To_Queso (String data){
        System.out.println(" Haz elegido Sándwich de Tocino de pavo y queso \uD83E\uDD53");
        MetSandwiches.CanTam("");
    }

}
