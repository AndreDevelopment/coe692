/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import helper.Food;
import persistence.FoodCRUD;
import java.util.ArrayList;

/**
 *
 * @author student
 */

public class FoodItems {
    
public ArrayList <Food> foodItems;

public FoodItems(){
    
    FoodCRUD data = new FoodCRUD();
    foodItems = data.getFoodList();
}



public ArrayList<Food> getFoodItems(){
    
    return foodItems;
}


  

    
}
