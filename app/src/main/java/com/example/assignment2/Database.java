package com.example.assignment2;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Database {
    public static MenuItems getMenuItemByID(int foodID) {
        return food.get(foodID);
    }

    public static ArrayList<MenuItems> getAllFood() {
        return new ArrayList<MenuItems>((List) Arrays.asList(food.values().toArray()));

    }

    public static final HashMap<Integer, MenuItems> food = new HashMap<>();

    static {

        food.put(1, new MenuItems(1,
                "Cheeseburger",
                "Ingredients:" + "\n" + "beef patty, cheese, pickles, onion, tomato sauce",
                3.99,
                "The signature cheeseburger, with freshly cooked angus beef patty, a melted slice of cheese, delicious tangy pickles, onions and a drizzle of tomato sauce, it is sure to hit the spot ",
                0,
                R.drawable.cheese1));
        food.put(2, new MenuItems(2,
                "Double Cheeseburger",
                "Ingredients:" + "\n" + "beef patty x2, cheese x2, pickles, tomato sauce",
                4.99,
                "The signature cheeseburger for those with a larger appetite, with two freshly cooked angus beef patties, two melted slices of cheese, delicious tangy pickles, onions and a drizzle of tomato sauce, it will satiate your cravings ",
                0,
                R.drawable.cheese2));
        food.put(3, new MenuItems(3,
                "Triple Cheeseburger",
                "Ingredients:" + "\n" + "beef patty x3, cheese x3, pickles, tomato sauce",
                5.99,
                "Dying of hunger? Craving not 1, not 2 but 3 angus beef patties? Look no further, the triple cheeseburger is here. With three freshly cooked angus beef patties, three melted slices of cheese, delicious tangy pickles, onions and a drizzle of tomato sauce, it will leave you absolutely stuffed ",
                0,
                R.drawable.cheese3));
        food.put(4, new MenuItems(4,
                "ChiyoBurger",
                "Ingredients:" + "\n" + "chicken breast, lettuce, tomato, mayonnaise ",
                3.99,
                "The signature chicken and mayo burger, with juicy free range chicken breast, fresh lettuce, tomato and a generous dollop of homemade mayonnaise, it is sure to hit the spot",
                0,
                R.drawable.chiyo));
        food.put(5, new MenuItems(5,
                "Double ChiyoBurger",
                "Ingredients:" + "\n" + "chicken breast x2, lettuce, tomato, mayonnaise ",
                4.99,
                "The signature chicken and mayo burger for those with a larger appetite, with two juicy free range chicken breasts, fresh lettuce, tomatoes and a generous dollop of homemade mayonnaise, it will satiate your cravings",
                0,
                R.drawable.chiyo2));
        food.put(6, new MenuItems(6,
                "Triple ChiyoBurger",
                "Ingredients:" + "\n" + "chicken breast x3, lettuce, tomato, mayonnaise ",
                5.99,
                "Dying of hunger? Craving not 1, not 2 but 3 juicy chicken breasts? Look no further, the triple ChiyoBurger is here. With three juicy free range chicken breasts, fresh lettuce, tomatoes, and a generous dollop of homemade mayonnaise, it will leave you absolutely stuffed",
                0, R.drawable.chiyo3));
        food.put(7, new MenuItems(7,
                "Coleslaw",
                "Ingredients:" + "\n" + "red cabbage, carrots, parsley, mayonnaise, apple cider vinegar",
                4.99,
                "Tired of dreary salad? Want to not compromise taste for healthier food? Our signature coleslaw ticks all these boxes and more! With fresh red cabbage, carrots, parsley, mayonnaise, apple cider vinegar it will make you a fan for life",
                0,
                R.drawable.coleslaw));
        food.put(8, new MenuItems(8,
                "Caesar Salad",
                "Ingredients:" + "\n" + "romaine lettuce, egg, croutons, bacon, mayonnaise",
                4.99,
                "Tired of dreary salad? Want to not compromise taste for healthier food? Our signature caesar salad ticks all these boxes and more! With fresh romaine lettuce, egg, croutons, bacon, mayonnaise it will make you a fan for life",
                0,
                R.drawable.caesar));
        food.put(9, new MenuItems(9,
                "Fries",
                "Ingredients:" + "\n" + "potatoes, salt",
                3.99,
                "Chunky thick cut potato fries, deep fried to perfection in canola oil, sprinkled with our signature chicken salt.",
                0,
                R.drawable.fries));
        food.put(10, new MenuItems(10,
                "Sweet Potato Fries",
                "Ingredients:" + "\n" + "sweet potatoes, salt ",
                3.99,
                "Chunky thick cut sweet potato fries, deep fried to perfection in canola oil, sprinkled with our signature chicken salt",
                0,
                R.drawable.sweetp));
        food.put(11, new MenuItems(11,
                "Coca Cola", "Ingredients:" + "\n" + "real coke",
                2.99, "Real coca cola from the bottle, none of that bootleg stuff. What a steal!",
                0,
                R.drawable.coke));
        food.put(12, new MenuItems(12,
                "Fanta",
                "Ingredients:" + "\n" + "real fanta",
                2.99,
                "Real fanta from the bottle, none of that bootleg stuff. What a steal!",
                0,
                R.drawable.fanta));
        food.put(13, new MenuItems(13,
                "Sprite",
                "Ingredients:" + "\n" + "real sprite",
                2.99,
                "Real sprite from the bottle, none of that bootleg stuff. What a steal!",
                0,
                R.drawable.sprite));
        food.put(14, new MenuItems(14,
                "Regular Fried Chicken",
                "Ingredients:" + "\n" + "beer battered fried chicken",
                5.99, "Some days you just have that fried chicken craving and deserve to treat yourself. Our award winning beer battered fried chicken combines white and dark meat chicken pieces lovingly coated in batter, submerged in canola oil and patted dry, resulting in fragrant, juicy and crispy chicken",
                0,
                R.drawable.fchicken));
        food.put(15, new MenuItems(15,
                "Sweet&Spicy Fried Chicken",
                "Ingredients:" + "\n" + "sweet and spicy fried chicken",
                5.99, "Some days you just have that fried chicken craving and deserve to treat yourself. Our award winning spicy fried chicken combines white and dark meat chicken pieces lovingly coated in batter, submerged in canola oil and patted dry, resulting in fragrant, juicy and crispy chicken slathered in a sweet and spicy glaze",
                0,
                R.drawable.spicy));
    }
}
