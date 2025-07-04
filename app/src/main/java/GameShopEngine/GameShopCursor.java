/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameShopEngine;

import org.joml.Vector2f;

/**
 *
 * @author gameshopengine
 */
public class GameShopCursor {
    
    public Vector2f screenSize;
    public Vector2f cursorPosition;
    public Vector2f glPosition;
    
    public Vector2f vidModeSize;
    public Vector2f finalSize;
    
    public boolean clicked;
    
    
    private static GameShopCursor _instance;
    
    private GameShopCursor(){
    
        screenSize = new Vector2f();
        cursorPosition = new Vector2f();
        glPosition = new Vector2f();
        vidModeSize = new Vector2f();
        finalSize = new Vector2f();
    }
    
    public static GameShopCursor getInstance(){
    
        if (_instance == null){
        
            _instance = new GameShopCursor();
        }
        return _instance;
    }
    
//    public void setScreenSize(float x, float y){
//    
//        screenSize.set(x, y);
//        
//    }
//    
//    public void setCursorPosition(float x, float y){
//    
//        cursorPosition.set(x, y);
//    }
    
    public void convertToGLPosition(){
    
        glPosition.set((((-(screenSize.x)/2) + cursorPosition.x)/screenSize.x) * 2,-(((-(screenSize.y)/2) + cursorPosition.y)/screenSize.y) * 2);
       //glPosition.set(((cursorPosition.x/screenSize.x) * 2) - 1f, 1f - ((cursorPosition.y/screenSize.y)) * 2);
    }
    
//    public void initFinalSize(){
//    
//        finalSize.set(0, 0)
//    }
//    public void onClick(){
//    
//        clicked = true;
//    }
    
}
