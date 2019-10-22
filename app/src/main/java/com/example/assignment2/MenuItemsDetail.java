package com.example.assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuItemsDetail extends AppCompatActivity {
    private TextView foodNameText;
    private TextView foodDescText;
    private TextView priceText;
    private TextView foodIngredients;
    private TextView addToOrder;
    private TextView addedToOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_item_detail);


//        Spinner spinner = findViewById(R.id.spinner2);
//        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.options_array, android.R.layout.simple_spinner_item);
//        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter1);
//        spinner.setOnItemSelectedListener(this);


        final NumberPicker numberPicker = findViewById(R.id.numberPicker);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(9);

        int value1 = numberPicker.getValue();
        TextView addToOrder = (TextView)findViewById(R.id.addToOrder);
        addToOrder.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
            addedToOrder.setText("Added " + numberPicker.getValue() + " to your Order!");
            }
        });




        Intent intent = getIntent();
        int foodID = intent.getIntExtra("FoodID", 0);
        MenuItems menuItems = Database.getMenuItemByID(foodID);
        foodNameText = findViewById(R.id.foodName1);
        foodDescText = findViewById(R.id.foodDescDetail);
        priceText = findViewById(R.id.foodPrice1);
        foodIngredients= findViewById(R.id.foodIngred1);
        addedToOrder = findViewById(R.id.addedToOrder);
        addToOrder = findViewById(R.id.addToOrder);

        foodNameText.setText(menuItems.getFoodName());
        foodDescText.setText(menuItems.getFoodDetailedDesc());
        priceText.setText(menuItems.getPrice());
        foodIngredients.setText(menuItems.getFoodDesc());



    }
}
