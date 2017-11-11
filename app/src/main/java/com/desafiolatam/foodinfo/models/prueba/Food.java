package com.desafiolatam.foodinfo.models.prueba;

public class Food {
    private FoodHits[] hits;
    private int total_hits;
    private double max_score;

    public FoodHits[] getHits() {
        return this.hits;
    }

    public void setHits(FoodHits[] hits) {
        this.hits = hits;
    }

    public int getTotal_hits() {
        return this.total_hits;
    }

    public void setTotal_hits(int total_hits) {
        this.total_hits = total_hits;
    }

    public double getMax_score() {
        return this.max_score;
    }

    public void setMax_score(double max_score) {
        this.max_score = max_score;
    }
}
