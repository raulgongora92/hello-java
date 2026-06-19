package basic.c00_helloworld;

/*
Clase 14 - Ejercicios: Primeros pasos
Vídeo: https://youtu.be/JOAqpdM36wI?t=5108
*/

public class HelloWorldExercises {

    public static void main(String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
            System.out.println("Raúl Góngora");

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
            System.out.println("Hola \nMundo");

        // 3. Añade un comentario sobre lo que hace cada línea del programa.
            // la linea 8, es la clase del programa
            // la linea 10, es el metodo que necesita el programa para que pueda ejecutar, es el punto de partida

        // 4. Crea un comentario en varias líneas.
            /*
            Esta es
            un comentario
            miltilinea
             */

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
            System.out.println("Edad: 33\nColor: Negro\nCiudad: Sincelejo");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
            System.err.println("Hola");

        // 7. Utiliza varios println para imprimir una frase.
            System.out.println("Java es un lenguaje de programación");
            System.out.println("y una plataforma informática versátil");
            System.out.println("orientada a objetos\n");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
            System.out.println("   XXXXX   ");
            System.out.println("  X     X  ");
            System.out.println(" X  O  O  X ");
            System.out.println("X    V    X");
            System.out.println(" X \\___/  X ");
            System.out.println("  X     X  ");
            System.out.println("   XXXXX  \n ");

            String caraFeliz = """
                   .-''''-.
                  /  _  _  \\
                 |  (o)(o)  |
                 |    __    |
                  \\  \\__/  /
                   '-....-'
                """;

            System.out.println(caraFeliz);

        // 9. Intenta ejecutar el programa sin el método main y observa el error.

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?

    }
}