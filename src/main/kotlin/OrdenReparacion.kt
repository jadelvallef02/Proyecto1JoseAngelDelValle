import java.util.Date

class OrdenReparacion(fecha: Date, completado: Boolean, fila: Int, col: Int , var numDron: Int, var reparado: Boolean) :
    Orden(fecha, completado, fila, col) {

    override fun toString(): String {
        return "OrdenReparacion(${super.toString()},numDron=$numDron, reparado=$reparado)"
    }
}