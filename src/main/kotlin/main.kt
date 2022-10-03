
fun main() {
    var segundos = 0
    var tet = Tet()
    var tierra = Tierra()
    tet.iniciarTet()
    tierra.iniciarTierra(tet)
    tierra.mostrarTierra()
    do{
        if (segundos % 4 == 0) {
           tierra.recorrerTierraVerDrones()
        }
        if (segundos % 10 == 0){
            tet.actualizarOrdenes(tierra.tetRecorreTierra())
        }
        if(segundos % 20 == 0){
            tierra.resolverOrdenes(tet)
        }
        segundos++
    }while(segundos < 220);

    tet.mostrarOrdenesTotales(tierra)
    println("La cantidad de ordenes llevadas a cabo son "+tierra.devolverOrdenesCursadas())
    println("Este es el estado de la Tierra: ")
    tierra.mostrarTierra()

}





