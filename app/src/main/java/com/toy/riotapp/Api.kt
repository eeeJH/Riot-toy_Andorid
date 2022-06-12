package com.toy.riotapp

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.toy.riotapp.dto.HTTP_Get
import com.toy.riotapp.dto.HTTP_Post
import com.toy.riotapp.dto.HTTP_Post_Result
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

interface Api {

    @POST("/users")
    @Headers(
        "accept: application/json",
        "content-type: application/json"
    )
    fun post_users(
        @Body jsonparams: HTTP_Post
    ): Call<HTTP_Post_Result>

    @GET("/users")
    @Headers(
        "accept: application/json",
        "content-type: application/json"
    )
    fun get_users(
    ): Call<HTTP_Get>


    companion object { // static 처럼 공유객체로 사용가능함. 모든 인스턴스가 공유하는 객체로서 동작함.
        private const val BASE_URL = "http://234.234.234.33:7712" // 주소

        fun create(): Api {

            val gson: Gson = GsonBuilder().setLenient().create();

            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
                .create(Api::class.java)
        }
    }

}