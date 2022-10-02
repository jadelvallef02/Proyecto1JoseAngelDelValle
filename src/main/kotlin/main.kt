import java.util.Date
fun main(){
    var tet = Tet()
    var tierra = Array<Any>(3){Array<Any>(3){}}
    tet.iniciarTet()
}

fun iniciarTierra(tet:Tet){
    var tierra = Array<Array<Cuadrante?>>(3){ Array<Cuadrante?> (3){null} }
    for(i in tierra.indices){
        for(j in tierra[i].indices) {
                tierra[i][j]= Cuadrante(tet.mandarDrones(), i, j)
        }
    }
}

