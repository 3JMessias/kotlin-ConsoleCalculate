fun main(args: Array<String>) {
    var continuar = true
    do {
        println("Entre com primeiro valor: ")
        var n1: Float? = readLine()!!.toFloatOrNull()

        println("Entre com segundo valor: ")
        var n2: Float? = readLine()!!.toFloatOrNull()

        println("Num01: $n1 \nNum02: $n2")
        if (n1 == null || n2 == null || n1!!.isNaN() || n2!!.isNaN()){
            println("Valores Inválidos!")
            continuar = DesejaContinuar()
        }
        else {
        println("Entre com a operação desejada ")
        println("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão ")
        var operador: Int? = readLine()!!.toIntOrNull()

            when (operador) {
                1 -> { println("Resultado = " + n1?.plus(n2!!))
                    continuar = DesejaContinuar() }
                2 -> { println("Resultado = " + n1?.minus(n2!!))
                    continuar = DesejaContinuar() }
                3 -> { println("Resultado = " + n1?.times(n2!!))
                    continuar = DesejaContinuar() }
                4 -> { println("Resultado = " + n1?.div(n2!!))
                    continuar = DesejaContinuar() }
                else -> { println("Operação inválida!")
                    continuar = DesejaContinuar() }
            }}
        }while (continuar)
        println("Obrigado, volte sempre!")
}

public fun DesejaContinuar():Boolean{
    println("Digite 0 (Zero) para finailzar")
    var x:String? = readLine()
    if(x.equals("0")) return false
    else return true
}