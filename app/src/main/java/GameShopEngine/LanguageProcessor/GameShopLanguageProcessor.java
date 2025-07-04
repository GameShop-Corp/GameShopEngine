/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package GameShopEngine.LanguageProcessor;
//
//import GameShopEngine.UI.Characters.GameShopCharacterCursor;
//import java.util.Arrays;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.script.ScriptEngine;
//import javax.script.ScriptEngineManager;
//import javax.script.ScriptException;
//import net.objecthunter.exp4j.ExpressionBuilder;
//import org.joml.Vector2f;
//
///**
// *
// * @author lynden
// */
//public class GameShopLanguageProcessor {
//    
//    public String command;
//    
//    //object reference????
//    
//    public String methodName;
//    public String[] args;
//    public boolean lock;
//    
//    public GameShopLanguageProcessor(String command){
//    
//        this.command = command;
//        this.methodName = "";
//        this.args = new String[1];
//        this.args[0] = "";
//        
//    }
//    
//    public GameShopLanguageProcessor(GameShopLanguageProcessor gslp){
//    
//        this.command =  gslp.command;
//        this.args = new String[gslp.args.length];
//       
//        int i = 0;
//        for (String arg: gslp.args){
//        
//            this.args[i] = arg;
//            i++;
//        }
//        
//        this.methodName = gslp.methodName;
//        this.lock = gslp.lock;
//        
//    }
//    
//    
//    public void process(){
//    
//        
//        int i = 0;
//        
//        int parenthesisCount = 0;
//        
//        int argCount = 0;
//        
//        for (char c: this.command.toCharArray()){
//        
//            if (c == '('){
//            
//                parenthesisCount++;
//                i++;
//                if (parenthesisCount == 1){
//                argCount++;
//                }
//                continue;
//            }
//            if (i > 0){
//            
//                  if (parenthesisCount == 1){
//                
//                    if (c == ','){
//                    
//                        argCount++;
//                    }
//                }
//                  
//                if (c == '('){
//                
//                    parenthesisCount++;
//                    
//                }
//                
//                if (c == ')'){
//                
//                    parenthesisCount--;
//                }
//                
//              
//            }
//        }
//        
//        //System.out.println(argCount);
//        this.args = new String[argCount];
//        
//        for (int arg = 0; arg < this.args.length; arg++){
//        
//            this.args[arg] = "";
//        }
//        
//        i = 0;
//        parenthesisCount = 0;
//        
//        boolean skip = false;
//        
//        if (!this.methodName.equals("")){
//        
//            skip = true;
//        }
//        
//        for (char c: this.command.toCharArray()){
//        
//            if (c == '(' || c == '['){
//            
//                parenthesisCount++;
//                
//                if (i == 0){
//                i++;
//                }
//                //continue;
//            }
//            
//            if (c == ')' || c == ']'){
//                parenthesisCount--;
//                //i++;
//               // continue;
//            }
//            if (i == 0){
//            
//                if (!skip){
//                this.methodName += c;
//                }
//            } else {
//            
//                 if (parenthesisCount == 1){
//                
//                    if (c == ','){
//                    
//                        i++;
//                        continue;
//                    }  
//                }
//                
//                this.args[i - 1] += c;
//                
//               
//            }
//             
//        }
//        //this.args.
//        //System.out.println(this.methodName + Arrays.toString(args));
//       // return new String[1];
//    System.out.println("toString " + this);
//    }
//    
//    public String[] parseArg(String arg){
//    
//        return arg.split(",");
//    }
//    
//    public void processArgs(GameShopCharacterCursor gsc, int fontSize, int it){
//    
//        if (!lock){
//            //lock = true;
//        for (int i = 0; i < this.args.length; i++){
//            
//            this.args[i] = this.args[i].replace("gsc.position.x", "" + (int)gsc.position[it].x);
//            this.args[i] = this.args[i].replace("gsc.position.y", "" + (int)gsc.position[it].y);
//            this.args[i] = this.args[i].replace("fontSize", "" + (int)fontSize);
//            this.args[i] = this.args[i].replace("gsc.uic.textColor.x", "" + (int)gsc.uic.textColor.x);
//            this.args[i] = this.args[i].replace("gsc.uic.textColor.y", "" + (int)gsc.uic.textColor.y);
//            this.args[i] = this.args[i].replace("gsc.uic.textColor.z", "" + (int)gsc.uic.textColor.z);
//            this.args[i] = this.args[i].replace("gsc.uic.textColor.w", "" + (int)gsc.uic.textColor.w);
//           
//            
//            String[] parse = parseArg(this.args[i]);
//            
//            for (int j = 0; j < parse.length; j++){
//            
//                parse[j] = evaluate(parse[j]);
//            }
//            
//            this.args[i] = Arrays.toString(parse);
//// "(" +"${gsc.uic.textColor.x}" + "," +  "${gsc.uic.textColor.y}"+ ","+ "${gsc.uic.textColor.z}" + "," + "${gsc.uic.textColor.w}" + ")"
//       
////            if (i < this.args.length - 1){
////           this.args[i] = evaluate(this.args[i]);
////            } else {
////            String[] parseArgs = this.parseArg(this.args[i]);
////            
////            for (int j = 0; j < parseArgs.length; j++){
////            
////                parseArgs[j] = evaluate(parseArgs[j]);
////            }
////            
////            this.args[i] = parseArgs[0] + "," + parseArgs[1] + "," + parseArgs[2] + "," + parseArgs[3];
////            }
//         }
//        //gsc.position = new Vector2f(gsc.position.x + fontSize, gsc.position.y);
//       
//        System.out.println("PARSEARGS" + this.methodName + Arrays.toString(args));
//        }
//    }
//    
//    public String evaluate(String input){
//    
////            ScriptEngineManager manager = new ScriptEngineManager();
////        ScriptEngine engine = manager.getEngineByName("JavaScript"); // Or other language names
//
//        boolean inClause = false;
//        
//        boolean evaluate = false;
//        
//        String eval = "";
//        
//        //boolean outClause = false;
//        
//        for (char c: input.toCharArray()){
//        
//            if (c == '$'){
//            
//                inClause = true;
//            }
//            
//            if (inClause){
//            
//                if (c == '{'){
//                
//                    evaluate = true;
//                    
//                } 
//                
//                if (evaluate){
//                    
//                     if (c == '}'){
//                
//                    
//                    inClause = false;
//                    //eval = "";
//                    //continue;
//                } 
//                     
//                    eval += c;
//                    
//                }
//                
//            }
//                
//                if (evaluate && !inClause){
//                
//                    eval = eval.replace("$", "");
//                    eval = eval.replace("{", "");
//                    eval = eval.replace("}", "");
//                    
//                    //System.out.println("EQ" + eval);
//                   // System.out.println("INTEGER " + new ExpressionBuilder(eval).build().evaluate());
//                
//                    eval = "" +(int)new ExpressionBuilder(eval).build().evaluate();
////                    if (eval.equals("")){
////                    
////                        eval = "0";
////                    }
//                    break;
//                    //evaluate = false;
//                }
//        }
//        return eval;
//    }
//    
//    @Override
//    public String toString(){
//    
//        return this.methodName + Arrays.toString(args);
//     
//    }
//}
