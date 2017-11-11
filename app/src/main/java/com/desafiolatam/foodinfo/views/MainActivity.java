package com.desafiolatam.foodinfo.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.desafiolatam.foodinfo.R;
import com.desafiolatam.foodinfo.models.FoodData;
import com.desafiolatam.foodinfo.networks.BackgroundDataFood;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText) findViewById(R.id.itemNameFoodEt);
        Button button = (Button) findViewById(R.id.searchBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itemFood = editText.getText().toString();
                new Getfood().execute(itemFood);

            }
        });


    }


    private class Getfood extends BackgroundDataFood{

        @Override
        protected void onPostExecute(FoodData[] foodData) {

            if (foodData != null && foodData.length > 0){

                FoodData first = foodData[0];
                String name = first.getFields().getItem_name();
                TextView foodNameTv = (TextView) findViewById(R.id.nameFoodTv);
                foodNameTv.setText("ITEM :" +name);

                String calories = String.valueOf(first.getFields().getNf_calories());
                TextView foodCalories = (TextView) findViewById(R.id.caloriesFoodTv);
                foodCalories.setText("CALORIAS :" +calories);

                Toast.makeText(MainActivity.this, first.getFields().getItem_name(), Toast.LENGTH_SHORT).show();

            }else {


                Toast.makeText(MainActivity.this, "ITEM NO ENCONTRADO", Toast.LENGTH_SHORT).show();
                
            }
        }
    }
}
