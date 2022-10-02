import java.util.Date
fun main() {
    var segundos = 0
    var tet = Tet()
    var tierra = Array<Array<Cuadrante?>>(3) { Array<Cuadrante?>(3) { null } }
    tet.iniciarTet()
    tierra = iniciarTierra(tet)
    mostrarTierra(tierra)
    do{
        if (segundos % 4 == 0) {
            tierra = recorrerTierraVerDrones(tierra)
        }
        if (segundos % 10 == 0){

        }
        segundos++
    }while(segundos < 200);

}





