package k_13_herencia.ejemplo3

/**
 *
 * Funcionamiento del ejemplo
 *
 * */

fun main() {
    val dado1 = Dado()
    dado1.tirar()
    dado1.imprimir()

    val dado2 = DadoRecuadro()
    dado2.tirar()
    dado2.imprimir()
}