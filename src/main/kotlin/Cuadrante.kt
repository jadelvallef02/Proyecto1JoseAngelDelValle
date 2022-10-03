import java.util.Date
class Cuadrante (var drones:Array<Dron?>, var fila:Int, var col:Int ) {
    private var mecanico = "Jack $fila$col"
    private var supervisora = "Vika $fila$col"
    private var ordenes = ArrayList<Orden>()

    fun comprobarDrones(){
        for(i in drones.indices){
            drones[i]!!.seEstropea()
        }
    }

    fun llegaOrden(o:Orden){
        ordenes.add(o)
    }

    fun devolverOrdenes():ArrayList<Orden>{
        return ordenes
    }
    fun devolverDronesMalEstado():ArrayList<Dron>{
        var dronesMalEstado = ArrayList<Dron>()
        for(i in drones.indices){
            if(drones[i]!!.operativo == false){
                dronesMalEstado.add(drones[i]!!)
            }
        }
        return dronesMalEstado
    }
    override fun toString(): String {
        return "Cuadrante(drones=${drones.contentToString()}, coordenadas='$fila $col', mecanico='$mecanico', supervisora='$supervisora')"
    }


}