/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package GameShopEngine.UI.Characters;
//
////import GameShopEngine.LanguageProcessor.Vector2f;
//import GameShopEngine.UI.Components.GameShopUIComponent;
//import GameShopEngine.UI.WordProcessor.GameShopWordProcessor;
//import java.util.ArrayList;
//import java.util.Arrays;
//import org.joml.Vector2f;
//
///**
// *
// * @author lynden
// */
//public class GameShopCharacterCursor {
//    
//    public Vector2f[] position;
//    public GameShopUIComponent uic;
//    
//    
//    public GameShopCharacterCursor(GameShopUIComponent uic){
//    
//        this.position = new Vector2f[1];
//        //this.uic = new GameShopUIComponent();
//        this.uic = uic;
//    }
//    
//    public void setStartPosition(GameShopWordProcessor gswp){
//    
//        this.addPosition(0, new Vector2f[]{new Vector2f(uic.position.x, (uic.position.y + uic.size.y) - gswp.fontSize)});
//        //this.addPosition(0, new Vector2f[]{new Vector2f(this.position[0].x, this.position[0].y - 5f)});
//    }
//    
//       public void addPosition(int index, Vector2f[] position){
//    
//       // public void addDrawCalls(int index, String[] drawCalls){
//
//        boolean start = this.position[0] != null;
//
//        ArrayList<Vector2f> newGSRs = new ArrayList<>(Arrays.asList(position));
//
//        ArrayList<Vector2f> oldGSRs = null;
//
//        if (start) {
//            oldGSRs = new ArrayList<>(Arrays.asList(this.position));
//        }
//
//        ArrayList<Vector2f> lowerGSRs = new ArrayList<>();
//
//        ArrayList<Vector2f> higherGSRs = new ArrayList<>();
//
//        if (start) {
//            for (int i = 0; i < index; i++) {
//                lowerGSRs.add(oldGSRs.get(i));
//            }
//
//            for (int i = index; i < oldGSRs.size(); i++) {
//                higherGSRs.add(oldGSRs.get(i));
//            }
//            this.position = new Vector2f[(oldGSRs.size()) + (newGSRs.size())];
//
//        } else {
//            this.position = new Vector2f[newGSRs.size()];
//        }
//
//
//
//        int i = 0;
//        if (start) {
//            for (Vector2f dc : lowerGSRs) {
//
//
//                this.position[i] = dc;
//                i++;
//            }
//        }
////        System.out.println(Arrays.toString(oldDrawCalls.toArray()));
//  //      System.out.println(Arrays.toString(newDrawCalls.toArray()));
//
//        for (Vector2f dc: newGSRs){
//
//            this.position[i] = dc;
//            i++;
//        }
//
//        if (start) {
//            for (Vector2f dc : higherGSRs) {
//
//                this.position[i] = dc;
//                i++;
//            }
//        }
//     
//    }
////    @Override
////     public GameShopCharacterCursor clone(){
////     
////         GameShopCharacterCursor clone = new GameShopCharacterCursor(this.uic, new Vector2f(this.position));
////         //clone.position = new Vector2f(this.position);
////         return clone;
////     }
//}
