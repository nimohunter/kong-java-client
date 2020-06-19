package com.github.vaibhavsinha.kong.internal.admin;

import com.github.vaibhavsinha.kong.model.admin.route.Route;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RetrofitRouteService {
    @POST("routes/")
    Call<Route> addRoute(@Body Route route);
    @DELETE("routes/{id}")
    Call<Void> DeleteRoute(@Path("id") String id);
}