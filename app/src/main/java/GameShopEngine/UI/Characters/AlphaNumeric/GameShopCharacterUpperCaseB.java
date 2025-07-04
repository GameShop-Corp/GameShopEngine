///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package GameShopEngine.UI.Characters.AlphaNumeric;
//
//import GameShopEngine.LanguageProcessor.GameShopLanguageProcessor;
//import GameShopEngine.UI.Characters.GameShopCharacter;
//import GameShopEngine.UI.Characters.GameShopCharacterCursor;
//import org.joml.Vector2f;
//
///**
// *
// * @author lynden
// */
//public class GameShopCharacterUpperCaseB extends GameShopCharacter {
//    
//    public GameShopCharacterUpperCaseB(String font, float fontSize, char character, GameShopCharacterCursor gscc) {
//        super(font, fontSize, character, gscc);
//    }
//
//    @Override
//    public void drawCharacter() {
//       // super.drawCharacter(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
//    
//       Vector2f[] coords = new Vector2f[6];
//       
//       coords[0] = new Vector2f(this.gsc.position);
//       coords[1] = new Vector2f(this.gsc.position.x, this.gsc.position.y + fontSize/2);
//       coords[2] = new Vector2f(this.gsc.position.x, this.gsc.position.y + fontSize);
//       coords[3] = new Vector2f(this.gsc.position.x + fontSize/2, this.gsc.position.y + fontSize);
//       coords[4] = new Vector2f(this.gsc.position.x + fontSize/2, this.gsc.position.y + fontSize/2);
//       coords[5] = new Vector2f(this.gsc.position.x + fontSize/2, this.gsc.position.y);
//               
//       GameShopLanguageProcessor[] drawGSLP = new GameShopLanguageProcessor[3];
//       drawGSLP[0] = new GameShopLanguageProcessor("drawLine((" + String.valueOf(coords[2].x).replace(".0", "") + ","  + String.valueOf(coords[2].y).replace(".0", "") + ")" + "," + "(" + String.valueOf(coords[0].x).replace(".0", "") + "," + String.valueOf(coords[0].y).replace(".0", "") + ")" + "," + String.valueOf((float)this.fontSize/8).replace(".0", "") + "," + "(" + String.valueOf(this.gsc.uic.textColor.x).replace(".0", "") + "," +  String.valueOf(this.gsc.uic.textColor.y).replace(".0", "") + ","+ String.valueOf(this.gsc.uic.textColor.z).replace(".0", "") + "," + String.valueOf(this.gsc.uic.textColor.w).replace(".0", "") + ")" + ")");
//       drawGSLP[1] = new GameShopLanguageProcessor("drawPolyLine((" + String.valueOf(coords[2].x).replace(".0", "") + ","  + String.valueOf(coords[2].y).replace(".0", "") + ",0)" + ",(" + String.valueOf(coords[3].x).replace(".0", "") + ","  + String.valueOf(coords[3].y).replace(".0", "") + ",0)" + ",(" + String.valueOf(coords[4].x).replace(".0", "") + ","  + String.valueOf(coords[4].y).replace(".0", "") + ",0)"  + ",(" + String.valueOf(coords[1].x ).replace(".0", "") + ","  + String.valueOf(coords[1].y).replace(".0", "") + ",0)" + "," + String.valueOf((float)this.fontSize/8).replace(".0", "") + "," + "(" + String.valueOf(this.gsc.uic.textColor.x).replace(".0", "") + "," +  String.valueOf(this.gsc.uic.textColor.y).replace(".0", "") + ","+ String.valueOf(this.gsc.uic.textColor.z).replace(".0", "") + "," + String.valueOf(this.gsc.uic.textColor.w).replace(".0", "") + ")" + ")");
//       // drawGSLP[2] = new GameShopLanguageProcessor("drawPolyLine((" + String.valueOf(coords[2].x).replace(".0", "") + ","  + String.valueOf(coords[2].y).replace(".0", "") + ",0)" + ",(" + String.valueOf(coords[3].x).replace(".0", "") + ","  + String.valueOf(coords[3].y).replace(".0", "") + ",0)" + ",(" + String.valueOf(coords[4].x).replace(".0", "") + ","  + String.valueOf(coords[4].y).replace(".0", "") + ",0)"  + ",(" + String.valueOf(coords[1].x ).replace(".0", "") + ","  + String.valueOf(coords[1].y).replace(".0", "") + ",0)" + "," + String.valueOf((float)this.fontSize/5).replace(".0", "") + "," + "(" + String.valueOf(this.gsc.uic.textColor.x).replace(".0", "") + "," +  String.valueOf(this.gsc.uic.textColor.y).replace(".0", "") + ","+ String.valueOf(this.gsc.uic.textColor.z).replace(".0", "") + "," + String.valueOf(this.gsc.uic.textColor.w).replace(".0", "") + ")" + ")");
//       //drawGSLP[2] = new GameShopLanguageProcessor("drawLine((" + String.valueOf(coords[0].x).replace(".0", "") + ","  + String.valueOf(coords[0].y).replace(".0", "") + ")" + "," + "(" + String.valueOf(coords[2].x).replace(".0", "") + "," + String.valueOf(coords[2].y).replace(".0", "") + ")" + "," + String.valueOf((float)this.fontSize/5).replace(".0", "") + "," + "(" + String.valueOf(this.gsc.uic.textColor.x).replace(".0", "") + "," +  String.valueOf(this.gsc.uic.textColor.y).replace(".0", "") + ","+ String.valueOf(this.gsc.uic.textColor.z).replace(".0", "") + "," + String.valueOf(this.gsc.uic.textColor.w).replace(".0", "") + ")" + ")");
// 
//       drawGSLP[2] = new GameShopLanguageProcessor("drawPolyLine((" + String.valueOf(coords[1].x).replace(".0", "") + ","  + String.valueOf(coords[1].y).replace(".0", "") + ",0)" + ",(" + String.valueOf(coords[4].x).replace(".0", "") + ","  + String.valueOf(coords[4].y).replace(".0", "") + ",0)" + ",(" + String.valueOf(coords[5].x).replace(".0", "") + ","  + String.valueOf(coords[5].y).replace(".0", "") + ",0)"  + ",(" + String.valueOf(coords[0].x ).replace(".0", "") + ","  + String.valueOf(coords[0].y).replace(".0", "") + ",0)" + "," + String.valueOf((float)this.fontSize/8).replace(".0", "") + "," + "(" + String.valueOf(this.gsc.uic.textColor.x).replace(".0", "") + "," +  String.valueOf(this.gsc.uic.textColor.y).replace(".0", "") + ","+ String.valueOf(this.gsc.uic.textColor.z).replace(".0", "") + "," + String.valueOf(this.gsc.uic.textColor.w).replace(".0", "") + ")" + ")");
////       this.addGameShopLanguageProcessors(0, drawGSLP);
//       
//       this.gsc.position = new Vector2f(this.gsc.position.x + this.fontSize/2, this.gsc.position.y);
//       
//    
//    }
//    
//    
//}
