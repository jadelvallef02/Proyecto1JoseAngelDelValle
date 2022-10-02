import java.util.Date
fun main(){
    var tet = Tet()
    var tierra = Array<Array<Cuadrante?>>(3){ Array<Cuadrante?> (3){null} }
    tet.iniciarTet()
    tierra = iniciarTierra(tet)
    mostrarTierra(tierra)
}





