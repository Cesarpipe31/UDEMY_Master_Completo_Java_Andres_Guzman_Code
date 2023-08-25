import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args){

        String numeroString = JOptionPane.showInputDialog(null, "Ingrese un número entero: ");
        int numeroDecimal = 0;

        try {
            numeroDecimal = Integer.parseInt(numeroString);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Debe ingresar un número entero.");
            main(args);
            System.exit(0);
        }


        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binardio de " + numeroDecimal + " = " +Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);
        
        int numeroBinario = 0b111110100;
        System.out.println("numerobinario = " + numeroBinario);

        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHexadecimal =  "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexadecimal);

        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        String message = resultadoBinario;
        message += "\n" + resultadoOctal;
        message += "\n" + resultadoHexadecimal;

        JOptionPane.showMessageDialog(null, message);
    }
}
