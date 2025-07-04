/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package GameShopEngine.UI.Characters;
//
//import GameShopEngine.GameShopCursor;
//import GameShopEngine.LanguageProcessor.GameShopLanguageProcessor;
//import GameShopEngine.UI.Components.GameShopUIComponent;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//
///**
// *
// * @author lynden
// */
//public class GameShopCharacter {
//    
//    public String font;
//    public char character;
//    public float fontSize;
//    //public GameShopCharacterContainer cc;
//    //public GameShopUIComponent uic;
//    //HashMap<FONT, HashMap<CHARACTER, GAMESHOPLANGUAGEPROCESSOR[]>
//    
//    //
//    
//    public GameShopLanguageProcessor[] gslp;
//    public GameShopCharacterCursor gsc;
//    
//    public GameShopCharacter(String font, float fontSize, char character, GameShopCharacterCursor gscc){//GameShopUIComponent uic){
//    
//        this.font = font;
//        this.character = character;
//        this.fontSize = fontSize;
//        //this.drawCalls = new HashMap<>();
//        //this.uic = uic;
//        this.gsc = gscc;
////        
//        this.gslp = new GameShopLanguageProcessor[1];
//    }
//    
//    public void drawCharacter(){
//    
//        
//    }
//    
//     public void addGameShopLanguageProcessors(int index, GameShopLanguageProcessor[] gslp){
//    
//       // public void addDrawCalls(int index, String[] drawCalls){
//
//        boolean start = this.gslp[0] != null;
//
//        ArrayList<GameShopLanguageProcessor> newGSRs = new ArrayList<>(Arrays.asList(gslp));
//
//        ArrayList<GameShopLanguageProcessor> oldGSRs = null;
//
//        if (start) {
//            oldGSRs = new ArrayList<>(Arrays.asList(this.gslp));
//        }
//
//        ArrayList<GameShopLanguageProcessor> lowerGSRs = new ArrayList<>();
//
//        ArrayList<GameShopLanguageProcessor> higherGSRs = new ArrayList<>();
//
//        if (start) {
//            for (int i = 0; i < index; i++) {
//                lowerGSRs.add(oldGSRs.get(i));
//            }
//
//            for (int i = index; i < oldGSRs.size(); i++) {
//                higherGSRs.add(oldGSRs.get(i));
//            }
//            this.gslp = new GameShopLanguageProcessor[(oldGSRs.size()) + (newGSRs.size())];
//
//        } else {
//            this.gslp = new GameShopLanguageProcessor[newGSRs.size()];
//        }
//
//
//
//        int i = 0;
//        if (start) {
//            for (GameShopLanguageProcessor dc : lowerGSRs) {
//
//
//                this.gslp[i] = dc;
//                i++;
//            }
//        }
////        System.out.println(Arrays.toString(oldDrawCalls.toArray()));
//  //      System.out.println(Arrays.toString(newDrawCalls.toArray()));
//
//        for (GameShopLanguageProcessor dc: newGSRs){
//
//            this.gslp[i] = dc;
//            i++;
//        }
//
//        if (start) {
//            for (GameShopLanguageProcessor dc : higherGSRs) {
//
//                this.gslp[i] = dc;
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
//   System.out.println("CONFIRMED");
//    }
//        
//     
//}
