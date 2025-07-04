/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameShopEngine;

/**
 *
 * @author gameshopengine
 */
public class GameShopTypeConverter {

    
       private static GameShopTypeConverter _instance;
       private GameShopTypeConverter(){
       
       }
       
       public static GameShopTypeConverter getInstance(){
       
           if (_instance == null){
           
               _instance = new GameShopTypeConverter();
           }
           
           return _instance;
       }
       
       public com.jme3.math.Vector3f convertVector3FromJOMLToJME(org.joml.Vector3f vector){
       
           return new com.jme3.math.Vector3f(vector.x, vector.y, vector.z);
       }
       
        public com.jme3.math.Vector4f convertVector4FromJOMLToJME(org.joml.Vector4f vector){
       
           return new com.jme3.math.Vector4f(vector.x, vector.y, vector.z, vector.w);
       }
}
