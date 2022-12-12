package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int res;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
    }

    public int getPrice(){
        if (isVeg) {
            price = 300;
            res = price;
            return this.price;
        }else {
            price = 400;
            res = price;
            return this.price;
        }
    }

    public void addExtraCheese(){
        // your code goes here
        res = res + 80;
        System.out.println("Extra Cheese Added: 80");
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            res = res + 70;
            System.out.println("Extra Toppings Added: 70");
        }else{
            res = res + 120;
            System.out.println("Extra Toppings Added: 120");
        }
    }

    public void addTakeaway(){
        // your code goes here
        res = res + 20;
        System.out.println("Paperbag Added: 20");
    }

    public String getBill(){
        // your code goes here
        bill = Integer.toString(res);
        return this.bill;
    }
}
