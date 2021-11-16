package k_12_enum_classes.ejemplo2

/**
 *
 * Un ENUM también puede tener un valor extra como un
 * MAP, en este caso el valor lo colocamos entre paréntesis.
 *
 * */

enum class TipoOperacion(val tipo: String) {
    SUMA("+"),
    RESTA("-"),
    MULTIPLICACION("*"),
    DIVISION("/")
}