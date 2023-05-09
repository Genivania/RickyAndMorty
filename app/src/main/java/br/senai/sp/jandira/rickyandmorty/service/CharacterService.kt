package br.senai.sp.jandira.rickyandmorty.service

import br.senai.sp.jandira.rickyandmorty.model.CharacterList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CharacterService {

    //https://rickandmortyapi.com/api/

    @GET("character")
    fun getCharacters(): Call<CharacterList>

    @GET("character/{id}")
    fun getCharacter(@Path("id") id: Int): Call<br.senai.sp.jandira.rickyandmorty.model.Character>

    @GET("character/")
    fun getCharacterByPages(@Query("page") page: Int): Call<CharacterList>

    @GET("character/location/{id}")
    fun  getCharacterLocation(@Path("id") id: Int): Call<CharacterList>










}
