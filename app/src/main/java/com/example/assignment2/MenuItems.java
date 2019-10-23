package com.example.assignment2;

public class MenuItems {

    private int foodID;
    private String foodName;
    private String foodDesc;
    private double price;
    private String foodDetailedDesc;
    private int numOrdered;
    private int foodImage;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFoodDetailedDesc() {
        return foodDetailedDesc;
    }

    public void setFoodDetailedDesc(String foodDetailedDesc) {
        this.foodDetailedDesc = foodDetailedDesc;
    }

    public int getNumOrdered() {
        return numOrdered;
    }

    public void setNumOrdered(int numOrdered) {
        this.numOrdered = numOrdered;
    }

    public int getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(int foodImage) {
        this.foodImage = foodImage;
    }

    public MenuItems(int foodID, String foodName, String foodDesc, double price, String foodDetailedDesc, int numOrdered, int foodImage ) {
        this.foodID = foodID;
        this.foodName = foodName;
        this.foodDesc = foodDesc;
        this.price = price;
        this.foodDetailedDesc= foodDetailedDesc;
        this.numOrdered = numOrdered;
        this.foodImage = foodImage;

    }

}
