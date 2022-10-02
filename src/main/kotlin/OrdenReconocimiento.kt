import java.util.Date

class OrdenReconocimiento(
    fecha: Date,
    completado: Boolean,
    cuadrante: IntArray,
    var area: Int,
    var encontrado: String
) : Orden(fecha, completado, cuadrante) {

    override fun toString(): String {
        return "OrdenReconocimiento(${super.toString()},area=$area, encontrado='$encontrado')"
    }
}