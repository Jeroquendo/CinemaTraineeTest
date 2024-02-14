import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     char asientos[][] = new char[10][10];
     Scanner myScanner = new Scanner(System.in);
     Scanner myScanner2 = new Scanner(System.in);
     int asientoSeleccionado = 0, filaSeleccionada = 0;

     for (int r=0; r<10;r++) {
         for (int c=0; c<10; c++) {
             asientos[r][c] = 'L';
         }
     }
     System.out.println("------------BIENVENIDO AL SISTEMA DE RESERVAS------------");

     String finish = "";

     while(finish != "fin") {
         System.out.println("Desea ver los asientos disponibles ? 'S': si, 'N': no");
         String verAsientos = myScanner2.next();
         if(verAsientos.equalsIgnoreCase("s")) {
             drawSeats(asientos);
         }

         boolean puedeContinuar = false;
         while(!puedeContinuar) {
             System.out.println("Ingrese número de fila de 0 a 9");
             filaSeleccionada = myScanner.nextInt();
             System.out.println("Ingrese número de asiento que desea seleccionar de 0 a 9");
             asientoSeleccionado = myScanner.nextInt();

             if(filaSeleccionada >=0 && filaSeleccionada <=9){
                 if(asientoSeleccionado >=0 && asientoSeleccionado <=9) {
                     puedeContinuar = true;
                 } else {
                     System.out.println("Ingrese un numero de asiento correcto");
                 }
             } else {
                 System.out.println("Ingrese número de fila correcto");
             }

         }
                 if(asientos[filaSeleccionada][asientoSeleccionado] == 'L') {
                     asientos[filaSeleccionada][asientoSeleccionado] = 'X';
                     System.out.println("Su asiento se ha reservado exitosamente");
                 } else {
                     System.out.println("Asiento ocupado");
                 }

         System.out.println("Para finalizar ingrese la palabra 'fin', de lo contrario ingrese cualquier cosa");
         finish = myScanner2.next();
     }


    }

    static void drawSeats(char asientos[][]) {
        System.out.println("Los asientos disponibles son los que tiene la letra 'L'");
        for (int r=0; r<10;r++) {
            System.out.print(r + " ");
            for (int c=0; c<10; c++) {
                System.out.print("["+asientos[r][c]+"]");
            }
            System.out.println("");
        }
    }
}