import java.util.Date
import kotlin.random.Random

class OrdenReparacion(fecha: Date, completado: Boolean, fila: Int, col: Int , var d: Dron?, var reparado: Boolean) :
    Orden(fecha, completado, fila, col) {

    override fun seRepara():Boolean{
        var reparado = true
        val alea = Random.nextInt(1,11)
        if(alea <= 5) {
            d!!.operativo = true
        }else{
            reparado = false
        }
        return reparado
    }

     override fun solicitarIdDronACambiar():Int{
        return d!!.id
    }

    override fun devolverIdDron():Int{
        return d!!.id
    }

    override fun resumenOrden() :String{
        var estado = "Sin terminar"
        if(d!!.operativo) estado="Terminado"
        return "Orden de Reparacion $fecha:, dron a reparar: $d, estado de la orden: $estado"
    }
    override fun toString(): String {
        return "OrdenReparacion(${super.toString()}, Dron=$d, reparado=$reparado)"
    }
}