/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameShopEngine.UI;

import GameShopEngine.GameShopLayer;

/**
 *
 * @author gameshopengine
 */
public class GameShopGlyph {
    
    public char glyph;
    public int width;
    public int height;
    public GameShopLayer layer;
    
    public GameShopGlyph(char glyph, int width, int height){
    
        this.glyph = glyph;
        this.width = width;
        this.height = height;
        layer = new GameShopLayer(width, height);
    }
    
    
}
