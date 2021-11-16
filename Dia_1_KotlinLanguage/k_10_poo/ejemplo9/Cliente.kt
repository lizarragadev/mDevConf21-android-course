package k_10_poo.ejemplo9

/**
 *
 * Este es un objeto común y corriente.
 *
 * */

class Cliente(var nombre: String, var monto: Float) {

    fun depositar(monto: Float) {
        this.monto += monto
    }

    fun extraer(monto: Float) {
        this.monto -= monto
    }

    fun imprimir() {
        println("$nombre tiene depositado la suma de $monto")
    }
}