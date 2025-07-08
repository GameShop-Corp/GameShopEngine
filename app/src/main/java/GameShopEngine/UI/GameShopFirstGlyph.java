/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameShopEngine.UI;

import GameShopEngine.GameShopPolyLine;
import com.jme3.math.Vector3f;
import org.joml.Vector4f;

/**
 *
 * @author gameshopengine
 */
public class GameShopFirstGlyph extends GameShopGlyph {
    
    public GameShopFirstGlyph(char glyph, int width, int height) {
        super(glyph, width, height);
    }
    
    public void draw(){
    
        if (glyph == 'A'){
        
            GameShopPolyLine cl = new GameShopPolyLine(new Vector3f[]{
            
                new Vector3f(percentage("width", 0), percentage("height", 0), 0),
                new Vector3f(percentage("width", 20), percentage("height", 40), 0),
                new Vector3f(percentage("width", 40), percentage("height", 80), 0),
                new Vector3f(percentage("width", 50), percentage("height", 100), 0),
         
                        
            }, 8);
            layer.drawPolyLine(cl, (short) (percentage("width", 5) + percentage("height", 5)), new Vector4f(0,0,0,255));
        
        
        }
    
    
    }
    
    public float percentage(String axis, float percent){
    
        if (axis.equals("width")){
        
            return (percent/100) *(float) width;
        }
        
        if (axis.equals("height")){
        return (percent/100) * (float)height;
        }
    
        return 0;
    }
    
   
    
}
