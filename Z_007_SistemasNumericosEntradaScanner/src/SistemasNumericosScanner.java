import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numeroDecimal = 0;

        try {
            numeroDecimal = scanner.nextInt();
        }catch (InputMismatchException e){
            // }catch (Exception e){
            System.out.println("Debe ingresar un número entero.");
            main(args);
            System.exit(0);
        }


        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " +Integer.toBinaryString(numeroDecimal);


        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);


        String resultadoHexadecimal =  "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);


        String message = resultadoBinario;
        message += "\n" + resultadoOctal;
        message += "\n" + resultadoHexadecimal;

        System.out.println(message);
    }
}
