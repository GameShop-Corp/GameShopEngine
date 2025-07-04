/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameShopEngine;

import java.util.HashMap;

/**
 *
 * @author gameshopengine
 */
public class GameShopCameraHub {
    
    private static GameShopCameraHub _instance;
    
    public HashMap<String, GameShopCamera> gsCameras;
    
    private GameShopCameraHub(){
    
        gsCameras = new HashMap<String, GameShopCamera>();
    }
    
    public static GameShopCameraHub getInstance(){
    
        if (_instance == null){
        
            _instance = new GameShopCameraHub();
        }
        
        return _instance;
    }
    
    
}
