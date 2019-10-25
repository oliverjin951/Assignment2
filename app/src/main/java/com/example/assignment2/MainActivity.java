package com.example.assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static ArrayList<MenuItems> orderedItemsArray = new ArrayList<MenuItems>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView_main);
        MenuItemsRecyclerViewAdapter adapter = new MenuItemsRecyclerViewAdapter();
        adapter.setData(Database.getAllFood());
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        orderedItemsArray = (ArrayList<MenuItems>) getIntent().getSerializableExtra("orderedItemsArray");

        Intent intent1 = getIntent();
        int foodID = intent1.getIntExtra("foodID", 0);
        if(foodID!=0) {
            MenuItems itemObject = new MenuItems(foodID);
            int quantity = intent1.getIntExtra("quantity", 0);
            itemObject.setNumOrdered(quantity);
            orderedItemsArray.add(itemObject);
        }


        Button viewOrder = findViewById(R.id.viewOrder);
        viewOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent99 = new Intent(getApplicationContext(), ViewOrder.class);
                intent99.putExtra("orderedItemsArray", orderedItemsArray);
                startActivity(intent99);

            }
        });


    }
}

