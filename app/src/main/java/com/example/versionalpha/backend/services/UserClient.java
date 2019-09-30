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

    @GET("/#api-Authentication-LoginUser")
    Call<List<LoginUser>> getTodos();

    @GET("/#api-Authentication-LoginUser/{id}")
    Call<LoginUser> getTodo(@Path("id") int id);

    @GET("/#api-Authentication-LoginUser")
    Call<List<LoginUser>> getTodosUsingQuery(@Query("userId") int userId, @Query("completed") boolean completed);

    @POST("/#api-Authentication-LoginUser")
    Call<LoginUser> postTodo(@Body  LoginUser loginUser);

    //methodes of registration

}