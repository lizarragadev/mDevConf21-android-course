package k_13_herencia.ejemplo3

/**
 *
 * Clase donde se hereda la clase Dado
 *
 * */

class DadoRecuadro: Dado() {
    override fun imprimir() {
        println("***")
        println("*$valor*")
        println("***")
    }
}
