package org.example.faturamentoDados

import kotlinx.serialization.Serializable

@Serializable
data class FaturamentoDiario(
    val dia: Int, val valor: Double)

@Serializable
data class FaturamentosDados(
    val faturamento: List<FaturamentoDiario>
)
