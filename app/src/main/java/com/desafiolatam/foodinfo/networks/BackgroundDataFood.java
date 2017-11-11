package com.desafiolatam.foodinfo.networks;

import android.os.AsyncTask;
import android.util.Log;

import com.desafiolatam.foodinfo.models.FoodData;
import com.desafiolatam.foodinfo.models.FoodWrapper;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by Gabriel on 05-11-2017.
 */

public class BackgroundDataFood extends AsyncTask<String, Void, FoodData[] > {

    @Override
    protected FoodData[] doInBackground(String... params) {
        GetDataFood getFood = new FoodInterceptor().inteceptor();
        Call<FoodWrapper> food = getFood.get(params[0]);

        try {
            Response<FoodWrapper> response = food.execute();
            FoodData[] foodData = response.body().getHits();
            if (200 == response.code() && response.isSuccessful()) {

                return foodData;
            }else{

                Log.d("ERROR","paso por aquí");
                return null;

            }

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }


    }
}


