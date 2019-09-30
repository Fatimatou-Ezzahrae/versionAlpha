package com.example.versionalpha.backend.services;


import com.example.versionalpha.backend.model.LoginUser;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface UserClient {

    @GET("/users/login")
    Call<List<LoginUser>> getTodos();

    @GET("/users/login")
    Call<LoginUser> getTodo(@Path("id") int id);

    @GET("/users/login")
    Call<List<LoginUser>> getTodosUsingQuery(@Query("userId") int userId, @Query("completed") boolean completed);

    @POST("/users/login")
    Call<LoginUser> postTodo(@Body  LoginUser loginUser);

    //methodes of registration

}