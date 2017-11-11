package com.desafiolatam.foodinfo.networks;

import com.desafiolatam.foodinfo.models.FoodWrapper;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Gabriel on 04-11-2017.
 */

public interface GetDataFood {

  @GET("search/{item_name}?fields=item_name,nf_calories")
    Call<FoodWrapper> get(@Path("item_name") String item_name);

}
