package k_03_rangos

/**
 *
 * Ejemplo con rangos, se puede asignar un rango de letras,
 * los rangos son básicamente lotes de datos que existen, en este caso
 * se utiliza todas las letras del alfabeto inglés.
 *
 * */

fun main() {
    val rangoLetras = 'a'..'z'
    for(i in rangoLetras) {
        print("$i, ")
    }
}