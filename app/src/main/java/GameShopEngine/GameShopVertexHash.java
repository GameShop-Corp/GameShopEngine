/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameShopEngine;

import java.util.HashMap;
import static org.lwjgl.opengl.GL30.glGenVertexArrays;

/**
 *
 * @author gameshopengine
 */
public class GameShopVertexHash {
    
    private static GameShopVertexHash _instance;
    
    public HashMap<GameShopPolyMesh, Integer> vertexHash;
    
    private GameShopVertexHash(){
    
        vertexHash = new HashMap<GameShopPolyMesh, Integer>();
    }
    
    public static GameShopVertexHash getInstance(){
    
        if (_instance == null){
        
            _instance = new GameShopVertexHash();
        }
        
        return _instance;
    }
    
    public void addVertexArrayObject(GameShopPolyMesh gsp){
    
        vertexHash.put(gsp, glGenVertexArrays());
    }
}
