/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameShopEngine;

import java.util.HashSet;

/**
 *
 * @author gameshopengine
 */
public class GameShopUniformHub {
    
    private static GameShopUniformHub _instance;
    
    HashSet<GameShopUniform> gsUniforms;
    
    private GameShopUniformHub(){
    
        gsUniforms = new HashSet<GameShopUniform>();
    }
    
    public static GameShopUniformHub getInstance(){
    
        if (_instance == null){
        
            _instance = new GameShopUniformHub();
        }
        
        return _instance;
    }
    
    public GameShopUniform get(int shaderProgram){
    
        for (GameShopUniform gsu: gsUniforms){
        
            if (gsu.shaderProgram == shaderProgram){
            
                return gsu;
            }
        }
        
        return null;
    }
    
    
}
