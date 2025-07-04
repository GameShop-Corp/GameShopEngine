/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package GameShopEngine.UI.WordProcessor;
//
//import GameShopEngine.LanguageProcessor.GameShopLanguageProcessor;
////import GameShopEngine.UI.Characters.AlphaNumeric.GameShopCharacterUpperCaseA;
////import GameShopEngine.UI.Characters.AlphaNumeric.GameShopCharacterUpperCaseB;
//import GameShopEngine.UI.Characters.GameShopCharacter;
//import GameShopEngine.UI.Characters.GameShopCharacterCursor;
//import GameShopEngine.UI.Characters.GameShopCharacterFontHash;
//import GameShopEngine.UI.Components.GameShopUIComponent;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import org.joml.Vector2f;
//
///**
// *
// * @author lynden
// */
//public class GameShopWordProcessor {
//    
//    public String word;
//    public GameShopUIComponent uic;
//    public GameShopCharacter[] gsc;
//    public float fontSize;
//    
//    public String font;
//    
//    public GameShopWordProcessor(String word, String font, float fontSize, GameShopUIComponent uic){
//    
//        this.word = word;
//        this.uic = uic;
//        this.gsc = new GameShopCharacter[1];
//        this.fontSize = fontSize;
//        this.font = font;
//    }
//    
//    public void process(){
//         
//           
//
//                    //System.out.print("NOTADDED");
//
//                int i = 0;
//                
//             
//                
//            GameShopCharacterCursor gscc = new GameShopCharacterCursor(this.uic);
//               gscc.setStartPosition(this);
//               Vector2f[] chars = new Vector2f[this.word.length()];
//               
//                 int l =  gscc.position.length - 1;
//                float x =  gscc.position[l].x;
//                float y =  gscc.position[l].y;
//                int cc = 0;
//                
//                float lastX = 0;
//                float lastY = 0;
//                
//               for (char c: this.word.toCharArray()){
//               
//                   if (cc == 0){
//                   chars[cc] = new Vector2f(x , y);
//                   } else {
//                   
//                       //if (c == 'A' || c == 'B' ){
//                       chars[cc] = new Vector2f(chars[cc - 1].x + (fontSize*4)/5, chars[cc - 1].y);
//                      // } else {
//                       //chars[cc] = new Vector2f(chars[cc - 1].x + (fontSize/2), chars[cc - 1].y);
//                     // }
//                      }
//                
//                   cc++;
//                    
////                     System.out.println("L " + l);
////                     System.out.println("X " + x);
////                     System.out.println(fontSize);
//                }
//            
//                gscc.addPosition(l, chars);
//               
//               
//                GameShopCharacter[] gsChars = new GameShopCharacter[this.word.length()];
//        for (char c: this.word.toCharArray()){
//         
//            if (GameShopCharacterFontHash.getInstance().drawCalls.containsKey(this.font) && GameShopCharacterFontHash.getInstance().drawCalls.get(this.font).containsKey(c)){
//            System.out.println(c);
//                gsChars[i] = new GameShopCharacter(this.font, this.fontSize, c, gscc);
////                GameShopCharacter gsChar = new GameShopCharacter(this.font, this.fontSize, c, gscc);
//                GameShopLanguageProcessor[] gslp1 = new GameShopLanguageProcessor[GameShopCharacterFontHash.getInstance().retGSLP(this.font, c).length];
//                       
//                int m = 0;
//                for (GameShopLanguageProcessor gs: GameShopCharacterFontHash.getInstance().retGSLP(this.font, c)){
//                
//                    gslp1[m] = new GameShopLanguageProcessor(gs);
//                    m++;
//                }
//                gsChars[i].addGameShopLanguageProcessors(gsChars[i].gslp.length - 1, gslp1);
//                
//                
//                int j = 0;
//                while (j < gsChars[i].gslp.length){
//                
//                    int size = GameShopCharacterFontHash.getInstance().drawCalls.get(this.font).get(c).length;
//                    
//                    System.out.println("J " + size);
//                    for (int s = j; s < j + size; s++){
//                    
//                        gsChars[i].gslp[s].process();
//                        gsChars[i].gslp[s].processArgs(gscc, (int)this.fontSize, i);
//                       // gsChar.gslp[s].lock = true;
//                        System.out.println("FINAL " + gsChars[i].gslp[s]);
//                         
//                    }
//                    
//                    for (int s = j; s < j + size; s++){
//                    
////                        gsChar.gslp[s].process();
////                        gsChar.gslp[s].processArgs(gscc, (int)this.fontSize, i);
//                        gsChars[i].gslp[s].lock = true;
//                        //System.out.println("FINAL " + gsChar.gslp[s]);
//                         
//                    }
//                    
//                                  
//                    //try {
//                    //GameShopCharacterCursor clone =  new GameShopCharacterCursor(uic);
//                    //clone.position = new Vector2f(gsChar.gsc.position);
//                   System.out.println("I " + i);
////                    gslp.process();
////                    gslp.processArgs(gscc, (int)this.fontSize, i);
//                    
//                //System.out.println("FINAL " + gslp);
//              
//                    j += size;
//                }
//  
//           
////                GameShopCharacter[] gssc = new GameShopCharacter[1];
////                gssc[0] = gsChar;
//               
//                
//                //System.out.println("ADDED" + Arrays.asList(gsChar.gslp));
//                
//            }
//            
//            //uic.gscc.
//           i++;
//             //uic.gscc.position = new Vector2f(uic.gscc.position.x + fontSize, uic.gscc.position.y); 
//        }
//        
//        this.addGameShopCharacters(this.gsc.length - 1, gsChars);
//            
//        
////        for (GameShopCharacter c: this.gsc){
////        
////            for (GameShopLanguageProcessor gslp: c.gslp){
////            System.out.println("GAMESHOPLP " + gslp);
////            }
////        }
//         
//    }
//    
//    /*
//    public void process(){
//    
//        ArrayList<GameShopCharacter> gsch = new ArrayList<GameShopCharacter>();
//        
//        //int i = 0;
//        //this.gsc = new GameShopCharacter[this.word.toCharArray().length];
//        for (int c = 0; c < this.word.length(); c++){
//        
//            System.out.println(this.word.charAt(c));
//           
//            if (this.word.charAt(c) == 'A'){
//            
//                if (c == 0){
//            System.out.println("IN");
//                this.uic.gscc.setStartPosition(new GameShopCharacterUpperCaseA("", fontSize, 'A', uic.gscc));
//            }
//                gsch.add(new GameShopCharacterUpperCaseA("", fontSize, 'A', uic.gscc));
//               // this.addGameShopCharacters(gsc.length - 1, new GameShopCharacterUpperCaseA[]{ new GameShopCharacterUpperCaseA("", fontSize, 'A', uic.gscc)});
//            } 
//            else if (this.word.charAt(c) == 'B') {
//             
//                if (c == 0){
//            System.out.println("IN");
//                this.uic.gscc.setStartPosition(new GameShopCharacterUpperCaseB("", fontSize, 'B', uic.gscc));
//            }
//                gsch.add(new GameShopCharacterUpperCaseB("", fontSize, 'B', uic.gscc));
//               // this.addGameShopCharacters(gsc.length - 1, new GameShopCharacterUpperCaseB[]{ new GameShopCharacterUpperCaseB("", fontSize, 'B', uic.gscc)});
//           
//            }
//            
//            
////            c++;
//            System.out.println("DONE");
//        }
//        
//         
//            this.addGameShopCharacters(gsc.length - 1, (gsch.toArray((GameShopCharacter[]) new GameShopCharacter[0])));
//           
//        
//        for (GameShopCharacter c: this.gsc){
//        
//            c.drawCharacter();
//        }
////          for (int c = 0; c < this.word.length(); c++){
////         
////          }
//    }
//    
//    */
//    
//    
//    public void addGameShopCharacters(int index, GameShopCharacter[] gsc){
//    
//       // public void addDrawCalls(int index, String[] drawCalls){
//
//        boolean start = this.gsc[0] != null;
//
//        ArrayList<GameShopCharacter> newGSRs = new ArrayList<>(Arrays.asList(gsc));
//
//        ArrayList<GameShopCharacter> oldGSRs = null;
//
//        if (start) {
//            oldGSRs = new ArrayList<>(Arrays.asList(this.gsc));
//        }
//
//        ArrayList<GameShopCharacter> lowerGSRs = new ArrayList<>();
//
//        ArrayList<GameShopCharacter> higherGSRs = new ArrayList<>();
//
//        if (start) {
//            for (int i = 0; i < index; i++) {
//                lowerGSRs.add(oldGSRs.get(i));
//            }
//
//            for (int i = index; i < oldGSRs.size(); i++) {
//                higherGSRs.add(oldGSRs.get(i));
//            }
//            this.gsc = new GameShopCharacter[(oldGSRs.size()) + (newGSRs.size())];
//
//        } else {
//            this.gsc = new GameShopCharacter[newGSRs.size()];
//        }
//
//
//
//        int i = 0;
//        if (start) {
//            for (GameShopCharacter dc : lowerGSRs) {
//
//
//                this.gsc[i] = dc;
//                i++;
//            }
//        }
////        System.out.println(Arrays.toString(oldDrawCalls.toArray()));
//  //      System.out.println(Arrays.toString(newDrawCalls.toArray()));
//
//        for (GameShopCharacter dc: newGSRs){
//
//            this.gsc[i] = dc;
//            i++;
//        }
//
//        if (start) {
//            for (GameShopCharacter dc : higherGSRs) {
//
//                this.gsc[i] = dc;
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
//}
