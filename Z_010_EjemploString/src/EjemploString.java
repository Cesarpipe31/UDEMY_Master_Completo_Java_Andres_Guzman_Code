public class EjemploString {
    public static void main(String[] args) {
        String mensaje = "Hola Java";
        String mensajeUno = new String("Hola Java");
        boolean esIgual = mensaje == mensajeUno;
        System.out.println("esIgual = " + esIgual);

        esIgual = mensaje.equals(mensajeUno);
        System.out.println("esIgual = " + esIgual);
        
        String mensajeDos = "hola java";
        esIgual = mensaje.equalsIgnoreCase(mensajeDos);
        System.out.println("esIgual = " + esIgual);

        String mensajeTres = "Hola Java";
        esIgual = mensaje == mensajeTres;
        System.out.println("esIgual = " + esIgual);

        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        String resultado = curso.concat(profesor);
        System.out.println("Curso = " + curso);
        System.out.println("Resultado = " + resultado);
        System.out.println(curso == resultado);

        String resultado2 = curso.transform(c -> {
            return c + " con " + profesor;
        });

        System.out.println("Curso = " + curso);
        System.out.println("resultado2 = " + resultado2);

        String resultado3 = resultado.replace("a", "A");

        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);
    }
}
