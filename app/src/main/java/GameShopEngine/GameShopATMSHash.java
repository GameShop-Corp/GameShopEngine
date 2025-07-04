/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameShopEngine;

import java.util.HashMap;
import static org.lwjgl.opengl.GL11.glGenTextures;

/**
 *
 * @author gameshopengine
 */
public class GameShopATMSHash {
    
    private static GameShopATMSHash _instance;
    
    public HashMap<GameShopATMS, Integer> atmsHash;
    public HashMap<String, GameShopATMS> dictionary;
    private GameShopATMSHash(){
    
        atmsHash = new HashMap<GameShopATMS, Integer>();
        dictionary = new HashMap<String, GameShopATMS>();
    }
    
    public static GameShopATMSHash getInstance(){
    
        if (_instance == null){
        
            _instance = new GameShopATMSHash();
        }
        return _instance;
    }
    
    public void addATMS(String name, GameShopATMS atms){
    
        //String retVal = Integer.toString(glGenTextures());
        atmsHash.put(atms, glGenTextures());
        dictionary.put(name, atms);
        //return retVal;
        //System.out.println(atmsHash.keySet().toString());
        //System.out.println(atmsHash.values().toString());
    }
}
