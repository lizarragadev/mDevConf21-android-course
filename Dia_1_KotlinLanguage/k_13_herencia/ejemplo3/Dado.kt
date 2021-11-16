package k_13_herencia.ejemplo3

/**
 *
 * Clase que será heredable.
 *
 * */

open class Dado{
    protected var valor: Int = 1
    fun tirar() {
        valor = ((Math.random() * 6) + 1).toInt()
    }

    open fun imprimir() {
        println("$valor")
    }
}