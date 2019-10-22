package com.example.assignment2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuItemsRecyclerViewAdapter extends RecyclerView.Adapter<MenuItemsRecyclerViewAdapter.MenuItemsViewHolder> {

    private ArrayList<MenuItems> data;

    public void setData(ArrayList<MenuItems> data) {
        this.data = data;
    }


    @NonNull
    @Override
    public MenuItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu, parent, false);
        MenuItemsViewHolder menuitemsViewHolder = new MenuItemsViewHolder(view);
        return menuitemsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuItemsViewHolder holder, int position) {
        final MenuItems menuItems = data.get(position);
        holder.foodNameText.setText(menuItems.getFoodName());
        holder.foodDescText.setText(menuItems.getFoodDesc());
        holder.priceText.setText(menuItems.getPrice());
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(context, MenuItemsDetail.class);
                intent.putExtra("FoodID", menuItems.getFoodID());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MenuItemsViewHolder extends RecyclerView.ViewHolder {
        public TextView foodNameText;
        public TextView foodDescText;
        public TextView priceText;
        public View view;

        public MenuItemsViewHolder(@NonNull View itemView) {
            super(itemView);
            view= itemView;
            foodNameText = itemView.findViewById(R.id.tv_foodName);
            foodDescText = itemView.findViewById(R.id.tv_foodDesc);
            priceText = itemView.findViewById(R.id.tv_foodPrice);
        }
    }
}
