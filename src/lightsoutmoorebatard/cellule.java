/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoutmoorebatard;

/**
 *
 * @author Administrateur
 */
public class cellule {
    private boolean allumer;
    
    
    public cellule(){
        allumer = false;
    }
    
    public boolean isOn(){
        return allumer;
    }
    
    public void turnOn(){
        allumer = true;
    }
    public void turnOff(){
        allumer = false;
    }
    
    public void changeState(){
        if(allumer){
          allumer = false;  
        }
        else{
            allumer = true;
        }
    }
    
    
}
