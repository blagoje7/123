/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z2;

/**
 *
 * @author Mladen
 */
public class DeliveryService {
    
    public float calculatePrice(int mass, int packages, int distance, boolean emergency){
        float price = 100;
        float deliveryPrice = 0;
        float massPrice = 0;
        
        float avgMass = mass / packages;
        
        if(avgMass > 200){
            massPrice = 500;
        }else{
            massPrice = 300;
        }
        
        if(distance > 300){
            massPrice = massPrice * 1.5f;
        }
        
        if(emergency){
            massPrice *= 2;
        }
        
        if(distance  < 500){
            deliveryPrice = 200;
        }
        else if(distance >= 500 && distance <= 1000){
            deliveryPrice = 400;
        }
        else{
            deliveryPrice = 600;
        }
        
        if(emergency){
            deliveryPrice *= 2;
        }
        
        price = price + deliveryPrice + massPrice;
        if(price < 600){
            price *= 0.9;
        }
        
        if(price > 3000){
            price *= 0.8;
        }
        
        return price;
    }
    
}
