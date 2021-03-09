package com.tochukwu.eiffelnews.api


import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface NewsApi {

    companion object {
        const val BASE_URL = "https://newsapi.org/v2/"
        const val API_KEY = "364a083c17e14c3d9318a30ccec4ef9f"
      //  const val BASE_URL = "https://newsapi.org"
    }

    @Headers("X-Api-Key: $API_KEY")
    @GET("top-headlines?country=us&pageSize=100")
    suspend fun getBreakingNews(): NewsResponse

    @Headers("X-Api-Key: $API_KEY")
    @GET("everything")
    suspend fun searchNews(
            @Query("q") query: String,
            @Query("page") page: Int,
            @Query("pageSize") pageSize: Int
    ): NewsResponse
}