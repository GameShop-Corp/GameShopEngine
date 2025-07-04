///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package GameShopEngine.UI.Characters.AlphaNumeric;
//
//import GameShopEngine.LanguageProcessor.GameShopLanguageProcessor;
//import GameShopEngine.UI.Characters.GameShopCharacter;
//import GameShopEngine.UI.Characters.GameShopCharacterCursor;
////import GameShopEngine.UI.Characters.GameShopCharacterContainer;
//import GameShopEngine.UI.Components.GameShopUIComponent;
//import org.joml.Vector2f;
//
///**
// *
// * @author lynden
// */
//public class GameShopCharacterUpperCaseA extends GameShopCharacter {
//    
//    public GameShopCharacterUpperCaseA(String font, float fontSize, char character, GameShopCharacterCursor gscc) {
//        super(font, fontSize, character, gscc);
//        
//        
//    }
//
//    @Override
//    public void drawCharacter() {
//       // super.drawCharacter(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
//    
//       GameShopLanguageProcessor[] drawGSLP = new GameShopLanguageProcessor[3];
//       drawGSLP[0] = new GameShopLanguageProcessor("drawLine((" + String.valueOf(this.gsc.position.x).replace(".0", "") + ","  + String.valueOf(this.gsc.position.y).replace(".0", "") + ")" + "," + "(" + String.valueOf(this.gsc.position.x + ((this.fontSize/2) + 5)).replace(".0", "") + "," + String.valueOf(this.gsc.position.y + this.fontSize).replace(".0", "") + ")" + "," + String.valueOf(((float)this.fontSize/8)).replace(".0", "") + "," + "(" + String.valueOf(this.gsc.uic.textColor.x).replace(".0", "") + "," +  String.valueOf(this.gsc.uic.textColor.y).replace(".0", "") + ","+ String.valueOf(this.gsc.uic.textColor.z).replace(".0", "") + "," + String.valueOf(this.gsc.uic.textColor.w).replace(".0", "") + ")" + ")");
//       drawGSLP[1] = new GameShopLanguageProcessor("drawLine((" + String.valueOf(this.gsc.position.x + ((this.fontSize/2) - 5f)).replace(".0", "") + ","  + String.valueOf(this.gsc.position.y + this.fontSize).replace(".0", "") + ")" + "," + "(" + String.valueOf(this.gsc.position.x + (this.fontSize)).replace(".0", "") + "," + String.valueOf(this.gsc.position.y).replace(".0", "") + ")" + "," + String.valueOf(((float)this.fontSize/8)).replace(".0", "") + "," + "(" + String.valueOf(this.gsc.uic.textColor.x).replace(".0", "") + "," +  String.valueOf(this.gsc.uic.textColor.y).replace(".0", "") + ","+ String.valueOf(this.gsc.uic.textColor.z).replace(".0", "") + "," + String.valueOf(this.gsc.uic.textColor.w).replace(".0", "") + ")" + ")");
//       drawGSLP[2] = new GameShopLanguageProcessor("drawLine((" + String.valueOf(Math.round(this.gsc.position.x + (this.fontSize/4))).replace(".0", "") + ","  + String.valueOf(Math.round(this.gsc.position.y + ((this.fontSize*2)/5))).replace(".0", "") + ")" + "," + "(" + String.valueOf(Math.round(this.gsc.position.x + ((this.fontSize*3)/5))).replace(".0", "") + "," + String.valueOf(Math.round(this.gsc.position.y + ((this.fontSize*2)/5))).replace(".0", "") + ")" + "," + String.valueOf(((float)this.fontSize/8)).replace(".0", "") + "," + "(" + String.valueOf(this.gsc.uic.textColor.x).replace(".0", "") + "," +  String.valueOf(this.gsc.uic.textColor.y).replace(".0", "") + ","+ String.valueOf(this.gsc.uic.textColor.z).replace(".0", "") + "," + String.valueOf(this.gsc.uic.textColor.w).replace(".0", "") + ")" + ")");
//    
//    
//       //this.gslp = new GameShopLanguageProcessor[3];
//       //this.addGameShopLanguageProcessors(0, drawGSLP);
//       
//       this.gsc.position = new Vector2f(this.gsc.position.x + this.fontSize, this.gsc.position.y);
//       
//    }
//    
//    
//    
//}
