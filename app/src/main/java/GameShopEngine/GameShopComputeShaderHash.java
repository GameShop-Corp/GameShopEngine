/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameShopEngine;

import java.util.HashMap;
import static org.lwjgl.opengl.GL11.GL_FALSE;
import static org.lwjgl.opengl.GL20.GL_FRAGMENT_SHADER;
import static org.lwjgl.opengl.GL20.GL_INFO_LOG_LENGTH;
import static org.lwjgl.opengl.GL20.GL_LINK_STATUS;
import static org.lwjgl.opengl.GL20.GL_VALIDATE_STATUS;
import static org.lwjgl.opengl.GL20.GL_VERTEX_SHADER;
import static org.lwjgl.opengl.GL20.glAttachShader;
import static org.lwjgl.opengl.GL20.glCompileShader;
import static org.lwjgl.opengl.GL20.glCreateProgram;
import static org.lwjgl.opengl.GL20.glCreateShader;
import static org.lwjgl.opengl.GL20.glDeleteShader;
import static org.lwjgl.opengl.GL20.glDetachShader;
import static org.lwjgl.opengl.GL20.glGetProgramInfoLog;
import static org.lwjgl.opengl.GL20.glGetProgrami;
import static org.lwjgl.opengl.GL20.glLinkProgram;
import static org.lwjgl.opengl.GL20.glShaderSource;
import static org.lwjgl.opengl.GL20.glValidateProgram;
import static org.lwjgl.opengl.GL43.GL_COMPUTE_SHADER;

/**
 *
 * @author gameshopengine
 */
public class GameShopComputeShaderHash {
    
    private static GameShopComputeShaderHash _instance;
    public HashMap<HashMap<String, Integer>, HashMap<String, String>> glShaderProgram;

    private GameShopComputeShaderHash(){
    
        glShaderProgram = new HashMap<>();
        
    }
    
    public static GameShopComputeShaderHash getInstance(){
    
        if (_instance == null){
        
            _instance = new GameShopComputeShaderHash();
        }
        
        return _instance;
    }
    
     public void addShader(String name, String computeShader) {
    
        HashMap <String, Integer> shader = new HashMap<String, Integer>();
        HashMap<String, String> nameAndComputeShader = new HashMap<String, String>();
        
        int program = glCreateProgram();
        System.out.println(program);
        shader.put(name, program);
        nameAndComputeShader.put(name, computeShader);
        glShaderProgram.put(shader, nameAndComputeShader);
        //if (shader.get(name) == glCreateProgram());
        
    }
     
    public int getGLShaderProgram(String name){
    
        for (HashMap<String, Integer> shader: glShaderProgram.keySet()){
        
            return shader.get(name);
            
        }
        
        return -1;
    }
    
     public String getComputeShader(String name){
         HashMap<String, Integer> shaderResult = null;
        
        //Integer i = null;
        
       for (HashMap<String, String> shader: glShaderProgram.values()){
        
            return shader.get(name);
            
//            if (i != null){
//            
//                shaderResult = shader;
//                break;
//            }
        }
       
       return "";
//       if (shaderResult == null) {
//       
//        ";
//       }
//       for (String string: glShaderProgram.get(shaderResult).keySet()){
//       
//           return string;
//           
//       }
//       
//       return "";   return "
//        int i = 0;
//        
//       for (HashMap<String, Integer> shader: glShaderProgram.keySet()){
//        
//            i = shader.get(name);
//            
//        }
//       
//       int j = 0;
//       for (HashMap<String, String> values: glShaderProgram.values()){
//        
//            //return shader.get(name);
//            if (j == i){
//            
//                for (String s: values.keySet()){
//                
//                    return s;
//                }
//            }
//        }
//       
//       return "";
    }
     
    public void compileShader(String name){
    
        int compute;
        // compute shader
        compute = glCreateShader(GL_COMPUTE_SHADER);
        glShaderSource(compute, new String(getComputeShader(name).getBytes()));
        glCompileShader(compute);
        //checkCompileErrors(compute, "COMPUTE");

        // shader Program
        Integer ID = getGLShaderProgram(name);
        glAttachShader(ID, compute);
        glLinkProgram(ID);
        //checkCompileErrors(ID, "PROGRAM");
    }
    
    
    
    
}
