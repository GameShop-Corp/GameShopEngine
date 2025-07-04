/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameShopEngine;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import static org.lwjgl.glfw.GLFW.*;
import org.lwjgl.opengl.GL46;
//import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL46.*;

/**
 *
 * @author gameshopengine
 */
public class GameShopShaderHash {
    
 
    /**
     Name, GlProgram, VertexShader, FragmentShader
     */
    public HashMap<HashMap<String, Integer>, HashMap<String, String>> glShaderProgram;
    
    private static GameShopShaderHash _instance;
    
    private GameShopShaderHash(){
    
        glShaderProgram = new HashMap<HashMap<String, Integer>, HashMap<String, String>>();
    }
    
    public static GameShopShaderHash getInstance(){
    
        if (_instance == null){
        
            _instance = new GameShopShaderHash();
            
        }
        
        return _instance;
        
    }
  
    public void addShader(String name, String vertexShader, String fragmentShader) {
    
        HashMap <String, Integer> shader = new HashMap<String, Integer>();
        HashMap<String, String> vertexAndFragment = new HashMap<String, String>();
        
        int program = glCreateProgram();
        System.out.println(program);
        shader.put(name, program);
        vertexAndFragment.put(fragmentShader, vertexShader);
        glShaderProgram.put(shader, vertexAndFragment);
        //if (shader.get(name) == glCreateProgram());
        
    }
    
    public int getGLShaderProgram(String name){
    
        for (HashMap<String, Integer> shader: glShaderProgram.keySet()){
        
            return shader.get(name);
            
        }
        
        return -1;
    }
    
    public String getVertexShader(String name){
    
         
        HashMap<String, Integer> shaderResult = null;
        
        Integer i = null;
        
       for (HashMap<String, Integer> shader: glShaderProgram.keySet()){
        
            i = shader.get(name);
            
            if (i != null){
            
                shaderResult = shader;
                break;
            }
        }
       
       if (shaderResult == null) {
       
           return "";
       }
       for (String string: glShaderProgram.get(shaderResult).values()){
       
           return string;
           
       }
       
       return "";
//       int j = 0;
//       for (HashMap<String, String> values: glShaderProgram.values()){
//        
//            //return shader.get(name);
//            if (j == i){
//            
//                for (String s: values.values()){
//                
//                    return s;
//                }
//            }
//        }
//       
//       return "";
       
    }
    
    public String getFragmentShader(String name){
         HashMap<String, Integer> shaderResult = null;
        
        Integer i = null;
        
       for (HashMap<String, Integer> shader: glShaderProgram.keySet()){
        
            i = shader.get(name);
            
            if (i != null){
            
                shaderResult = shader;
                break;
            }
        }
       
       if (shaderResult == null) {
       
           return "";
       }
       for (String string: glShaderProgram.get(shaderResult).keySet()){
       
           return string;
           
       }
       
       return "";
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
    
        int shaderId = glCreateShader(GL_VERTEX_SHADER);
        glShaderSource(shaderId, new String(getVertexShader(name).getBytes()));
                glCompileShader(shaderId);
                glAttachShader (getGLShaderProgram(name), shaderId);
                //glDeleteShader(GL_VERTEX_SHADER);
             int shaderIdFrag = glCreateShader(GL_FRAGMENT_SHADER);
                glShaderSource(shaderIdFrag, new String(getFragmentShader(name).getBytes()));
                glCompileShader(shaderIdFrag);
               // glDeleteShader(GL_FRAGMENT_SHADER);
               
              
                
               
                glAttachShader (getGLShaderProgram(name), shaderIdFrag);
                
                glLinkProgram(getGLShaderProgram(name));
                
                
                    if(glGetProgrami(getGLShaderProgram(name),GL_LINK_STATUS)==GL_FALSE)
      {  
        int infoLogSize=glGetProgrami(getGLShaderProgram(name), GL_INFO_LOG_LENGTH); //Get's exact error size rather than using 500
        System.err.println( glGetProgramInfoLog(getGLShaderProgram(name),infoLogSize));
        System.err.println("COULD NOT LINK SHADER");
        System.exit(-1);
      } 
      
      
      
        glValidateProgram(getGLShaderProgram(name));  //Step 3 Validate shader
      if( glGetProgrami(getGLShaderProgram(name), GL_VALIDATE_STATUS)== GL_FALSE)
      {
        int infoLogSize= glGetProgrami(getGLShaderProgram(name), GL_INFO_LOG_LENGTH);  //Get exact error size
        System.err.println( glGetProgramInfoLog(getGLShaderProgram(name),infoLogSize));
        System.err.println("COULD NOT VALIDATE SHADER");
        System.exit(-1);
      } 
      
                glDetachShader(getGLShaderProgram(name), shaderId);
                glDetachShader(getGLShaderProgram(name), shaderIdFrag);
                
                glDeleteShader(shaderId);
                glDeleteShader(shaderIdFrag);
    }
    
    
    
}
