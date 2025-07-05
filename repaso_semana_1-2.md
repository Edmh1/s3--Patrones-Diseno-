Repaso:
Teoría semana 1 y 2
---

### 🔹 ¿Qué es un `Stream`?

Un `Stream` en Java es una **secuencia de datos** que se puede procesar de forma **funcional y declarativa**.

* No modifica la colección original.
* No almacena datos, solo **fluye** a través de ellos.
* Se obtiene con `.stream()` desde una colección.

---

### 🔹 ¿Diferencia entre operación intermedia y terminal?

| Tipo       | Descripción                                           | Ejemplos                      |
| ---------- | ----------------------------------------------------- | ----------------------------- |
| Intermedia | Retorna otro Stream. Se puede encadenar.              | `filter`, `map`, `sorted`     |
| Terminal   | Cierra el stream. Retorna resultado o se puede realizar una operacion de agregacion. | `collect`, `forEach`, `count` |

---

### 🔹 ¿Por qué los Streams son inmutables?

Porque no alteran la colección original.
Cada operación devuelve un **nuevo stream**, dejando intacta la fuente de datos.

---

### 🔹 ¿Qué hace `collect(...)`?

Es una **operación terminal** que **acumula** los elementos del stream en una colección o estructura.

* Ej: `collect(Collectors.toList())`
* También se puede usar para agrupar, resumir, particionar, etc.

---

### 🔹 Interfaces Funcionales

| Interfaz            | ¿Qué hace?                    | Ejemplo básico               |
| ------------------- | ----------------------------- | ---------------------------- |
| `Function<T, R>`    | Recibe `T`, retorna `R`       | `x -> x.length()`            |
| `Predicate<T>`      | Recibe `T`, retorna `boolean` | `n -> n % 2 == 0`            |
| `Consumer<T>`       | Recibe `T`, no retorna nada   | `s -> System.out.println(s)` |
| `Supplier<T>`       | No recibe nada, retorna `T`   | `() -> "Hola"`               |
| `BiFunction<T,U,R>` | Recibe `T` y `U`, retorna `R` | `(a,b) -> a + b`             |
