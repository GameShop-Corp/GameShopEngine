/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameShopEngine;

import java.util.HashMap;
import static org.lwjgl.opengl.GL15.glGenBuffers;

/**
 *
 * @author gameshopengine
 */
public class GameShopTextureCoordsHash {
    
    private static GameShopTextureCoordsHash _instance;
    
    public HashMap<GameShopPolyMesh, Integer> textureCoordsHash;
    private GameShopTextureCoordsHash(){
    
        textureCoordsHash = new HashMap<GameShopPolyMesh, Integer>();
    }
    
    public static GameShopTextureCoordsHash getInstance(){
    
        if (_instance == null){
        
            _instance = new GameShopTextureCoordsHash();
        }
        
        return _instance;
    }
    
    public void addPoly(GameShopPolyMesh gsp){
    
        textureCoordsHash.put(gsp, glGenBuffers());
    }
}
