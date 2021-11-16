package k_11_data_classes.ejemplo3

/**
 *
 * Y Como pueden ver, no es necesario llamar a la función toString,
 * se encuentra implícitamente en la impresión del objeto.
 *
 * */

fun main() {
    val dado1 = Dado(4)
    val dado2 = Dado(6)
    val dado3 = Dado(1)
    println(dado1)
    println(dado2)
    println(dado3)
}