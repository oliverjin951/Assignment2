package com.example.assignment2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ViewOrderRecyclerViewAdapter extends RecyclerView.Adapter<ViewOrderRecyclerViewAdapter.OrderedItemsViewHolder> {

    private ArrayList<MenuItems> orderedItemsArray;

    public void setOrderedItemsArray(ArrayList<MenuItems> orderedItemsArray) {
        this.orderedItemsArray = orderedItemsArray;
    }

    public static void setOrderCost(double orderCost){
        ViewOrderRecyclerViewAdapter.orderCost = orderCost;
    }
    public static double orderCost =0;

    public double getOrderCost() {
        for (int i = 0; i < orderedItemsArray.size(); i++) {
            MenuItems itemMenuObject = orderedItemsArray.get(i);
            orderCost += (itemMenuObject.getNumOrdered() * itemMenuObject.getPrice());
        }
        return orderCost;
    }

    @NonNull
    @Override
    public OrderedItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ordered_items, parent, false);
       OrderedItemsViewHolder orderedItemsViewHolder = new OrderedItemsViewHolder(view);
        return orderedItemsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OrderedItemsViewHolder holder, int position) {
        final MenuItems menuItems = orderedItemsArray.get(position);

        holder.foodNameText1.setText(menuItems.getFoodName());
        holder.foodPic1.setImageResource(menuItems.getFoodImage());
        String priceString ="$" +Double.toString(menuItems.getPrice());
        holder.priceText1.setText(priceString);
        holder.foodQuant1.setText(menuItems.getNumOrdered());
        holder.removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }


    @Override
    public int getItemCount() {
        return orderedItemsArray.size();
    }

    public class OrderedItemsViewHolder extends RecyclerView.ViewHolder {
        public TextView foodNameText1;
        public TextView foodQuant1;
        public TextView priceText1;
        public View view1;
        public ImageView foodPic1;
        public Button removeButton;


        public OrderedItemsViewHolder(@NonNull View itemView) {
            super(itemView);
            view1= itemView;
            foodNameText1 = itemView.findViewById(R.id.foodName1);
            foodQuant1 = itemView.findViewById(R.id.foodQuant1);
            priceText1 = itemView.findViewById(R.id.foodPrice1);
            foodPic1= itemView.findViewById(R.id.foodPic1);
            removeButton= itemView.findViewById(R.id.removeButton);
        }
    }
}
