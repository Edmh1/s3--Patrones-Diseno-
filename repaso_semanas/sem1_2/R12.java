package repaso_semanas.sem1_2;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class R12 {
    public static void main(String[] args) {


        //¿Cómo agruparías una lista de personas por edad?
        record Persona(String nombre, int edad) {}
        List<Persona> personas = List.of(
                new Persona("Ana", 17),
                new Persona("Luis", 22),
                new Persona("Marta", 17),
                new Persona("Carlos", 22)
        );
        //R/
        //personas.stream().collect(Collectors.toMap(Persona::edad, a -> a));

        //Escribe un Stream que: Reciba una lista de Strings.
        // Filtre los que empiecen por vocal.
        // Los pase a mayúscula.
        // Imprima cada uno con forEach.
        personas.stream().map(Persona::nombre).filter(a -> "aeiou".indexOf(a.toLowerCase().charAt(0)) != -1)
                .map(a -> a.toUpperCase())
                .forEach(System.out::println);






    //¿Qué significa que las interfaces funcionales tengan una única abstract method?
    //R/ significa que el compilador de java necesita evitar ambiguedades a la hora de
        //usar la expresion lambda
    //¿Cuándo usarías Consumer vs Function?
        //R/ consumer es cuando necesito una funcion que haga algo pero que no retorne
        //mientras que function si retorna

        //Define un record Persona(String nombre, int edad) y crea una lista de personas.

        //Usa partitioningBy para separar mayores y menores de edad.
    Map<Boolean,List<Persona>> l2 = personas.stream()
            .collect(Collectors.partitioningBy(p -> p.edad > 18));
        System.out.println(l2);
        //        Escribe un Consumer<Persona> que imprima "¡Hola, [nombre]!".
        Consumer<Persona> imprimir = p -> System.out.println("hola,"+ p.nombre);
        imprimir.accept(new Persona("pepe", 12));
        //        Escribe un Supplier<String> que retorne una cadena aleatoria tipo UUID.
        //Usa una BiFunction<Integer, Integer, String> que diga si la suma de dos números es par o impar.

        //        Implementa una Function<Persona, String> que devuelva:
        //"Persona [nombre] tiene [edad] años".

    //¿Qué imprime el siguiente código?

    //            Function<String, Integer> largo = s -> s.length();
    //    Function<Integer, Boolean> esPar = n -> n % 2 == 0;
    //    System.out.println(largo.andThen(esPar).apply("Java"));
    }
}
