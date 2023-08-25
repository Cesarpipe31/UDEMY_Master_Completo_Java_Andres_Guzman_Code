/*
El objetivo de esta primera tarea es crear una nueva clase con el método main y dentro imprime tu nombre en la salida estándar o consola utilizando System.out.println

Aunque parece simple, es importante desde el principio conocer bien la clase main y la salida estándar de java en consola.



IMPORTANTE: Como nota aparte todas las tareas publicadas en el curso son opcionales,
no afecta en nada en el avance del curso ni en el temario, tampoco afecta en la entrega
final del diploma o reconocimiento por haber finalizado el curso, son 100% opcionales y
todas traen incluidas el código de solución.
Así es como funciona el sistema de tareas de udemy, las tareas no quedan marcadas con
checked (como realizadas), esta funcionalidad no tiene nada que ver con nuestro curso
ni el instructor, así es como funciona la plataforma de Udemy.


Preguntas de esta tarea
Publica y envía acá mismo tu código de la tarea, solo la clase con el main, pero también es importante que lo pruebes localmente en tu equipo en el IDE Intellij o el que estés utilizando.
 */

public class MyName {
    public static void main(String[] args){
        var nombre = "Cesar Augusto Delgado Alvarado";
        System.out.println("My name is " + nombre);
        System.out.println("nombre = " + nombre.toUpperCase());
    }
}
