import java.util.Date

class OrdenReparacion(fecha: Date, completado: Boolean, fila: Int, col: Int , var d: Dron, var reparado: Boolean) :
    Orden(fecha, completado, fila, col) {

    override fun toString(): String {
        return "OrdenReparacion(${super.toString()}, Dron=$d, reparado=$reparado)"
    }
}