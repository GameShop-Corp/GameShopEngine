/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameShopEngine.PolyHash;

import GameShopEngine.GameShopPolyMesh;
import java.util.HashMap;

/**
 *
 * @author gameshopengine
 */
public class GameShopPolyMeshHash {
    
    private static GameShopPolyMeshHash _instance;
    
    public HashMap <String, GameShopPolyMesh> polyMeshHash;
    
    private GameShopPolyMeshHash(){
    
        polyMeshHash = new HashMap <String, GameShopPolyMesh>();
        
        
       
    }
    
    public static GameShopPolyMeshHash getInstance(){
    
        if (_instance == null){
        
            _instance = new GameShopPolyMeshHash();
        }
        
        return _instance;
    }
    
    public String addGameShopPolyMesh(String name, GameShopPolyMesh gspm){
    
        for (String s: polyMeshHash.keySet()){
        
            if (s.contains(name)){
            
                return "Declined - Name Already Taken";
            }
        }
        
        polyMeshHash.put(name, gspm);
        return "Accepted";
        
    }
}
