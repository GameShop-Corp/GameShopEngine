/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package GameShopEngine.UI;
//
//import GameShopEngine.GameShopATMS;
//import GameShopEngine.GameShopATMSHash;
//import GameShopEngine.GameShopPolyMesh;
//import GameShopEngine.GameShopPolySurface;
//import GameShopEngine.GameShopVertexHash;
//import static org.lwjgl.opengl.GL11.GL_INT;
//import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;
//import static org.lwjgl.opengl.GL11.GL_TRIANGLES;
//import static org.lwjgl.opengl.GL11.GL_TRIANGLE_FAN;
//import static org.lwjgl.opengl.GL11.GL_UNSIGNED_INT;
//import static org.lwjgl.opengl.GL11.GL_UNSIGNED_SHORT;
//import static org.lwjgl.opengl.GL11.glBindTexture;
//import static org.lwjgl.opengl.GL11.glDrawElements;
//import static org.lwjgl.opengl.GL13.GL_TEXTURE0;
//import static org.lwjgl.opengl.GL13.glActiveTexture;
//import static org.lwjgl.opengl.GL30.glBindVertexArray;
//import static org.lwjgl.opengl.GL32.GL_TRIANGLES_ADJACENCY;
//
///**
// *
// * @author lynden
// */
//public class GameShopUIPolyMesh extends GameShopPolyMesh {
//    
//    public GameShopUIATMS uiATMS;
//    
//    public GameShopUIPolyMesh(GameShopPolySurface[] gspSurfaces, GameShopUIATMS uiATMS) {
//        super(gspSurfaces, uiATMS);
//        this.uiATMS = uiATMS;
//       // this.atms = null;
//       System.out.println("PolySurface Length " + gspSurfaces.length);
//    }
//    
//    @Override
//     public void draw(){
//       // assert(GameShopATMSHash.getInstance().atmsHash.get(atms) != null);
//       
//      // System.out.println(atms);
//       glActiveTexture(GL_TEXTURE0);
//       glBindTexture(GL_TEXTURE_2D, GameShopATMSHash.getInstance().atmsHash.get(uiATMS));
//        // Draw the mesh
//    glBindVertexArray(GameShopVertexHash.getInstance().vertexHash.get(this));
//        
//        glDrawElements(GL_TRIANGLES, indices.length,GL_UNSIGNED_INT, 0);
//    
//   
//    }
//}
