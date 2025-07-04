/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameShopEngine.PolyHash;

import GameShopEngine.GameShopPolySurface;
import java.util.HashMap;

/**
 *
 * @author gameshopengine
 */
public class GameShopPolySurfaceHash {
    
    private static GameShopPolySurfaceHash _instance;
    
    public HashMap <String, GameShopPolySurface> polySurfaceHash;
    
    private GameShopPolySurfaceHash(){
    
        polySurfaceHash = new HashMap <String, GameShopPolySurface>();
        
    }
 
    
    
    public static GameShopPolySurfaceHash getInstance(){
    
        if (_instance == null){
        
            _instance = new GameShopPolySurfaceHash();
        }
        
        return _instance;
    }
    
    public String addGameShopPolySurface(String name, GameShopPolySurface gspm){
    
        for (String s: polySurfaceHash.keySet()){
        
            if (s.contains(name)){
            
                return "Declined - Name Already Taken";
            }
        }
        
        polySurfaceHash.put(name, gspm);
        return "Accepted";
        
    }
    
}
