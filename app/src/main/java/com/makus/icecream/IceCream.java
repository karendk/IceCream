package com.makus.icecream;

/*
 Created by Karen on 15/12/2016.
 bungkus=2000
 small=12000
 jumbo=20000
 */

public class IceCream {
    private int rasa,topping;

    public IceCream(){
        this.rasa=0;
        this.topping=0;
    }
    public IceCream(int rasa){

        this.rasa=rasa;
    }
    public IceCream(int rasa, int topping){
        this.rasa=rasa;
        this.topping=topping;
    }

    void setRasa(int rasa){

        this.rasa=rasa;
    }

    void setTopping(int topping){

        this.topping=topping;
    }

    int getTopping(){

        return topping;
    }
    int getRasa(){

        return rasa;
    }

    int bayarIceCream(){
        return rasa+topping;
    }
}
