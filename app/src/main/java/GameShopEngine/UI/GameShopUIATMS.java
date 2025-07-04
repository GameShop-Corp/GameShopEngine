/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package GameShopEngine.UI;
//
//import GameShopEngine.GameShopATMS;
//import GameShopEngine.GameShopATMSHash;
//import GameShopEngine.GameShopPolyLine;
//import GameShopEngine.LanguageProcessor.GameShopLanguageProcessor;
//import GameShopEngine.UI.Components.GameShopUIComponent;
//import com.jme3.math.Vector4f;
//import java.nio.ByteBuffer;
//import java.util.ArrayList;
//import java.util.Arrays;
//import org.joml.Vector2f;
//import org.lwjgl.BufferUtils;
//import static org.lwjgl.opengl.GL11.GL_BYTE;
//import static org.lwjgl.opengl.GL11.GL_FLOAT;
//import static org.lwjgl.opengl.GL11.GL_NEAREST;
//import static org.lwjgl.opengl.GL11.GL_RGBA;
//import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;
//import static org.lwjgl.opengl.GL11.GL_TEXTURE_MAG_FILTER;
//import static org.lwjgl.opengl.GL11.GL_TEXTURE_MIN_FILTER;
//import static org.lwjgl.opengl.GL11.GL_UNPACK_ALIGNMENT;
//import static org.lwjgl.opengl.GL11.glBindTexture;
//import static org.lwjgl.opengl.GL11.glPixelStorei;
//import static org.lwjgl.opengl.GL11.glTexImage2D;
//import static org.lwjgl.opengl.GL11.glTexParameteri;
//import static org.lwjgl.opengl.GL30.glGenerateMipmap;
//
///**
// *
// * @author lynden
// */
//public class GameShopUIATMS extends GameShopATMS {
//    
//    public GameShopUIComponent[] components;
//    public GameShopUILayer uiLayer;
//    
//    public GameShopUIATMS(int width, int height, Vector4f[] textureSamples) {
//        super(width, height, textureSamples);
//        
//        components = new GameShopUIComponent[1];
//        uiLayer = new GameShopUILayer(width, height);
//         gslp = new GameShopLanguageProcessor[1];
//      //  this.
//    }
//    
//    public void addGameShopComponents(int index, GameShopUIComponent[] components){
//    
//       // public void addDrawCalls(int index, String[] drawCalls){
//
//        boolean start = this.components[0] != null;
//
//        ArrayList<GameShopUIComponent> newGSRs = new ArrayList<>(Arrays.asList(components));
//
//        ArrayList<GameShopUIComponent> oldGSRs = null;
//
//        if (start) {
//            oldGSRs = new ArrayList<>(Arrays.asList(this.components));
//        }
//
//        ArrayList<GameShopUIComponent> lowerGSRs = new ArrayList<>();
//
//        ArrayList<GameShopUIComponent> higherGSRs = new ArrayList<>();
//
//        if (start) {
//            for (int i = 0; i < index; i++) {
//                lowerGSRs.add(oldGSRs.get(i));
//            }
//
//            for (int i = index; i < oldGSRs.size(); i++) {
//                higherGSRs.add(oldGSRs.get(i));
//            }
//            this.components = new GameShopUIComponent[(oldGSRs.size()) + (newGSRs.size())];
//
//        } else {
//            this.components = new GameShopUIComponent[newGSRs.size()];
//        }
//
//
//
//        int i = 0;
//        if (start) {
//            for (GameShopUIComponent dc : lowerGSRs) {
//
//
//                this.components[i] = dc;
//                i++;
//            }
//        }
////        System.out.println(Arrays.toString(oldDrawCalls.toArray()));
//  //      System.out.println(Arrays.toString(newDrawCalls.toArray()));
//
//        for (GameShopUIComponent dc: newGSRs){
//
//            this.components[i] = dc;
//            i++;
//        }
//
//        if (start) {
//            for (GameShopUIComponent dc : higherGSRs) {
//
//                this.components[i] = dc;
//                i++;
//            }
//        }
//        //newDrawCalls.addAll(index, drawCalls);
//        //        String[] temp = new String[this.drawCalls.length];
////
////        int i = 0;
////        for (String dc: this.drawCalls){
////
////            temp[i] = dc;
////            i++;
////        }
////
////        this.drawCalls = new String[(this.drawCalls.length) + drawCalls.length];
////
////        System.out.println("dc " + this.drawCalls.length);
//////        i = 0;
//////        int j = 0;
////
////        for (i = 0; i < index; i++){
////
////            this.drawCalls[i] = temp[i];
////        }
////
////        for (i = index; i < index + drawCalls.length; i++){
////
////            this.drawCalls[i] = drawCalls[i - index];
////        }
////
////        for (i = index + drawCalls.length; i < this.drawCalls.length; i++){
////
////            this.drawCalls[i] = temp[i - (drawCalls.length)];
////        }
//
//   // }
//    }
//    
//    
//    @Override
//       public void makeATMS(String name){
//     //textureId = glGenTextures();
//
//     
//     ByteBuffer pixels = BufferUtils.createByteBuffer(uiLayer.outputLayer().length);
//     pixels.put(uiLayer.outputLayer());
//     pixels.flip();
//     GameShopATMSHash.getInstance().addATMS(this);
//        glBindTexture(GL_TEXTURE_2D, GameShopATMSHash.getInstance().atmsHash.get(this));
//        glPixelStorei(GL_UNPACK_ALIGNMENT, 1);
//        glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
//        glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
//       // glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, width, height, 0,
//       //         GL_RGBA, GL_FLOAT, uiLayer.outputLayer());
//        glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, width, height, 0,
//                GL_RGBA, GL_BYTE, pixels );
//        glGenerateMipmap(GL_TEXTURE_2D);
//        //assert (GameShopATMSHash.getInstance().atmsHash.get(this) != null);
//    }
//    
//    public void onClick (Vector2f clickPos){
//    
//        for (GameShopUIComponent ui: components){
//        
//            ui.onClick(clickPos);
//        }
//    }
//    
//    public void render(){
//     for (GameShopUIComponent ui: components){
//        
//            ui.render();
//        }
//    }
//    
//    @Override
//    public void process(){
//       
//           for (GameShopLanguageProcessor gs: this.gslp){
//           
//               //gs.process();
//               if (gs.methodName.equals("drawCircle")){
//               
//                   String[] color = gs.parseArg(gs.args[3]);
//                   this.uiLayer.drawCircle(Integer.parseInt(gs.args[0].trim()), Integer.parseInt(gs.args[1].trim()), Integer.parseInt(gs.args[2].trim()),  (new org.joml.Vector4f(Float.parseFloat(color[0].trim()), Float.parseFloat(color[1].trim()), Float.parseFloat(color[2].trim()), Float.parseFloat(color[3].trim()))));
//               }
//                  else if (gs.methodName.equals("drawSquare")){
//               
//                   String[] color = gs.parseArg(gs.args[3]);
//                   this.uiLayer.drawSquare(Integer.parseInt(gs.args[0].trim()), Integer.parseInt(gs.args[1].trim()), Integer.parseInt(gs.args[2].trim()),  (new org.joml.Vector4f(Float.parseFloat(color[0].trim()), Float.parseFloat(color[1].trim()), Float.parseFloat(color[2].trim()), Float.parseFloat(color[3].trim()))));
//               }
//               
//                else if (gs.methodName.equals("drawRectangle")){
//                    String[] start = gs.parseArg(gs.args[0]);
//                    String[] end = gs.parseArg(gs.args[1]);
//                    String[] color = gs.parseArg(gs.args[2]);
//                    
//                    this.uiLayer.drawRectangle(new Vector2f(Integer.parseInt(start[0].trim()), Integer.parseInt(start[1].trim())), new Vector2f(Integer.parseInt(end[0].trim()), Integer.parseInt(end[1].trim())), new org.joml.Vector4f(Float.parseFloat(color[0].trim()), Float.parseFloat(color[1].trim()), Float.parseFloat(color[2].trim()), Float.parseFloat(color[3].trim())));
//               }
//               
//               else if (gs.methodName.equals("drawLine")){
//               
//                   String[] pointA = gs.parseArg(gs.args[0]);
//                   String[] pointB = gs.parseArg(gs.args[1]);
//                   String radius = gs.args[2];
//                   String[] color = gs.parseArg(gs.args[3]);
//                   
//                   pointA[0] = pointA[0].replace("[", "");
//                   pointA[1] = pointA[1].replace("]", "");
//                   pointB[0] = pointB[0].replace("[", "");
//                   pointB[1] = pointB[1].replace("]", "");
//                   radius = radius.replace("[", "");
//                   radius = radius.replace("]", "");
//                       
//                   color[0] = color[0].replace("[", "");
//                   color[0] = color[0].replace("]", "");
//                   color[1] = color[1].replace("[", "");
//                   color[1] = color[1].replace("]", "");
//                   color[2] = color[2].replace("[", "");
//                   color[2] = color[2].replace("]", "");
//                   color[3] = color[3].replace("[", "");
//                   color[3] = color[3].replace("]", "");
//                  // radius[1] = radius[1].replace("]", "");
////                   pointA[0] =  (pointA[0]);
////                   pointA[1] = gs.evaluate(pointA[1]);
////                   pointB[0] = gs.evaluate(pointB[0]);
////                   pointB[1] = gs.evaluate(pointB[1]);
////                   radius = gs.evaluate(radius);
////                   color[0] = gs.evaluate(color[0]);
////                   color[1] = gs.evaluate(color[1]);
////                  color[2] = gs.evaluate(color[2]);
////                  color[3] = gs.evaluate(color[3]);
//                  
//                    
//                   this.uiLayer.drawLine(new Vector2f(Integer.parseInt(pointA[0].trim()), Integer.parseInt(pointA[1].trim())), new Vector2f(Integer.parseInt(pointB[0].trim()), Integer.parseInt(pointB[1].trim())), (short)Short.parseShort(radius.trim()), new org.joml.Vector4f(Float.parseFloat(color[0].trim()), Float.parseFloat(color[1].trim()), Float.parseFloat(color[2].trim()), Float.parseFloat(color[3].trim())));
//               } 
//               
//               else if (gs.methodName.equals("drawPolyLine")) {
//               
//                   String[] line = gs.parseArg(gs.args[0]);
//                   String[] line1 = gs.parseArg(gs.args[1]);
//                   String[] line2 = gs.parseArg(gs.args[2]);
//                   String[] line3 = gs.parseArg(gs.args[3]);
//                   String radius = gs.args[4];
//                   String[] color = gs.parseArg(gs.args[5]);
//                   
//                   line[0] = line[0].replace("[", "");
//                   line[0] = line[0].replace("]", "");
//                                      
//                   line[1] = line[1].replace("[", "");
//                   line[1] = line[1].replace("]", "");
//                                      
//                   line[2] = line[2].replace("[", "");
//                   line[2] = line[2].replace("]", "");
//                                      
//                   line1[0] = line1[0].replace("[", "");
//                   line1[0] = line1[0].replace("]", "");
//                                      
//                   line1[1] = line1[1].replace("[", "");
//                   line1[1] = line1[1].replace("]", "");
//                                      
//                   line1[2] = line1[2].replace("[", "");
//                   line1[2] = line1[2].replace("]", "");
//                                   
//                   line2[0] = line2[0].replace("[", "");
//                   line2[0] = line2[0].replace("]", "");
//                        
//                   line2[1] = line2[1].replace("[", "");
//                   line2[1] = line2[1].replace("]", "");
//                                     
//                   line2[2] = line2[2].replace("[", "");
//                   line2[2] = line2[2].replace("]", "");
//                          
//                   line3[0] = line3[0].replace("[", "");
//                   line3[0] = line3[0].replace("]", "");
//                        
//                   line3[1] = line3[1].replace("[", "");
//                   line3[1] = line3[1].replace("]", "");
//                                     
//                   line3[2] = line3[2].replace("[", "");
//                   line3[2] = line3[2].replace("]", "");
//                   
//                   radius = radius.replace("[", "");
//                   radius = radius.replace("]", "");
//                   
//                   color[0] = color[0].replace("[", "");
//                   color[0] = color[0].replace("]", "");
//                   
//                   color[1] = color[1].replace("[", "");
//                   color[1] = color[1].replace("]", "");
//                   
//                   color[2] = color[2].replace("[", "");
//                   color[2] = color[2].replace("]", "");
//                   
//                   color[3] = color[3].replace("[", "");
//                   color[3] = color[3].replace("]", "");
////                   line[0] = gs.evaluate(line[0]);
////                   line[1] = gs.evaluate(line[1]);
////                   line[2] = gs.evaluate(line[2]);
////                   line1[0] = gs.evaluate(line1[0]);
////                   line1[1] = gs.evaluate(line1[1]);
////                   line1[2] = gs.evaluate(line1[2]);
////                   line2[0] = gs.evaluate(line2[0]);
////                   line2[1] = gs.evaluate(line2[1]);
////                   line2[2] = gs.evaluate(line2[2]);
////                   line3[0] = gs.evaluate(line3[0]);
////                   line3[1] = gs.evaluate(line3[1]);
////                   line3[2] = gs.evaluate(line3[2]);
////                   radius = gs.evaluate(radius);
////                   color[0] = gs.evaluate(color[0]);
////                   color[1] = gs.evaluate(color[1]);
////                   color[2] = gs.evaluate(color[2]);
////                   color[3] = gs.evaluate(color[3]);
//                    //line[0] = gs.evaluate(line[0]);
//                    
//                   
//                   
//                   GameShopPolyLine cl = new GameShopPolyLine(new com.jme3.math.Vector3f[] {
//                   
//                       new com.jme3.math.Vector3f(Float.parseFloat(line[0].trim()), Float.parseFloat(line[1].trim()),Float.parseFloat(line[2].trim())),
//                       new com.jme3.math.Vector3f(Float.parseFloat(line1[0].trim()), Float.parseFloat(line1[1].trim()),Float.parseFloat(line1[2].trim())),
//                       new com.jme3.math.Vector3f(Float.parseFloat(line2[0].trim()), Float.parseFloat(line2[1].trim()),Float.parseFloat(line2[2].trim())),
//                       new com.jme3.math.Vector3f(Float.parseFloat(line3[0].trim()), Float.parseFloat(line3[1].trim()),Float.parseFloat(line3[2].trim()))
//                           
//                   }, 16);
//                   
//                   org.joml.Vector4f colour = new org.joml.Vector4f(Float.parseFloat(color[0].trim()), Float.parseFloat(color[1].trim()), Float.parseFloat(color[2].trim()), Float.parseFloat(color[3].trim()));
//                   this.uiLayer.drawPolyLine(cl, Short.parseShort(radius.trim()), colour);
//           
//               }
//           
//           makeATMS();
//       }
//           
//    }
//}
