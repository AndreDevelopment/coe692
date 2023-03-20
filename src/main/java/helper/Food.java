/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

/**
 *
 * @author student
 */
public class Food {
    
    
    public String name; 
    public String imgPath,groupID;
    public float price; 
    public int stock;
    
    public  boolean vegetarian,chefsChoice;
    
    public Food(String name,String imgPath,float price,boolean vegetarian,boolean chefsChoice,int stock,String groupID){
        
       this.name = name;
       this.imgPath = imgPath;
       this.price = price;
       this.vegetarian = vegetarian;
       this.chefsChoice = chefsChoice;
       this.stock = stock;
       this.groupID = groupID;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public boolean isChefsChoice() {
        return chefsChoice;
    }

    public void setChefsChoice(boolean chefsChoice) {
        this.chefsChoice = chefsChoice;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" + "name=" + name + ", imgPath=" + imgPath + ", groupID=" + groupID + ", price=" + price + ", stock=" + stock + ", vegetarian=" + vegetarian + ", chefsChoice=" + chefsChoice + '}';
    }
    
    
}