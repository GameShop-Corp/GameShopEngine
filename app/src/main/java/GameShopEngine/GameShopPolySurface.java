/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameShopEngine;

import com.jme3.math.Vector3f;
import org.joml.Vector2f;
//import org.joml.Vector3f;

/**
 *
 * @author chrx
 */
public class GameShopPolySurface {
    
    
    public GameShopPolyLine[] polyLines;
    public GameShopPolyLine[] vInfinitesimals;
    
    public float width;
    public float height;
    
    public float infWidth;
    public float infHeight;
    
    public GameShopPolySurface(GameShopPolyLine[] polyLines){
        
        this.polyLines = polyLines;
        makeVerticalLines();
        
    
    }
    
    public int getTotalVertices(){
    
          // for (GameShopPolySurface gsps: this.gspSurfaces){
        
           // totalVertices += gsps.vInfinitesimals[0].infinitesimals.length * 4;
        
           int totalVertices = 0;
           
           for (GameShopPolyLine vi: vInfinitesimals){
           
               totalVertices += vi.infinitesimals.length;
           }
        
           infWidth = vInfinitesimals[0].infinitesimals.length;
           infHeight = vInfinitesimals.length;
           return totalVertices;
    }
    
    public void makeVerticalLines(){
//     this.dim = 3;
//
        width = (polyLines[0].points[polyLines[0].points.length - 1].x - polyLines[0].points[0].x);
        height = (polyLines[polyLines.length - 1].points[0].y - polyLines[0].points[0].y);
        this.vInfinitesimals = new GameShopPolyLine[polyLines[0].infinitesimals.length];

        for (int i = 0; i < this.vInfinitesimals.length; i++){

            this.vInfinitesimals[i] = new GameShopPolyLine(new Vector3f[]{polyLines[0].infinitesimals[i], polyLines[1].infinitesimals[i], polyLines[2].infinitesimals[i], polyLines[3].infinitesimals[i]}, 16);

        }
    }
 
}