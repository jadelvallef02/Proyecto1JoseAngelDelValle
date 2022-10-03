import java.util.Date

open class Orden(var fecha: Date, var completado:Boolean, var fila: Int ,var col: Int) {


    override fun toString(): String {
        return "Orden(fecha=$fecha, completado=$completado, cuadrante=$fila $col)"
    }
}