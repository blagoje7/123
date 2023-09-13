/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z1;

/**
 *
 * @author Mladen
 */
public class Apple {
    
    public int classify(String color, int mass, int circumference, boolean damage){
        int c = -1;
        String clr = color.toLowerCase();
        if(clr.equals("crvena") && mass > 90 && circumference > 3 && damage == false){
            c = 1;
        }
        else if(clr.equals("crvena") && damage == false && ((mass >= 70 && mass <90) || (circumference >=2 && circumference <=3)) ){
            c = 2;
        }
        else if(((mass >=70 && mass <90) || (circumference >= 2 && circumference <3)) && (damage == true || !clr.equals("crvena"))){
            c = 3;
        }else{
            c = 4;
        }
        
        return c;
    }
    
}
