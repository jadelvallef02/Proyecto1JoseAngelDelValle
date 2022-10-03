
fun main() {
    var segundos = 0
    var tet = Tet()
    var tierra = iniciarTierra(tet)
    tet.iniciarTet()
    mostrarTierra(tierra)
    do{
        if (segundos % 4 == 0) {
            tierra = recorrerTierraVerDrones(tierra)
        }
        if (segundos % 10 == 0){
            tet.actualizarOrdenes(tetRecorreTierra(tierra))
        }
        if(segundos % 20 == 0){

        }
        segundos++
    }while(segundos < 200);

}





