package k_03_rangos

/**
 *
 * Ejemplo utilizando rangos en Kotlin, un rango se define a través de los .. (dos puntos)
 * puede ser almacenado en una variable o directo.
 *
 * */

fun main() {
    val rangoNumerico = 1..100

    for(i in rangoNumerico) {
        print("$i, ")
    }
}