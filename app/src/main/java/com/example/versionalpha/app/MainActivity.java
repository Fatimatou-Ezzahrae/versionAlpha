package com.example.versionalpha.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.versionalpha.R;
import com.example.versionalpha.backend.model.ApiClient;
import com.example.versionalpha.backend.model.LoginUser;
import com.example.versionalpha.backend.services.UserClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    UserClient userClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userClient = ApiClient.getClient().create(UserClient.class);
    }

    public void getTodos(View view) {

        Call<List<LoginUser>> call = userClient.getTodos();
        call.enqueue(new Callback<List<LoginUser>>() {
            @Override
            public void onResponse(Call<List<LoginUser>> call, Response<List<LoginUser>> response) {
                Log.e(TAG, "onResponse: " + response.body());
            }

            @Override
            public void onFailure(Call<List<LoginUser>> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.getLocalizedMessage());
            }
        });


    }

    public void getTodoUsingRouteParameter(View view) {

        Call<LoginUser> todoCall = userClient.getTodo(3);
        todoCall.enqueue(new Callback<LoginUser>() {
            @Override
            public void onResponse(Call<LoginUser> call, Response<LoginUser> response) {
                Log.e(TAG, "onResponse: " + response.body());
            }

            @Override
            public void onFailure(Call<LoginUser> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.getLocalizedMessage());
            }
        });

    }

    public void getTodosUsingQuery(View view) {

        Call<List<LoginUser>> listCall = userClient.getTodosUsingQuery(3, false);
        listCall.enqueue(new Callback<List<LoginUser>>() {
            @Override
            public void onResponse(Call<List<LoginUser>> call, Response<List<LoginUser>> response) {
                Log.e(TAG, "onResponse: " + response.body());
            }

            @Override
            public void onFailure(Call<List<LoginUser>> call, Throwable t) {

            }
        });

    }

    public void postTodo(View view) {

        LoginUser todo = new LoginUser("yaaqoub@test.test", "$2b$10$0RZ71/4o0aRTndtSqYDA6ebzJ4SL7nTUq7MErpHna1SAMgnBW0DBW");

        Call<LoginUser> todoPostCall = userClient.postTodo(todo);
        todoPostCall.enqueue(new Callback<LoginUser>() {
            @Override
            public void onResponse(Call<LoginUser> call, Response<LoginUser> response) {
                Log.e(TAG, "onResponse: " + response.body());
            }

            @Override
            public void onFailure(Call<LoginUser> call, Throwable t) {

            }
        });

    }
}
