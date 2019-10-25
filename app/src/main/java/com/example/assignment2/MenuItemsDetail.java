package com.example.assignment2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.assignment2.ViewOrderRecyclerViewAdapter.orderCost;

public class MenuItemsDetail extends AppCompatActivity {
    private TextView foodNameText;
    private TextView foodDescText;
    private TextView priceText;
    private TextView foodIngredients;
    private ImageView foodPic1;
    private int FoodID;
    private int quantity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_item_detail);

        final NumberPicker numberPicker = findViewById(R.id.numberPicker);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(30);


        TextView addToOrder = (TextView) findViewById(R.id.addToOrder);
        addToOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
                intent1.putExtra("FoodID", FoodID);
                intent1.putExtra("quantity", quantity);
                startActivity(intent1);
                showToast();
            }
        });

        Intent intent = getIntent();
        int foodID = intent.getIntExtra("FoodID", 0);
        MenuItems menuItems = Database.getMenuItemByID(foodID);

        foodNameText = findViewById(R.id.foodName1);
        foodDescText = findViewById(R.id.foodDescDetail);
        priceText = findViewById(R.id.foodPrice1);
        foodIngredients = findViewById(R.id.foodIngred1);
        foodPic1= findViewById(R.id.foodPic1);

        foodNameText.setText(menuItems.getFoodName());
        foodDescText.setText(menuItems.getFoodDetailedDesc());
        foodIngredients.setText(menuItems.getFoodDesc());
        priceText.setText("$"+ menuItems.getPrice());
        foodPic1.setImageResource(menuItems.getFoodImage());
        //        Spinner spinner = findViewById(R.id.spinner2);
//        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.options_array, android.R.layout.simple_spinner_item);
//        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter1);
//        spinner.setOnItemSelectedListener(this);
    }

    private void showToast() {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout,(ViewGroup)findViewById(R.id.toast_root));
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        TextView toastText = layout.findViewById(R.id.toast_text);
        toastText.setText("Your Order Total is" + orderCost);
    }
}
