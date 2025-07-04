/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameShopEngine.PolyHash;

import GameShopEngine.GameShopObject;
import java.util.HashMap;

/**
 *
 * @author gameshopengine
 */
public class GameShopObjectHash {
    
    private static GameShopObjectHash _instance;
    
    public HashMap <String, GameShopObject> objectHash;
    
    private GameShopObjectHash(){
    
        objectHash = new HashMap<String, GameShopObject>();
    }
    
    public static GameShopObjectHash getInstance(){
    
        if (_instance == null){
        
            _instance = new GameShopObjectHash();
        }
        
        return _instance;
    }
    
    public String addGameShopObject(String name, GameShopObject gso){
    
        for (String s: objectHash.keySet()){
        
            if (s.contains(name)){
            
                return "Declined - Name Already Taken";
            }
        }
        
        objectHash.put(name, gso);
        return "Accepted";
    }
}
