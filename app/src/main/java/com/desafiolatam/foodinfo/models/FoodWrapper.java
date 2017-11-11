package com.desafiolatam.foodinfo.models;

/**
 * Created by Gabriel on 11-11-2017.
 */

public class FoodWrapper {

    private FoodData[] hits;

    public FoodWrapper() {
    }

    public FoodData[] getHits() {
        return hits;
    }

    public void setHits(FoodData[] hits) {
        this.hits = hits;
    }


}
