import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args){
        int i = 5, j = 4, suma = i + j, resta = i - j, multi = i * j, divi = i / j;
        float div2 = 0;
        System.out.println("suma = " + suma);

        System.out.println("i + j = " + i + j);

        System.out.println( + i + j + " i + j = ");

        System.out.println("i + j = " + (i + j));
        System.out.println("resta = " + resta);
        System.out.println("multi = " + multi);
        System.out.println("divi = " + divi);

        div2 = (float) i / j;
        System.out.println("div2 = " + div2);

        int numero = Integer.parseInt((JOptionPane.showInputDialog("Ingrese un número: ")));
        if(numero % 2 == 0){
            System.out.println("numero par = " + numero);
        } else {
            System.out.println("numero impar = " + numero);
        }

    }
}
