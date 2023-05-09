package br.senai.sp.jandira.rickyandmorty.model

data class Character(
    val id: Long,
    val name: String,
    val species: String,
    val gender: String,
    val image: String,
    val location: Location
)
