package com.makus.icecream;

/*
 Created by Karen on 15/12/2016.
 strawberry=7000
 oreo=5000
 chocochips=4000
 */

public class Bungkus extends IceCream {
    private int bungkus;

    public Bungkus(){
        super();
        this.bungkus=0;
    }
    public Bungkus(int rasa, int topping, int bungkus){
        super(rasa,topping);
        this.bungkus=bungkus;
    }

    void setBungkus(int topping){
        this.bungkus=bungkus;
    }

    int getBungkus(){
        return bungkus;
    }

    public int bayarIceCream(){
        return super.bayarIceCream()+bungkus;
    }
}
