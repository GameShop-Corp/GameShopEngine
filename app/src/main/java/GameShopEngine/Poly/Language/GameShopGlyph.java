/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameShopEngine.Poly.Language;

import GameShopEngine.GameShopATMS;
import GameShopEngine.GameShopPolyMesh;
import GameShopEngine.GameShopPolySurface;
import org.joml.Vector2f;
import org.joml.Vector4f;

/**
 *
 * @author gameshopengine
 */
public class GameShopGlyph extends GameShopPolyMesh {
    
    public char character;
    public Vector4f fontColor;
    
    public GameShopGlyph(GameShopPolySurface[] gspSurfaces, GameShopATMS atms, char character, Vector4f fontColor) {
        super(gspSurfaces, atms);
        
        this.character = character;
        this.fontColor = fontColor;
    
        process();
    }
    
    public void process(){
    
        switch (this.character){
        
            case 'A':
                this.atms.layer.drawLine(new Vector2f(0,0), new Vector2f(this.atms.width / 2, this.atms.height), (short)1, fontColor);
                this.atms.layer.drawLine(new Vector2f(this.atms.width / 4, this.atms.height/2), new Vector2f((this.atms.width * 3) / 4, this.atms.height/2), (short)1, fontColor);
                this.atms.layer.drawLine(new Vector2f(this.atms.width / 2, this.atms.height), new Vector2f(this.atms.width, 0), (short)1, fontColor);
                
                break;
            case 'a':
                break;
            case 'B':
                break;
            case 'b':
                break;
            case 'C':
                break;
            case 'c':
                break;
            case 'D':
                break;
            case 'd':
                break;
            case 'E':
                break;
            case 'e':
                break;
            case 'F':
                break;
            case 'f':
                break;
            case 'G':
                break;
            case 'g':
                break;
            case 'H':
                break;
            case 'h':
                break;
            case 'I':
                break;
            case 'i':
                break;
            case 'J':
                break;
            case 'j':
                break;
            case 'K':
                break;
            case 'k':
                break;
            case 'L':
                break;
            case 'l':
                break;
            case 'M':
                break;
            case 'm':
                break;
            case 'N':
                break;
            case 'n':
                break;
            case 'O':
                break;
            case 'o':
                break;
            case 'P':
                break;
            case 'p':
                break;
            case 'Q':
                break;
            case 'q':
                break;
            case 'R':
                break;
            case 'r':
                break;
            case 'S':
                break;
            case 's':
                break;
            case 'T':
                break;
            case 't':
                break;
            case 'U':
                break;
            case 'u':
                break;
            case 'V':
                break;
            case 'v':
                break;
            case 'W':
                break;
            case 'w':
                break;
            case 'X':
                break;
            case 'x':
                break;
            case 'Y':
                break;
            case 'y':
                break;
            case 'Z':
                break;
            case 'z':
                break;
            case '0':
                break;
            case '1':
                break;
            case '2':
                break;
            case '3':
                break;
            case '4':
                break;
            case '5':
                break;
            case '6':
                break;
            case '7':
                break;
            case '8':
                break;
            case '9':
                break;
            case '`':
                break;
            case '~':
                break;
            case '!':
                break;
            case '@':
                break;
            case '#':
                break;
            case '$':
                break;
            case '%':
                break;
            case '^':
                break;
            case '&':
                break;
            case '*':
                break;
            case '(':
                break;
            case ')':
                break;
            case '-':
                break;
            case '_':
                break;
            case '+':
                break;
            case '=':
                break;
            case '{':
                break;
            case '}':
                break;
            case '[':
                break;
            case ']':
                break;
            case '\\':
                break;
            case '|':
                break;
            case ':':
                break;
            case ';':
                break;
            case '\'':
                break;
            case '"':
                break;
            case '<':
                break;
            case '>':
                break;
            case ',':
                break;
            case '.':
                break;
            case '/':
                break;
            case '?':
                break;
                    
                    
                    
                    
                   
                       
                
               
               
                      
        }
    }
    
    
}
