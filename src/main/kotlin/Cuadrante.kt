class Cuadrante (var drones:Array<Dron?>, var fila:Int, var col:Int ) {
    private var mecanico = "Jack $fila$col"
    private var supervisora = "Vika $fila$col"

    fun comprobarDrones(){
        for(i in drones.indices){
            drones[i]!!.seEstropea()
        }
    }
    override fun toString(): String {
        return "Cuadrante(drones=${drones.contentToString()}, coordenadas='$fila $col', mecanico='$mecanico', supervisora='$supervisora')"
    }


}