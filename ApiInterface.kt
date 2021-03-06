package com.example.cat2

import android.graphics.PostProcessor
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface ApiInterfce {
    @GET("posts")
    fun getPosts(): Call<List<Post>>

    @GET("posts/{id}")
    fun getPostById(@Path("id") postId:Int): Call<Post>
    @GET("posts/{id}/comments")
    fun getComments(@Path("id")postId: Int): Call<List<Comments>>

}

class Post {

}

class Comments {

}
