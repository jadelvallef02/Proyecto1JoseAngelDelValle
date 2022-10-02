import java.util.Date

class OrdenReparacion(fecha: Date, completado: Boolean, cuadrante: IntArray, var numDron: Int, var reparado: Boolean) :
    Orden(fecha, completado, cuadrante) {

    override fun toString(): String {
        return "OrdenReparacion(${super.toString()},numDron=$numDron, reparado=$reparado)"
    }
}