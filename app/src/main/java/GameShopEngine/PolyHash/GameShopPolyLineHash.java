/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameShopEngine.PolyHash;

import GameShopEngine.GameShopPolyLine;
import java.util.HashMap;

/**
 *
 * @author gameshopengine
 */
public class GameShopPolyLineHash {
    
        private static GameShopPolyLineHash _instance;

    public HashMap<String, GameShopPolyLine> polyLineHash;

    private GameShopPolyLineHash() {

        polyLineHash = new HashMap<String, GameShopPolyLine>();

    }

    /////
    public static GameShopPolyLineHash getInstance() {

        if (_instance == null) {

            _instance = new GameShopPolyLineHash();
        }

        return _instance;
    }

    public String addGameShopPolyLine(String name, GameShopPolyLine gspm) {

        for (String s : polyLineHash.keySet()) {

            if (s.contains(name)) {

                return "Declined - Name Already Taken";
            }
        }

        polyLineHash.put(name, gspm);
        return "Accepted";

    }
    
}
