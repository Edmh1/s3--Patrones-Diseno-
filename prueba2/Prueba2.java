package prueba2;

public class Prueba2 {

    /*
    * 🎮 Contexto del proyecto

Estás trabajando en un videojuego tipo RPG (rol por turnos).
Tu equipo necesita un sistema para crear, configurar y reutilizar personajes.

Actualmente existen tres tipos básicos de personajes: Guerrero, Mago, Arquero

Cada uno tiene atributos comunes: Nombre, Tipo, Armas, Habilidades especiales

🧠 Requisitos del sistema

    Los diseñadores del juego quieren poder crear personajes preconfigurados por tipo, pero también poder personalizarlos (nombre, habilidades…).

    En pruebas internas, a veces se necesita duplicar un personaje existente y hacerle pequeños cambios.

    Por eficiencia y organización, todo el proceso de creación y gestión de personajes debe centralizarse en una sola clase compartida por todo el juego.

🎯 Objetivo

Diseña un sistema en Java que permita:

    Crear personajes base por tipo.

    Personalizar sus atributos.

    Reutilizar estructuras comunes para no repetir código.

    Permitir duplicar personajes ya configurados.

    Centralizar la gestión desde una única clase.
    *
    *
    * */
    public static void main(String[] args) {

        PersonajeBuilder builder = new PersonajeBuilder("mago");
        Personaje mago = builder
                .setNombre("Merlín")
                .setArma("Bastón mágico")
                .setHabilidad("Bola de fuego")
                .build();

        Personaje copia = mago.clonar();
        copia.setNombre("Merlín Jr");


        System.out.println("Original: " + mago.getNombre());
        System.out.println("Copia: " + copia.getNombre());

    }



}
