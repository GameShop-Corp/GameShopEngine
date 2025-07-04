/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package GameShopEngine.UI.Characters;
//
//import GameShopEngine.LanguageProcessor.GameShopLanguageProcessor;
//import java.util.HashMap;
//import java.util.Map;
//import org.joml.Vector2f;
//
///**
// *
// * @author lynden
// */
//public class GameShopCharacterFontHash {
//    
//    private static GameShopCharacterFontHash _instance;
//    
//    public HashMap<String, HashMap<Character, GameShopLanguageProcessor[]>> drawCalls;
//    
//    private GameShopCharacterFontHash(){
//    
//        drawCalls = new HashMap<>();
//    }
//    
//    public static GameShopCharacterFontHash getInstance(){
//    
//        if (_instance == null){
//        
//            _instance = new GameShopCharacterFontHash();
//        }
//        
//        return _instance;
//        
//    }
//    
//    public void addGameShopCharacterFont(String font, char c, GameShopLanguageProcessor[] gslp){
//    
//        HashMap <Character, GameShopLanguageProcessor[]> characterValue = new HashMap<>();
//        characterValue.put(c, gslp);
//        if (!drawCalls.isEmpty()){
//        for (Map.Entry<Character, GameShopLanguageProcessor[]> cv: drawCalls.get(font).entrySet()){
//        
//            characterValue.put(cv.getKey(), cv.getValue());
//        }
//        }
//        drawCalls.put(font, characterValue);
//        
//        System.out.println(drawCalls);
////        if (drawCalls.isEmpty()){
////            System.out.println("EMPTY");
////             drawCalls.put(font, characterValue);
////             
////        } else if(!(drawCalls.get(font).containsKey(c))) {
////        
////        
////        drawCalls.put(font, characterValue);
////        
////        }
//        
////        else if (!drawCalls.get(font).containsKey(c)){
////        characterValue.put(c, gslp);
////        
////       // characterValue.putAll(drawCalls.get(font));
////         
////      
////        drawCalls.put(font, characterValue);
////        }
//        
//    }
//    
//    public GameShopLanguageProcessor[] retGSLP(String font, char c){
//    
//        return drawCalls.get(font).get(c);
//    }
//    public void createFontStandard(){
//    
//       GameShopLanguageProcessor[] drawGSLP = new GameShopLanguageProcessor[3];
//       drawGSLP[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}"+ ","  + "${gsc.position.y}"+")" + "," + "("+ "${gsc.position.x + ((fontSize/2) + 5)}"+ "," + "${gsc.position.y + fontSize}"+ ")" + "," + "${fontSize/8}"+ "," + "(" +"${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}"+ ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + (((fontSize)/2) - 5)}"+ ","  + "${gsc.position.y + fontSize}"+")" + "," + "("+ "${gsc.position.x + ((fontSize))}"+ "," + "${gsc.position.y}"+ ")" + "," + "${fontSize/8}"+ "," + "(" +"${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}"+ ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + (((fontSize)/4) + 1)}" + ","  + "${gsc.position.y + ((fontSize * 2)/5)}" + ")" + "," + "(" + "${gsc.position.x + ((fontSize * 3)/5)}" + "," + "${gsc.position.y + ((fontSize * 2)/5)}" + ")" + ","+ "${fontSize/8}"+ "," + "(" +"${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}"+ ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        
//       addGameShopCharacterFont("Standard", 'A', drawGSLP);
//     
//        
//       GameShopLanguageProcessor[] drawGSLP_B = new GameShopLanguageProcessor[3];
//
//       drawGSLP_B[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + ","  + "${gsc.position.y + fontSize}" + ")" + "," + "(" + "${gsc.position.x}" + "," + "${gsc.position.y}"+ ")" + "," + "${fontSize / 8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_B[1] =  new GameShopLanguageProcessor("drawPolyLine((" + "${gsc.position.x}" + ","  + "${gsc.position.y + fontSize}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/2}" + ","  + "${gsc.position.y + fontSize}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/2}" + ","  + "${gsc.position.y + fontSize/2}" + ",${0})"  + ",(" + "${gsc.position.x}" + ","  + "${gsc.position.y + fontSize/2}" + ",${0})" + "," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_B[2] = new GameShopLanguageProcessor("drawPolyLine((" + "${gsc.position.x}" + ","  + "${gsc.position.y + fontSize/2}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/2}" + ","  + "${gsc.position.y + fontSize/2}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/2}" + ","  + "${gsc.position.y}" + ",${0})"  + ",(" + "${gsc.position.x}" + ","  + "${gsc.position.y}" + ",${0})" + "," + "${fontSize/8}"  + "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//
//       addGameShopCharacterFont("Standard", 'B', drawGSLP_B);
//       
//       GameShopLanguageProcessor[] drawGSLP_C = new GameShopLanguageProcessor[1];
//       
//       drawGSLP_C[0] = new GameShopLanguageProcessor("drawPolyLine((" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ",${0})" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ",${0})" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ",${0})" + "," + "${fontSize/8}"  + "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       
//       addGameShopCharacterFont("Standard", 'C', drawGSLP_C);
//       
//       GameShopLanguageProcessor[] drawGSLP_D = new GameShopLanguageProcessor[2];
//       
//       drawGSLP_D[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_D[1] = new GameShopLanguageProcessor("drawPolyLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ",${0})" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ",${0})," + "(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ",${0})" + ",(" +  "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ",${0})," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       
//       addGameShopCharacterFont("Standard", 'D', drawGSLP_D);
//         
//       GameShopLanguageProcessor[] drawGSLP_E = new GameShopLanguageProcessor[4];
//       drawGSLP_E[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_E[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_E[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize/2}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize/2}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_E[3] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//     
//       addGameShopCharacterFont("Standard", 'E', drawGSLP_E);
//       
//       GameShopLanguageProcessor[] drawGSLP_F = new GameShopLanguageProcessor[3];
//     
//       drawGSLP_F[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       //drawGSLP_E[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_F[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize/2}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize/2}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_F[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//     
//       addGameShopCharacterFont("Standard", 'F', drawGSLP_F);
//      
//       GameShopLanguageProcessor[] drawGSLP_G = new GameShopLanguageProcessor[3];
//       
//       drawGSLP_G[0] = new GameShopLanguageProcessor("drawPolyLine((" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ",${0})" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ",${0})" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ",${0})" + "," + "${fontSize/8}"  + "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_G[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize/2}" + ")" + "," + "${fontSize/8}"  + "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_G[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize/2}" + ")" + ",(" + "${gsc.position.x + fontSize/4}" + "," + "${gsc.position.y + fontSize/2}" + ")" +  "," + "${fontSize/8}"  + "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       
//       addGameShopCharacterFont("Standard", 'G', drawGSLP_G);
//       
//       GameShopLanguageProcessor[] drawGSLP_H = new GameShopLanguageProcessor[3];
//       
//       drawGSLP_H[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       //drawGSLP_E[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_H[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize/2}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize/2}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_H[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//     
//       addGameShopCharacterFont("Standard", 'H', drawGSLP_H);
//       
//       GameShopLanguageProcessor[] drawGSLP_I = new GameShopLanguageProcessor[3];
//       
//       drawGSLP_I[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + fontSize/4}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/4}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       //drawGSLP_E[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_I[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_I[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//     
//       addGameShopCharacterFont("Standard", 'I', drawGSLP_I);
//       
//       GameShopLanguageProcessor[] drawGSLP_J  = new GameShopLanguageProcessor[3];
//       
//        drawGSLP_J[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + fontSize/4}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/4}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       //drawGSLP_E[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       //drawGSLP_J[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_J[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")" + ",(" +  "${gsc.position.x + fontSize/4}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_J[2] = new GameShopLanguageProcessor("drawPolyLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize/2}" + ",${0})" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ",${0})" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/4}" + "," + "${gsc.position.y}" + ",${0})" + "," + "${fontSize/8}"  + "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//      
//       addGameShopCharacterFont("Standard", 'J', drawGSLP_J);
//       
//       GameShopLanguageProcessor[] drawGSLP_K  = new GameShopLanguageProcessor[3];
//       
//        drawGSLP_K[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       //drawGSLP_E[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       //drawGSLP_J[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_K[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize/2}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_K[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize/2}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//      
//       
//       //drawGSLP_K[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")" + ",(" +  "${gsc.position.x + fontSize/4}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//      
////drawGSLP_K[2] = new GameShopLanguageProcessor("drawPolyLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize/2}" + ",${0})" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ",${0})" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/4}" + "," + "${gsc.position.y}" + ",${0})" + "," + "${fontSize/8}"  + "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//      
//       addGameShopCharacterFont("Standard", 'K', drawGSLP_K);
//       
//       GameShopLanguageProcessor[] drawGSLP_L  = new GameShopLanguageProcessor[2];
//       
//        drawGSLP_L[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        
//        drawGSLP_L[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//      
//       addGameShopCharacterFont("Standard", 'L', drawGSLP_L);
//       
//       GameShopLanguageProcessor[] drawGSLP_M = new GameShopLanguageProcessor[4];
//       
//       drawGSLP_M[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_M[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")" + ",(" +  "${gsc.position.x + ((fontSize/4) )}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_M[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + ((fontSize/4))}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_M[3] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        
//       addGameShopCharacterFont("Standard", 'M', drawGSLP_M);
//       
//       GameShopLanguageProcessor[] drawGSLP_N = new GameShopLanguageProcessor[3];
//       
//       drawGSLP_N[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_N[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")" + ",(" +  "${gsc.position.x + ((fontSize/2) )}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       //drawGSLP_N[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + ((fontSize/4))}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_N[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        
//       addGameShopCharacterFont("Standard", 'N', drawGSLP_N);
//       
//        GameShopLanguageProcessor[] drawGSLP_O = new GameShopLanguageProcessor[2];
//
//       drawGSLP_O[0] = new GameShopLanguageProcessor("drawPolyLine((" + "${gsc.position.x + fontSize/4}" + "," + "${gsc.position.y}" + ",${0})" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ",${0})" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/4}" + "," + "${gsc.position.y + fontSize}" + ",${0})" + "," + "${fontSize/8}"  + "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_O[1] = new GameShopLanguageProcessor("drawPolyLine((" + "${gsc.position.x + fontSize/4}" + "," + "${gsc.position.y}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/4}" + "," + "${gsc.position.y + fontSize}" + ",${0})" + "," + "${fontSize/8}"  + "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       
//        //drawGSLP_O[0] = new GameShopLanguageProcessor("drawPolyLine")
//        //drawGSLP_N[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        //drawGSLP_N[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")" + ",(" + "${gsc.position.x + ((fontSize/2) )}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        //drawGSLP_N[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + ((fontSize/4))}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        //drawGSLP_N[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ")" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//
//        
//        addGameShopCharacterFont("Standard", 'O', drawGSLP_O);
//        
//        GameShopLanguageProcessor[] drawGSLP_P = new GameShopLanguageProcessor[2];
//        
//        drawGSLP_P[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")" + "," + "(" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + "," + "${fontSize / 8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        drawGSLP_P[1] = new GameShopLanguageProcessor("drawPolyLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize/2}" + ",${0})" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize/2}" + ",${0})" + "," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        //drawGSLP_P[2] = new GameShopLanguageProcessor("drawPolyLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize/2}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize/2}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ",${0})" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ",${0})" + "," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//
//        addGameShopCharacterFont("Standard", 'P', drawGSLP_P);
//        
//        
//        GameShopLanguageProcessor[] drawGSLP_Q = new GameShopLanguageProcessor[3];
//
//        drawGSLP_Q[0] = new GameShopLanguageProcessor("drawPolyLine((" + "${gsc.position.x + fontSize/4}" + "," + "${gsc.position.y}" + ",${0})" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ",${0})" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/4}" + "," + "${gsc.position.y + fontSize}" + ",${0})" + "," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        drawGSLP_Q[1] = new GameShopLanguageProcessor("drawPolyLine((" + "${gsc.position.x + fontSize/4}" + "," + "${gsc.position.y}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/4}" + "," + "${gsc.position.y + fontSize}" + ",${0})" + "," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        drawGSLP_Q[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + fontSize/4}" + "," + "${gsc.position.y + fontSize/2}" + ")" + "," + "(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")" + "," + "${fontSize / 8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       
//        //drawGSLP_O[0] = new GameShopLanguageProcessor("drawPolyLine")
//        //drawGSLP_N[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        //drawGSLP_N[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")" + ",(" + "${gsc.position.x + ((fontSize/2) )}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        //drawGSLP_N[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + ((fontSize/4))}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        //drawGSLP_N[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ")" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        addGameShopCharacterFont("Standard", 'Q', drawGSLP_Q);
//        
//        GameShopLanguageProcessor[] drawGSLP_R = new GameShopLanguageProcessor[3];
//        
//        drawGSLP_R[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")" + "," + "(" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + "," + "${fontSize / 8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        drawGSLP_R[1] = new GameShopLanguageProcessor("drawPolyLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize/2}" + ",${0})" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize/2}" + ",${0})" + "," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        drawGSLP_R[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + fontSize/4}" + "," + "${gsc.position.y + fontSize/2}" + ")" + "," + "(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")" + "," + "${fontSize / 8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       
//        //drawGSLP_P[2] = new GameShopLanguageProcessor("drawPolyLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize/2}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize/2}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ",${0})" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ",${0})" + "," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//
//        addGameShopCharacterFont("Standard", 'R', drawGSLP_R);
//        
//       GameShopLanguageProcessor[] drawGSLP_S = new GameShopLanguageProcessor[2];
//
//       //drawGSLP_B[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + ","  + "${gsc.position.y + fontSize}" + ")" + "," + "(" + "${gsc.position.x}" + "," + "${gsc.position.y}"+ ")" + "," + "${fontSize / 8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_S[0] =  new GameShopLanguageProcessor("drawPolyLine((" + "${gsc.position.x + fontSize/2}" + ","  + "${gsc.position.y + fontSize}" + ",${0})" + ",(" + "${gsc.position.x}" + ","  + "${gsc.position.y + fontSize}" + ",${0})" + ",(" + "${gsc.position.x}" + ","  + "${gsc.position.y + fontSize/2}" + ",${0})"  + ",(" + "${gsc.position.x + fontSize/4}" + ","  + "${gsc.position.y + fontSize/2}" + ",${0})" + "," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       drawGSLP_S[1] = new GameShopLanguageProcessor("drawPolyLine((" + "${gsc.position.x + fontSize/4}" + ","  + "${gsc.position.y + fontSize/2}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/2}" + ","  + "${gsc.position.y + fontSize/2}" + ",${0})" + ",(" + "${gsc.position.x + fontSize/4}" + ","  + "${gsc.position.y}" + ",${0})"  + ",(" + "${gsc.position.x}" + ","  + "${gsc.position.y}" + ",${0})" + "," + "${fontSize/8}"  + "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//
//       addGameShopCharacterFont("Standard", 'S', drawGSLP_S);
//       
//        GameShopLanguageProcessor[] drawGSLP_T = new GameShopLanguageProcessor[2];
//
//        drawGSLP_T[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + fontSize/4}" + "," + "${gsc.position.y}" + ")" + ",(" + "${gsc.position.x + fontSize/4}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        //drawGSLP_E[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        //drawGSLP_T[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        drawGSLP_T[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//
//        addGameShopCharacterFont("Standard", 'T', drawGSLP_T);
//       
//        GameShopLanguageProcessor[] drawGSLP_U = new GameShopLanguageProcessor[3];
//
//        drawGSLP_U[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        //drawGSLP_E[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        drawGSLP_U[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        drawGSLP_U[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//
//        addGameShopCharacterFont("Standard", 'U', drawGSLP_U);
//        
//        GameShopLanguageProcessor[] drawGSLP_V = new GameShopLanguageProcessor[2];
//        
//        drawGSLP_V[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        //drawGSLP_E[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        //drawGSLP_U[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        drawGSLP_V[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")" + ",(" + "${gsc.position.x + fontSize}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//
//        addGameShopCharacterFont("Standard", 'V', drawGSLP_V);
//        
//        GameShopLanguageProcessor[] drawGSLP_W = new GameShopLanguageProcessor[4];
//
//        drawGSLP_W[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + fontSize/4}" + "," + "${gsc.position.y}" + ")" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        //drawGSLP_E[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        //drawGSLP_U[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        drawGSLP_W[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + fontSize/4}" + "," + "${gsc.position.y}" + ")" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        drawGSLP_W[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + (fontSize * 3)/4}" + "," + "${gsc.position.y}" + ")" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        //drawGSLP_E[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        //drawGSLP_U[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        drawGSLP_W[3] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + (fontSize * 3)/4}" + "," + "${gsc.position.y}" + ")" + ",(" + "${gsc.position.x + fontSize}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//
//        addGameShopCharacterFont("Standard", 'W', drawGSLP_W);
//        
//        GameShopLanguageProcessor[] drawGSLP_X = new GameShopLanguageProcessor[2];
//
//        //drawGSLP_X[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        drawGSLP_X[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")" + ",(" + "${gsc.position.x + ((fontSize) )}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        drawGSLP_X[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + fontSize}" + "," + "${gsc.position.y + fontSize}" + ")" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
// 
////drawGSLP_N[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + ((fontSize/4))}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//       // drawGSLP_X[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ")" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//
//        addGameShopCharacterFont("Standard", 'X', drawGSLP_X);
//        
//        GameShopLanguageProcessor[] drawGSLP_Y = new GameShopLanguageProcessor[3];
//
//        //drawGSLP_X[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        drawGSLP_Y[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")" + ",(" + "${gsc.position.x + ((fontSize/2) )}" + "," + "${gsc.position.y + fontSize/2}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        drawGSLP_Y[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + fontSize}" + "," + "${gsc.position.y + fontSize}" + ")" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize/2}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        drawGSLP_Y[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize/2}" + ")" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//
////drawGSLP_N[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + ((fontSize/4))}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        // drawGSLP_X[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ")" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        addGameShopCharacterFont("Standard", 'Y', drawGSLP_Y);
//        
//        GameShopLanguageProcessor[] drawGSLP_Z = new GameShopLanguageProcessor[3];
//
//        //drawGSLP_X[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        drawGSLP_Z[0] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y + fontSize}" + ")" + ",(" + "${gsc.position.x + ((fontSize) )}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        drawGSLP_Z[1] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + fontSize}" + "," + "${gsc.position.y + fontSize}" + ")" + ",(" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        drawGSLP_Z[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x}" + "," + "${gsc.position.y}" + ")" + ",(" + "${gsc.position.x + fontSize}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//
////drawGSLP_N[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + ((fontSize/4))}" + "," + "${gsc.position.y}" + ")" + ",(" +  "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ")," + "${fontSize/8}" +  "," + "(" + "${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}" + ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        // drawGSLP_X[2] = new GameShopLanguageProcessor("drawLine((" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y + fontSize}" + ")" + ",(" + "${gsc.position.x + fontSize/2}" + "," + "${gsc.position.y}" + ")," + "${fontSize/8}" + "," + "(" + "${gsc.uic.textColor.x}" + "," + "${gsc.uic.textColor.y}" + "," + "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")" + ")");
//        addGameShopCharacterFont("Standard", 'Z', drawGSLP_Z);
//        
//        
//    }
//}
