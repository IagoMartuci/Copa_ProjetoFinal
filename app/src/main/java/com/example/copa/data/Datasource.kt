package com.example.copa.data

import com.example.copa.R
import com.example.copa.model.Escalacao

class Datasource {

    fun loadEscalacao(): List<Escalacao>{
        return listOf<Escalacao>(
            Escalacao(R.string.jogador1, R.drawable.hugolloris_goleiro),
            Escalacao(R.string.jogador2, R.drawable.raphaelvarane_zagueiro),
            Escalacao(R.string.jogador3, R.drawable.juleskounde_zagueiro),
            Escalacao(R.string.jogador4, R.drawable.lucashernandez_zagueiro),
            Escalacao(R.string.jogador5, R.drawable.ngolokante_meia),
            Escalacao(R.string.jogador6, R.drawable.paulpogba_meia),
            Escalacao(R.string.jogador7, R.drawable.theohernandez_meia),
            Escalacao(R.string.jogador8, R.drawable.kingsleycoman_meia),
            Escalacao(R.string.jogador9, R.drawable.antoinegriezmann_meia),
            Escalacao(R.string.jogador10, R.drawable.oliviergiroud_atacante),
            Escalacao(R.string.jogador11, R.drawable.kylianmbappe_atacante),
            Escalacao(R.string.treinador, R.drawable.didierdeschamps_treinador)
        )
    }
}