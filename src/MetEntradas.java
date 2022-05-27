import java.util.Scanner;

public class MetEntradas {

    //TAMAÑO BEBIDA MOSTRAR****************************************************

    public static void mostrar_tam (String data){
        System.out.println(" ");
        String [] tamaño  = {      //NO PRINT
                "Grande (1,000 g) - Q12.00",
                "Mediano  (800 g) - Q10.00",
                "Pequeño  (500 g) - Q8.00"
        };

        for (int i = 0; i<tamaño.length; i++){
            System.out.println("["+i+"] "+tamaño [i]);
        }

    }
//***************************CANTIDAD PRECIO Y TAMAÑO*************************    //
public static void  CantTam (String data){
    MetEntradas.mostrar_tam("");

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
    int [] precios_tamaño  ={12,10,8};

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
        System.out.print("Tienes un total de : Q");
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


/***********************************MENÚ ENTRADA************************/
    public static void OpEntradas (String data){

        String [] OpEntradas1=
                {"Bolitas de queso mozarella \uD83E\uDDC0 \n",
                 "Chips de papa \uD83E\uDD54 \n",
                 "Gazpacho de mango \uD83E\uDD6D \n",
                 "Grisines de queso \uD83E\uDDC0 \n",
                 "Hojaldre de tomate\uD83C\uDF45 y cebolla \uD83E\uDDC5 \n"
        };

        //Recorrer matriz
        System.out.println("Numero según sección que elijas :) ");
        System.out.println(" ");
        for(int i = 0; i<OpEntradas1.length;i++){
                System.out.print("["+i+"]"+OpEntradas1[i]);
}
    }

    //-------------------Bolitas Queso----------------------------------
    public static void bolitas_queso (String data){
        System.out.print(" Haz eleigido Bolitas de queso mozarella \uD83E\uDDC0");
        MetEntradas.CantTam("");
    }
    //-------------------Chips de Papa----------------------------------
    public static void Chips_papa(String data){
        System.out.println(" Haz elegido Chips de papa \uD83E\uDD54");
        MetEntradas.CantTam("");
    }
    //-------------------Gazpacho de Mango----------------------------------
    public static void Gazpacho(String data){
        System.out.println(" Haz elegido Gazpacho de mango \uD83E\uDD6D");
        MetEntradas.CantTam("");
    }
    //-------------------Grisines de queso----------------------------------
    public static void Grsines(String data){
        System.out.println("Haz elegido  Grisines de queso \uD83E\uDDC0 ");
        MetEntradas.CantTam("");
    }
    //-------------------Hojadre Tomate y Cebolla----------------------------------
    public static void Hojaldre(String data){
        System.out.println("Haz elegido  Hojaldre de tomate\uD83C\uDF45 y cebolla \uD83E\uDDC5 ");
        MetEntradas.CantTam("");
    }
}
