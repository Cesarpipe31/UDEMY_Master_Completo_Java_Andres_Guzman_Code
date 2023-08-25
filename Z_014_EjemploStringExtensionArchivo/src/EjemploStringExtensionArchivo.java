public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna.imagen.pdf";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo = " + archivo.substring(i+1));

        String trabalenguas = "trabalenguas";
        char[] charTraba = trabalenguas.toCharArray();
        int largo = trabalenguas.length();
        for(i=1; i<largo;i++){
            System.out.println("charTraba = " + charTraba[i]);
        }

        System.out.println("trabalenguas = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");

        int largo1 = arreglo2.length;

        for(i=1;i<largo1;i++){
            System.out.println("arreglo2 = " + arreglo2[i]);

        }

        String archivo1 = "alguna.imagen.pdf";
        String[] archivoArr = archivo1.split("\\."); // [.]
        int l = archivoArr.length;
        System.out.println("archivoArr = " + archivoArr);
        System.out.println("l = " + l);
        for(int j=0; j < l; j++){
            System.out.println("archivoArr = " + archivoArr);
        }
    }
}
