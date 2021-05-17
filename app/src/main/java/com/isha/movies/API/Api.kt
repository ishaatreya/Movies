package com.isha.movies.API

import com.isha.movies.Model.GetMoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "e2a71c49226ebb9ecab78c2db819705c",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = "e2a71c49226ebb9ecab78c2db819705c",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = "e2a71c49226ebb9ecab78c2db819705c",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}