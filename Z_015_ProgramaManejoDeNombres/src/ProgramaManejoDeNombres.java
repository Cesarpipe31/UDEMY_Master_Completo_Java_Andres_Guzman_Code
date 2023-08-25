//  La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
//        Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu
//        familia o amigos como argumentos de línea de comandos.//
//        Se pide por cada nombre de la persona una nueva variable del tipo String al tomar
//        el segundo carácter pero convertido en mayúscula y se le concatena un punto y los
//        dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es
//
//        Debe imprimir como resultado los tres nuevos nombres separado con guion bajo
//        (como una única variable).
//
//        Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
//
//        N.es_A.ia_E.pe


import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nuevoString = "";
        for(int i=0; i < 3; i++){
            System.out.println("Escribe el nombre de la persona " + (i+1) + ":" );
            String name = scanner.nextLine();
            char segundo = segundoCaracter(name);
            String dosUltimos = dosUltimosCaracteres(name);
            nuevoString += segundo + "." + dosUltimos + "_";
        }
        System.out.println(nuevoString.substring(0,14));
    }

    public static char segundoCaracter(String name){
        char var = name.toUpperCase().charAt(1);
        return var;
    }

    public static String dosUltimosCaracteres(String name){
        String stringDos = name.substring(name.length()-2,name.length());
        return stringDos;
    }
}
