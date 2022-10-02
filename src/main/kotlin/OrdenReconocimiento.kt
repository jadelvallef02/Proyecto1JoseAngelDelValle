import java.util.Date

class OrdenReconocimiento(
    fecha: Date,
    completado: Boolean,
    fila: Int,
    col: Int,
    var area: Int,
    var encontrado: String
) : Orden(fecha, completado, fila, col) {

    override fun toString(): String {
        return "OrdenReconocimiento(${super.toString()},area=$area, encontrado='$encontrado')"
    }
}