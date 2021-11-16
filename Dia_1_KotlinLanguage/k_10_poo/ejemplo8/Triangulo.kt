package k_10_poo.ejemplo8

/**
 *
 * Ahora, en el caso que usted necesite tener no solo un constructor,
 * sino dos o más, se puede crear de la siguiente manera.
 * Utilizando la instrucción constructor juntamente con this y los argumentos que
 * tendrá ese constructor.
 *
 * */

class Triangulo(var lado1: Int, var lado2: Int, var lado3: Int) {

    constructor():this(0,0,0) {
        lado1 = readLine()!!.toInt()
        lado2 = readLine()!!.toInt()
        lado3 = readLine()!!.toInt()
    }

    fun ladoMayor() {
        print("Lado mayor: ")
        when {
            lado1 > lado2 && lado1 > lado3 -> print(lado1)
            lado2 > lado3 -> print(lado2)
            else -> print(lado3)
        }
    }

}