
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

        }
        segundos++
    }while(segundos < 200);

}





