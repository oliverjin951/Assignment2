package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ViewOrder extends AppCompatActivity {

    private ArrayList<MenuItems> OrderedItemsArray;
    private TextView orderCost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_order);

        OrderedItemsArray = (ArrayList<MenuItems>) getIntent().getSerializableExtra("orderedItemsArray");

        RecyclerView recyclerView = findViewById(R.id.recyclerViewOrder);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ViewOrderRecyclerViewAdapter adapter = new ViewOrderRecyclerViewAdapter();
        adapter.setOrderedItemsArray(OrderedItemsArray);
        recyclerView.setAdapter(adapter);



    }
}
