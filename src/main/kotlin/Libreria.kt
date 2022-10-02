fun iniciarTierra(tet:Tet):Array<Array<Cuadrante?>>{
    var tierra = Array<Array<Cuadrante?>>(3){ Array<Cuadrante?> (3){null} }
    for(i in tierra.indices){
        for(j in tierra[i].indices) {
            tierra[i][j] = Cuadrante(tet.mandarDrones(), i, j)
        }
    }
    return tierra
}

fun mostrarTierra(tierra: Array<Array<Cuadrante?>>){
    for(i in tierra.indices){
        for(j in tierra[i].indices){
            print("${tierra[i][j]}       |       ")
        }
        println()
    }
    println()
}