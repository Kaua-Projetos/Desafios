package org.example

import kotlinx.serialization.json.Json
import org.example.faturamentoDados.FaturamentosDados
import java.io.File

//1.
//fun main() {
//    var indice = 13
//    var soma = 0
//    var k = 0
//
//        while (k < indice){
//
//            k = k + 1
//            soma = soma + k
//
//            println(soma)
//
//        }
//    }
//1. Resultado é "91"

//----------------\\

//2.
//fun main(){
//
//    var listaFibonacci = mutableListOf<Int>(0,1)
//
//    val n = 10
//    var a = 0
//    var b = 1
//
//    println("numero: ")
//
//    for (i in 1..n) {
//        println("$a")
//        val sum = a + b
//        a = b
//        b = sum
//
//        listaFibonacci.add(b)
//
//    }
//    val nDesejado = 13
//
//    if (nDesejado in listaFibonacci){
//        println("O número $nDesejado está nos números de Fibonacci")
//    }else{
//        println("O número $nDesejado não está nos números de Fibonacci")
//    }
//
//}

//----------------\\

//3.
//fun main() {
//
//    val arquivo = File("C:\\Users\\lobog\\Downloads\\dados.json")
//
//    val jsonLeitura = arquivo.readText()
//
//    val dados = Json.decodeFromString<FaturamentosDados>(jsonLeitura)
//
//    val faturamentoValidado = dados.faturamento.filter { diaValido ->
//        diaValido.valor > 0
//    }
//    val faturamentoMaximo = faturamentoValidado.maxOfOrNull{maximo ->
//        maximo.valor
//    }
//    val faturamentoMinimo = faturamentoValidado.minOfOrNull{minimo ->
//        minimo.valor
//    }
//    val faturamentoMedio= faturamentoValidado.map{medio ->
//        medio.valor
//    }.average()
//    val faturamentoDiasMaior= faturamentoValidado.count{maior ->
//        maior.valor > faturamentoMedio
//    }
//
//    println("Menor Faturamento: $faturamentoMinimo")
//    println("Maior Faturamento: $faturamentoMaximo")
//    println("Faturamento Médio: $faturamentoMedio")
//    println("Dias maiores que a média: $faturamentoDiasMaior")
//}
// O arquivo JSON mandado nao estava sendo lido, eu troquei a "[]" inicial e final por "{}", somente assim para ele conseguir

//----------------\\

//4.
//fun main(){
//    val faturamenoPorEstado = mapOf(
//        "SP" to 67836.43,
//        "RJ" to 36678.66,
//        "MG" to 29229.88,
//        "ES" to 27165.48,
//        "Outros" to 19849.53,
//    )
//    val faturamentoTotal = faturamenoPorEstado.values.sum()
//
//    println("Percentual de cada estado no faturamento total: ")
//
//    for ((estado, faturamento) in faturamenoPorEstado){
//
//        val percentual = (faturamento / faturamentoTotal) * 100
//
//        println("$estado: %.2f%%".format(percentual))
//
//    }
//}

//----------------\\

//5.
//fun main(){
//
//    print("Digite algo para inverter: ")
//    val entrada = readLine() ?: ""
//
//    val resultado = inverter(entrada)
//
//    println(resultado)
//
//}

//fun inverter(palavras: String): String {
//    var resultado = ""
//
//    for(i in palavras.length - 1 downTo 0){
//
//        resultado += palavras[i]
//    }
//    return resultado
//}
