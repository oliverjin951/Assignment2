package com.example.assignment2;

public class MenuItems {

    private int foodID;
    private String foodName;
    private String foodDesc;
    private String price;
    private String foodDetailedDesc;


    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodDesc() {
        return foodDesc;
    }

    public void setFoodDesc(String foodDesc) {
        this.foodDesc = foodDesc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getFoodDetailedDesc() {
        return foodDetailedDesc;
    }

    public void setFoodDetailedDesc(String foodDetailedDesc) {
        this.foodDetailedDesc = foodDetailedDesc;
    }

    public MenuItems(int foodID, String foodName, String foodDesc, String price, String foodDetailedDesc) {
        this.foodID = foodID;
        this.foodName = foodName;
        this.foodDesc = foodDesc;
        this.price = price;
        this.foodDetailedDesc= foodDetailedDesc;

    }

}
