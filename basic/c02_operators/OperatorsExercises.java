package basic.c02_operators;

/*
Clase 23 - Ejercicios: Operadores
Vídeo: https://youtu.be/JOAqpdM36wI?t=8085
*/

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
            int number = 12;

            System.out.println(number + 3);
            System.out.println(number - 3);
            System.out.println(number * 3);
            System.out.println(number / 3);
            System.out.println(number % 3);

        // 2. Crea una variable para cada tipo de operación de asignación.
            number += 5;
            System.out.println(number);

            number -= 5;
            System.out.println(number);

            number *= 5;
            System.out.println(number);

            number /= 5;
            System.out.println(number);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
            System.out.println(5 >= 4);
            System.out.println(20>15);
            System.out.println((2!=6));

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
            System.out.println(5 < 4);
            System.out.println(20<=15);
            System.out.println((2>=6));

        // 5. Utiliza el operador lógico and.
            System.out.println(5>2 && 6<=10);

        // 6. Utiliza el operador lógico or.
            System.out.println(5>2 && 6>10);

        // 7. Combina ambos operadores lógicos.
            System.out.println((5>2 || 6>10) && 8 == 8);

        // 8. Añade alguna negación.
            System.out.println(!(5>2));

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
            System.out.println(+number);
            System.out.println(-number);
            System.out.println(++number);
            System.out.println(number++);
            System.out.println(number);
            System.out.println(--number);
            System.out.println(number--);
            System.out.println(number);

        // 10. Combina operadores aritméticos, de comparación y lógicos.
            System.out.println((15>(6*3) || 5<15) && 6 ==6);
    }
}
